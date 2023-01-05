package learning_java.book.chapter2.SCops;

/*
 * Демонстрация использования укороченных логических операций
 */
class SCops {
	public static void main(String[] args) {
		int n, d, q;

		n = 10;
		d = 2;

		if (d != 0 && (n % d) == 0) { // Укороченная операция предотвращает деление на нуль
			System.out.println(d + " является делителем " + n);
		}

		d = 0; // установить для d нулевое значение

		// Второй операнд не вычесляется, поскольку значение переменной d равно  нулю
		if (d != 0 && (n % d) == 0) {
			System.out.println(d + " является делителем " + n);
		}

		/* А теперь теже самые делителемствия выполняются без использваония укроченного
		   логического  оператора. В результате возникает ошибка деления на нуль:
		   Exception in thread "main" java.lang.ArithmeticException: / by zero
           at SCops.main(SCops.java:25)
		*/
		if (d != 0 & (n % d) == 0) {
			System.out.println(d + " является делителем " + n);
		}
	}
}
