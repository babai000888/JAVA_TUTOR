package learning_java.book.chapter5.HomeWork4;

/*
 * Домашнее задание №4.
 * Программа демонстрирующая нахождение минимального значения в массиве с помощью расширеного цикла for.
 * @author Magnum
 * @version 3
 */
class HomeWorkMinMax {
	public static void main(String[] args) {
		// Создаем массив типа int и инициализируем его
		int nums[] = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};

		// Создаем переменные для записи минимального и максимального значений массива
		int min, max;

		// Считаем, что минимум и максимум равен нулевому значению массива
		min = max = nums[0];

		// С помощью расширенного цикла for и оператора if
		// перебераем все элементы массива и сравниваем их между собой
		for (int i : nums) {
			if (i < min) {
				min = i;
			}

			if (i > max) {
				max = i;
			}
		}

		// Выводим на экран минимальное и максимальное значение массива
		System.out.println("min и max: " + min + " " + max);
	}
}
