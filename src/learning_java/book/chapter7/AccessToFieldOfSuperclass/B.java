package learning_java.book.chapter7.AccessToFieldOfSuperclass;

/*
 * Условно абстрактный подкласс.
 * Демонстрирующий принцип наследования от другого класса
 * и доступ к его полю используя ключевое слово super.
 * Условно будет считатся подклассом.
 *
 * @author Magnum
 */
class B extends A {
    private int i; // переменная имеющая такое же имя как и у суперкласса и скрывающая ее

    public B(int a, int b) {
        super.i = a; // переменная класса A
        this.i = b; // переменная класса B
    }

    public void show() {
        System.out.println("i в суперклассе: " + super.i);
        System.out.println("i в подклассе: " + this.i);
    }
}
