package learning_java.book.chapter6.StaticMeth;

/*
 * Статические методы не могут использовать переменные не помеченные как static.
 * По этому данный клас не пройдем компиляцию.
 *
 * @author Magnum
 */
class StaticError {
    private int denom = 3; // обычная переменная
    private static int val = 1024; // статическая переменная

    /* Ошибка! К нестатическим переменным нельзя обращатся
       из статического метода */
    static int valDivDenom() {
        return val/denom; // ошибка в строке
    }
}
