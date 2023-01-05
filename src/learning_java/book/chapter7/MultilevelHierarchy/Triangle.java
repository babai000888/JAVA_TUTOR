package learning_java.book.chapter7.MultilevelHierarchy;

/*
 * Класс определяющий треугольник.
 * Наследуется от класса TwoDShape.
 * Демонтрирует  принцип наследование от суперкласса TwoDShape
 * имеющего некоторое число конструкторов и их переопределение.
 *
 * @version 6
 * @author Magnum
 */
class Triangle extends TwoDShape {
    private String style; // Стиль треугоника

    // Конструкторы класса с инициализацией полей суперкласса
    public Triangle() {
        super(); // без передачи аргументов коструктору суперкласса

        this.style = "none";
    }

    public Triangle(String style, double w, double h) {
        super(w, h); // передаем два аргумента конструктору суперкласса

        this.style = style;
    }

    public Triangle(double x) {
        super(x); // передаем один аргумент конструктору суперкласса

        this.style = "закрашеный";
    }

    /* Метод расчета площади треугольника
      выдаст ошибку при компиляции так как поля width и height
      у суперкласса закрыты (private)
     */
    public double area() {
        return getWidth() * getHeight() / 2;
    }

    // Метод вывода на экран стиля треуагольника
    public void showStyle() {
        System.out.println("треугольник: " + style);
    }
}
