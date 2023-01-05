package learning_java.book.chapter6.OverloadVarArgs;

/*
 * Клас демонстрирующий реализацию метода с переменным числом аргументов и его перегрузка.
 *
 * В результате такой перегрузки может возникнуть ошибка неопределенности!
 *
 * Это когда непонятно какой метод использовать компилятору когда методу
 * не передается ни один аргумент.
 *
 * @author Magnum
 */
class OverloadVarArgsError {

    // Использование списка переменной длины типа int
    static void vaTest(int... v) {
        // ...
    }

    // Использование списка переменной длины типа boolean
    static void vaTest(boolean... v) {
        // ...
    }


    public static void main(String args[]) {
        vaTest(1, 2, 3);  // OK
        vaTest(true, false, false); // OK

        vaTest(); // Ошибка! Возникает неопределенностить и программа не будет скомпилирована
    }
}
