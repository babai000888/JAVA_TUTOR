# Индексы

## Зачем

Представим простейшую базу данных в виде телефонного справочника. Перед нами встает задача найти телефон пользователя. Для решения задачи мы не перебираем каждую запись, а пользуемся оглавлением, где по имени указана страница, содержащая информацию об искомом человеке. Так вот это оглавление - это и есть по сути один из вариантов *индекса*.

Из этого следует, что индесы необходимы для работы:

* Поиска `where`.
* Объединения таблиц с помощью `join`. Однако надо помнить, что типы сравниваемых полей должны быть одни и те же. Если для сравнения будет необходимо преобразование типов, то индексы использоваться не будут.
* Поиск `max` и `min` значений для ключевых полей.
* Сортировка и группировка таблиц (`order by`, `group by`).
* Извлечения данных не из таблицы с данными, а из индексного файла. Это возможно, если все извлекаемые поля проиндексированы.

Последний пункт возможен, так как в индексе хранятся значения проиндексированных полей и ссылка на саму запись в БД.
Вся запись целиком в индексе не хранится.

Рассмотрим следующую таблицу:

```sql
create table people(
    first_name text not null,
    last_name  text not null,
    dob        timestamp not null,
    gender     int not null
);
```

Если индекс составлен по фамилии и имени, то в индексе хранится значение фамилии и имени, но не остальных полей.
Поэтому при извлечении имени с фамилией значения можно взять сразу из индекса:

```sql
select first_name, last_name
from people
```

Однако если добавить к выборке не индексируемые поля, например, `gender`, то все данные будут браться из таблицы.

## Виды индексов

### Btree

В основе реализации индекса btree лежит B-дерево, сбалансированное дерево.
Необходимо, чтобы поле имело возможность сравнения на больше/меньше и равенство.

Тип индекса по-умолчанию.

Пример создания:

```sql
create table people(
    first_name      text not null,
    last_name       text not null,
    date_of_birth   timestamp not null,
    gender          int not null
);

create index idx_people_name
on people using btree
(last_name, first_name, date_of_birth);
```

Использовать:

* Поиск по полному значению.
* Поиск по левому префиксу.
* Поиск по диапазону.
* Запросы по индексу (например, происходит поиск по дате рождения). ?????

Не использовать:

* Поиск без использования левой части индекса.
    Если требуется получить все данные по людям определенной даты рождения, то `idx_people_name` индекс не поможет.
* Нельзя пропускать столбцы в индексе при поиске.
    Если знаем фамилию, знаем дату рождения и начнем поиск человека по ним, то `idx_people_name` индекс поможет только для поиска по фамилии.
    Потому что в запросе мы пропустили поля левой части индекса.

### Hash

```sql
create temporary table testhash(
    fname text not null,
    lname  text not null
);

create index idx_testhash_fname
on testhash using hash(fname);
```

Суть `hash` индекса проста: по ключу считается `hash` и в индексе хранится информация на каких записях информация с таким `hash`-ом встречается.

Важно помнить, что `hash` индексы **не пишутся** в журнал транзакций, т.е такие индексы **не транзакционны**.
Поэтому для обычных таблиц этот индекс практически не применяется. Однако, он может быть (и используется) для временных таблиц, так как они существуют в рамках сессии, при джоинах таблиц и т.д.

| fname         | lname           |
| ------------- |:---------------:|
| Arjen         | Lentz           |
| Baron         | Shwartz         |
| Peter         | Zaitsev         |
| Vadim         | Tkachenko       |

```
f(Arjen) = 2323
f(Baron) = 7437
f(Peter) = 8784
f(Vadim) = 2458
```

| Ячейка        | Значение                |
| ------------- |:-----------------------:|
| 2323          | Указатель на строку 1   |
| 7437          | Указатель на строку 4   |
| 8784          | Указатель на строку 2   |
| 2458          | Указатель на строку 3   |

Хэши дают коллизию, поэтому если мы ищем пользователя с именем `Peter`:
```sql
select lname from testhash where fname = `Peter`
```

То, мы посчитали хэш, нашли все строчки, которые соответствуют этому хэшу и должны прочитать сами записи и убедиться, что там именно это значение.
Из этого следует, что мы не можем использовать данный индекс без использования самих данных.

Особенности:

* Нельзя использовать данные в индексе, чтобы избежать чтения строк.
* Хэш-индексы не поддерживают поиск по частичному ключу.
* Если коллизий нет, то высокая производительность .
* Если количество коллизий велико, то некоторые операции с индексом могут быть медленными.
* Не транзакционен.

### GiST 

Есть некоторые типы данных, которые не ложатся на btree и hash индексы. Например, найти все города, лежащие в области какого-то полигона.

```sql
create table city(
    id      serial primary key,
    name    text not null,
    area    polygon
);

create index idx_city_area
on city using gist(area);
```

GiST индексы позволяют индексировать значения, которые могут между собой как-то перекрываться.
Часто используются для географических типов данных.

### GIN

Инвертированный индекс - 

```sql
create table movies(
    id      serial primary key,
    title   text not null,
    genres  text[] not null
);

create index idx_movies_genres
on movies using gin(genres);
```

Поиск по таким полям, как json, массивы и прочее.

### Битовый индекс

Скрыт от пользователя.


### Частичный индекс

### Функциональный индекс

Не по значению поля, а от f(значения поля).

### Кластерный индекс

Данные в таблице никак не упорядочены. По-умолчанию данные в таблице не упорядочены. Однако есть возможность упорядочить данные по индексу.
Кластерный индекс (или кластерный ключ) сохраняет не только значения колонки в отсортированном виде, а и данные всей строки. 
В таблице может быть только один кластерный индекс (или кластерный ключ).


```sql
cluster movies using movies_pkey;
```

При этом, кластерный индекс устанавливается только на существующие данные, как только в таблицу добавятся еще какие-то строки (или удалятся) необходимо будет снова попросить бд на таблице отсортировать данные:

```sql
cluster movies;
clusterl
```


## Минусы индексирования

Индексы хранятся на диске.
Запись и чтение, актуализация данных индекса - это ресурсы.
Увеличение числа индексов замедляет операции добавления, обновления, удаления строк таблицы.

Индексы занимают дополнительный объем памяти, соответственно меньшая часть БД может уместиться в кэше.
Дополнительные затраты на сопроводение индекса могут уменьшить производительность.



