package learning_java.book.chapter7.IncompatibleRef;

/*
 * Условно абстрактный подкласс.
 * Демонстрирующий принцип наследования от другого класса
 * содержаций свой конструктор с наследованием конструктора суперкласса.
 *
 * @author Magnum
 */
class Y extends X {
    public int b;

    public Y(int i, int j) {
        super(j);
        this.b = i;
    }
}
