package learning_java.book.chapter1.Exercise1_1;

/*
	Упражнение 1.1
	Программа перевода галлонов в литры.
	Присвойте файлу с исходным кодом имя GalToLit.java
 */
class GalToLit {
	public static void main(String[] args) {
		double gallons; //в этой переменной хранится значение,
						//выражающее объем жидкости в галлонах
		double liters; //в этой переменной хранится значение,
						//выражающее объем жидкости в литрах

		gallons = 10; //начальное значение соотвествует 10 галлонам
		liters = gallons * 3.7854; //перевести в литры

		System.out.println(gallons + " галлонам соотвествует " + liters + " литров");
	}
}
