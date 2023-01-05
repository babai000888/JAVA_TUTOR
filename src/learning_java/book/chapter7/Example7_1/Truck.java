package learning_java.book.chapter7.Example7_1;

/*
 * Класс наследующийся от класса Vehicle.
 * Условно будет считатся подклассом.
 * Содержит закрытую переменную, свой конструктор наледующий данные
 * из суперкласса, геттер и сеттер для доступа к переменной.
 *
 * @author Magnum
 */
class Truck extends Vehicle {
    private int cargocap; // грузоподъемность в фунтах

    // конуструктор класса
    public Truck(int p, int f, int m, int c) {
        // наследуемые значения от суперкласса
        super(p, f, m);

        this.cargocap = c;
    }

    // геттер и сеттер
    int getCargo() {
        return cargocap;
    }

    void putCargo(int c) {
        this.cargocap = c;
    }
}
