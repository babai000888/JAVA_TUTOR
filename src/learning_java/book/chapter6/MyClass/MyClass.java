package learning_java.book.chapter6.MyClass;

/*
 * Программа демонстрирующая как рабают модификаторы доступа public и privat.
 *
 * @author Magnum
 */
class MyClass {
    private int alpha; //закрытая переменная
    public int beta;   // открытая переменная
    int gamma;         // переменная с модификатором доступа по умолчанию (по сути public)

    /*
      Методы доступа к переменной alpha. Члены класса могут обращатся к закрытыс
      членам того же класа.
     */
    public void setAlpha(int alpha) {
        this.alpha = alpha;
    }

    public int getAlpha() {
        return alpha;
    }
}
