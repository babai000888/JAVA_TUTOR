package learning_java.book.chapter7.MethodOverridePrevention;

/*
 * Клас содержащий метод main для запуска програмы и теста класса B.
 *
 * @author Magnum
 */
class UseSuper {
    public static void main(String[] args) {
        B subOb = new B();

        subOb.meth();
    }
}
