# Java Базовый Курс

## Занятие 4

Четвертое занятие в рамках `Java` курса.

В [прошлый раз](./third.md) мы затронули следующие темы:

* Интерфейсы
* Абстрактные классы
* Различия между ними, когда что применять

В рамках этого занятия мы обсудим такую тему как исключения или `exception` в `Java`.

## Введение

В начале проведем некоторую проверку знаний по прошлому материалу.

---

**Вопрос**:

Может ли абстрактный класс быть `final`?

**Ответ**:

Нет, не может.

Ключевое слово `final` означает, что класс на вершине иерархии, у него не может быть наследников.
Абстрактный класс без наследников не имеет никакого смысла.

---

**Вопрос**:

Может ли быть абстрактный класс без абстрактных методов?

**Ответ**:

Да, может.

---

**Вопрос**:

Что такое интерфейс-маркер?

**Ответ**:

Интерфейс может быть пустым, т.е. не содержать никаких объявлений, как в примере выше.
Такие интерфейсы называются `интерфейсами-маркерами`.

В качестве примера можно посмотреть такие интерфейсы как `java.io.Serializable`, `java.lang.Cloneable` и `java.util.EventListener`.

Как следует из названия, задача интерфейса-маркера сообщить о наличии определённого поведения у объектов класса, помеченного таким интерфейсом.

---

## Исключения

> Начав заниматься программированием, мы, к своему удивлению, обнаружили, что не так уж просто заставить программы делать задуманное. Я могу точно вспомнить момент, когда я понял, что большая часть моей жизни с этих пор будет посвящена поиску ошибок в собственных программах.
> 
> (c) Морис Уилкс.

Читаем все про [исключения](../exceptions/exceptions.md).

## Практика

### Итератор на файл

Напишите реализацию интерфейса для обхода файла по строкам:

```java
package ru.mipt.collections;

public interface FileIterator {
    /**
     * Метод возвращает true, если в файле есть следующая строчка.
     * @return возвращет true - если в файле есть следующая строка, иначе - false.
     */
    boolean hasNext();

    /**
     * Метод возвращает следующую строку из файла.
     * @return возвращет строка из файла.
     */
    String next();
}
```

Пример использования вашей реализации, где все содержимое файла должно быть выведено по строчно в консоль:

```java
public class Example {
    public static void main(String[] args) {
        FileIterator fit = new MyFileIterator("file.txt"); // MyFileIterator - ваша написанная реализация

        while(fit.hasNext()) {
            System.out.println(fit.next());
        }
    }
}
```

## Полезные ссылки

1. [Вопросы к собеседованию по коллекциям](https://habr.com/ru/post/162017/)
2. [Лекторий ФИВТ, Java (3 курс) - лектор Пономарёв. Java #4. Исключения, JUnit, Lombok, строки](https://www.youtube.com/watch?v=YgY2pksf3k8&list=PL4_hYwCyhAvblhTbPQmOF4b3kilWSpOjU&index=4)
