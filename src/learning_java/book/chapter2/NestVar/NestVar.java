package learning_java.book.chapter2.NestVar;

/*
 * В этой программе предпринимается попытка объявить во внутренней области
 * действия две переменную с таким же именем, как и у переменной,
 * объявленной во внешней обсласти действия.
 *
 * Эта программа не пройдет компиляцию!
 */
class NestVar {
	public static void main(String[] args) {
		int count;

		for (count = 0; count < 10; count++) {
			System.out.println("Значение count: " + count);

			int count; // Недопустимо! Нельзя объявлять переменую count поскольку она уже была объявлена
			for (count = 0; count < 2; count++) {
				System.out.println("В этой программе есть ошибка!");
			}
		}
	}
}
