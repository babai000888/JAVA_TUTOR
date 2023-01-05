package learning_java.book.chapter2.ScopeDemo;

/*
 * Демонтрация области действия блока кода
 */
class ScopeDemo {
	public static void main(String[] args) {
		int x; // Эта перемення доступаня для всего кода в методе main

		x = 10;
		if (x == 10) {  // Начало новой области действия
			int y = 20; // Эта перемення доступна только в даном блоке

            //Обе переменные "x" и "y" доступны в данном блоке
			System.out.println("x and y: " + x + " " + y);
			x = y * 2;
		}

		//y = 100; // Ошибка! В этом месте переменная "y" недоступна

        // А перемення "x" по-прежнему доступна
		System.out.println("x is " + x);
	}
}
