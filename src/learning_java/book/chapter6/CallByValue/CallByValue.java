package learning_java.book.chapter6.CallByValue;

/**
 * Класс CallByValue.
 * Демонтрирующий, что значение переменных не меняется если их передвать в качестве параметров метода
 * по значению.
 *
 * @author Magnum
 */
class CallByValue {
    public static void main(String[] args) {
        Test test = new Test();
        int a = 15, b = 20;

        System.out.println("Значение переменных a и b до вызова метода noChange у объекта test класса Test: "
                           + a + " " + b);
        /*
         Переменные a и b, не принадлежат объекту test класса Test
         их значение останется неизменными
         */
        test.noChange(a, b);

        System.out.println("Значение переменных a и b после вызова метода noChange у объекта test класса Test: "
                + a + " " + b);
    }
}
