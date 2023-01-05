package learning_java.book.chapter4.ParmConsDemo;/*
 * Программа демонстрирующая создание класа с конструктором принимающим параметры.
 *
 * @author Vitaly Magnum
 */

/**
 * Клас содержищий в себе конструктор MyClass принимающий 1 параметр.
 */
class MyClass {
	int x;

	MyClass(int i) {
		x = i;
	}
}

/**
 * Клас в котором демонстрируется как именно проходит обращение к конструктору MyClass.
 */
class ParmConsDemo {
	public static void main(String[] args) {
		MyClass t1 = new MyClass(10); //Задаем начальное значение переменной x для первого объекта
		MyClass t2 = new MyClass(88); //Задаем начальное значение переменной x для второго объекта

        // Выводим на экран переменную x обратиший к ней через конструктор
		System.out.println(t1.x + " " + t2.x);
	}
}
