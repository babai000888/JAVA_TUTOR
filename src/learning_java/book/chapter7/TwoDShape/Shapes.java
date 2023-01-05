package learning_java.book.chapter7.TwoDShape;

/*
 * Клас содержащий метод main для запуска програмы и теста класса Triangle.
 *
 * @author Magnum
 */
class Shapes {
    public static void main(String args[]) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle();

        t1.width = 4.0;
        t1.height = 4.0;
        t1.style = "закрашеный";

        t2.width = 8.0;
        t2.height = 12.0;
        t2.style = "контурный";

        System.out.println("информация о t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("площадь " + t1.area());

        System.out.println();

        System.out.println("информация о t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("площадь " + t2.area());
    }
}
