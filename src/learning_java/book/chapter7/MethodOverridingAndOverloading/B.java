package learning_java.book.chapter7.MethodOverridingAndOverloading;

/*
 * Условно абстрактный класс описывающий какой-то объект.
 * Содержит свой конструктор с наследованием от суперкласса А и метод
 * скрывающий метод суперкласса.
 * Условно будет считатся подклассом.
 *
 * @version 1
 * @author Magnum
 */
class B extends A {
    private int k;

    public B(int a, int b, int c) {
        super(a, b);
        this.k = c;
    }

    // метод скрывающий метод show() класса A и выводящий на экран значение своей переменной k
    public void show() {
        System.out.println("k: " + this.k);
    }
}
