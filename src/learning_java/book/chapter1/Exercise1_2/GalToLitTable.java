package learning_java.book.chapter1.Exercise1_2;

/*
	Упражнение 1.2
	Эта программа отображает таблицу перевода галлонов в литры.
	Присвойте файлу с исходным кодом имя GalToLitTable.java
 */
class GalToLitTable {
	public static void main(String[] args) {
		double gallons, liters;
		int counter;

		counter = 0; //Счетчик который инициализируется нулевым значением

		for (gallons = 1; gallons <= 100; gallons++) {
			liters = gallons * 3.7854;

			System.out.println(gallons + " галлонам соотвествует" + liters + " литра.");

			counter++; //Увеличиваем счетчик строк на 1 на каждой итерации цикла

			if (counter == 10) { //Если значение счетчика равно 10, вывести пустую строку
				System.out.println();
				counter = 0; //Сбросить счетчик строк
			}
		}
	}
}
