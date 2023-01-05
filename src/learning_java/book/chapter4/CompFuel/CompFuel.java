package learning_java.book.chapter4.CompFuel;/*
 * Программа денстрирующая принцип создания класса c 2-мя методами возвращающими значение.
 *
 * @author Vitaliy Magnum
 */

/**
 * Класс описывающий объект Vehicle содержащем два метода,
 * в котором производится расчет объма топлива, необходимого
 * транспортному средству для преодоления заданного расстояния.
 */
class Vehicle {
    int passengers; // Количество пассажиров
    int fuelcap;    // Емкость топливного бака
    int mpg;        // потребление топлива в милях на галон

    // Метод расчитывающий и возвращающий значение дальности поездки
    int range() {
    	return mpg * fuelcap;
    }

    // Метод расчитывающий объм топлива для нужно расстояния
    double fuelneeded (int miles) {
    	return (double) miles / mpg;
    }
}

/**
 * Класс в котором создается два объекта класса Vehicle
 * и используется его методы для расчета дальности поездки,
 * и необходимое для нее количество топлива.
 */
class CompFuel {
	public static void main(String[] args) {
		Vehicle minivan = new Vehicle();
		Vehicle sportcar = new Vehicle();

		double gallons;
		int dist = 252;

		// Присваиваем значения полям в объекте minivan
		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;

		// Присваиваем значения полям в объекте sportcar
		sportcar.passengers = 2;
		sportcar.fuelcap = 14;
		sportcar.mpg = 12;

		// Получаем количество топлива необходимого для поездки мини-фургона
		gallons = minivan.fuelneeded(dist);

		// Выводим на экран сообщение о количестве необходимого топлива для мини-фургона
		System.out.println("Для преодоления " + dist +
			" миль мини-фургону требуется " + gallons +
			" галлонов топлива.");

		// Получаем количество топлива необходимого для поездки спортивного автомобиля
		gallons = sportcar.fuelneeded(dist);

		// Выводим на экран сообщение о количестве необходимого топлива для спортивного автомобиля
		System.out.println("Для преодоления " + dist +
			" миль мини-фургону требуется " + gallons +
			" галлонов топлива.");
	}
}
