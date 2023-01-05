package learning_java.book.chapter2.CastDemo;

/*
 * Демонстрация приведения типов
 */
class CastDemo {
	public static void main(String[] args) {
		double x, y;
		byte b;
		int i;
		char ch;

		x = 10.0;
		y = 3.0;
		i = (int) (x / y); //приводим тип double к тип int, в результате чего потеряется дробная часть
		System.out.println("Целочисленный результат деления x / y: " + i);

		i = 100;
		b = (byte) i; //в этом случае информация не тереяется, типа byte может содержать значение 100
		System.out.println("Значение b: " + b);

		i = 257;

		//в этом случае данные теряются, бедет эффект переполнения типа данных, так как byte не может содержать значение 251, диапазон значение от -128 до 127
		b = (byte) i;
		System.out.println("Значение b: " + b);

		b = 88;
		ch = (char) b; //произойдет явное приведение несовместимых типов
		System.out.println("ch: " + ch);
	}
}
