package learning_java.book.chapter6.CallByValue;

/**
 * Класс содержащий метод для изменения переденных параметров по значению.
 *
 * @author Magnuym
 */
class Test {
    // Метод в который передаются аргументы по значению
    void noChange(int i, int j) {
        i = i + j;
        j = -j;
    }
}
