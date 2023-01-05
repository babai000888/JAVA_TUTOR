package learning_java.book.chapter5.MinMax;

/*
 * Программа демонстрирующая нахождение минимального значения в массиве.
 * @author Magnum
 */
class MinMax {
	public static void main(String[] args) {
		// Создаем массив типа int
		int nums[] = new int[10];

		// Создаем переменные для записи минимального и максимального значений массива
		int min, max;

		// Записываем значения в массив
		nums[0] = 99;
		nums[1] = -10;
		nums[2] = 100123;
		nums[3] = 18;
		nums[4] = -978;
		nums[5] = 5623;
		nums[6] = 463;
		nums[7] = -9;
		nums[8] = 287;
		nums[9] = 49;

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
