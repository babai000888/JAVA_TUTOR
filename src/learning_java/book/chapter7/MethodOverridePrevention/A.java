package learning_java.book.chapter7.MethodOverridePrevention;

/*
 * Условнео абстрактный класс.
 * Содержащий один метод отмеченный как final который предотвращает его переопредение в подкласе.
 * Условно будет считатся суперклассом.
 *
 * @author Magnum
 */
class A {
    final void meth() {
        System.out.println("Это final метод.");
    }
}
