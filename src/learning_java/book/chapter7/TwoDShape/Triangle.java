package learning_java.book.chapter7.TwoDShape;

/*
 * Класс определяющий треугольник.
 * Демонстрирующий принцип наследования от другого класса.
 * Содержит метод расчитывающий площать треугорьника и метод вывода на экран стиля треугольника.
 * Условно будет считатся подклассом.
 *
 * @author Magnum
 */
class Triangle extends TwoDShape {
    public String style; // Стиль треугоника

    // Метод расчета площади треугольника
    public double area() {
        return width * height / 2;
    }

    // Метод вывода на экран стиля треуагольника
    public void showStyle() {
        System.out.println("треугольник " + style);
    }
}
