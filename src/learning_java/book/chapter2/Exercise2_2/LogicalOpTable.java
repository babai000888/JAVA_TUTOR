package learning_java.book.chapter2.Exercise2_2;

/*
 * Упражнение 2.2
 * Отображение таблицы истинности для логических операций
 */
class LogicalOpTable {
	public static void main(String[] args) {
		boolean p, q;

		System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

		p = true;
		q = false;
		System.out.print(p + "\t" + q + "\t");
		System.out.print((p & q) + "\t" + (p | q) + "\t");
		System.out.println((p ^ q) + "\t" + (!p));

		p = true;
		q = false;
		System.out.print(p + "\t" + q + "\t");
		System.out.print((p & q) + "\t" + (p | q) + "\t");
		System.out.println((p ^ q) + "\t" + (!p));

		p = false;
		q = true;
		System.out.print(p + "\t" + q + "\t");
		System.out.print((p & q) + "\t" + (p | q) + "\t");
		System.out.println((p ^ q) + "\t" + (!p));

		p = false;
		q = false;
		System.out.print(p + "\t" + q + "\t");
		System.out.print((p & q) + "\t" + (p | q) + "\t");
		System.out.println((p ^ q) + "\t" + (!p));
	}
}
