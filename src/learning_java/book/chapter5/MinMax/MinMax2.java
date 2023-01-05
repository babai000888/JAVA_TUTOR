package learning_java.book.chapter5.MinMax;

/*
 * Программа демонстрирующая нахождение минимального значения в массиве.
 * @author Magnum
 * @version 2
 */
class MinMax2 {
	public static void main(String[] args) {
		// Создаем массив типа int и инициализируем его
		int nums[] = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};

		// Создаем переменные для записи минимального и максимального значений массива
		int min, max;

		// Считаем, что минимум и максимум равен нулевому значению массива
		min = max = nums[0];

		//Начинаем перебирать значения в цикле используя оператор if
		for (int i = 1; i < 10; i++) {
			if (nums[i] < min) {
				min = nums[i];
			}

			if (nums[i] > max) {
				max = nums[i];
			}
		}

		// Выводим на экран минимальное и максимальное значение массива
		System.out.println("min и max: " + min + " " + max);
	}
}
