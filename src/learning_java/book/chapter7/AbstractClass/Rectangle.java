package learning_java.book.chapter7.AbstractClass;

/*
 * Подкласс для создания прямоугольников.
 * Демонстрирующий принцип наследования от абстрактного класса.
 * Содержит метод расчитывающий площать прямоугольника (котрый переопределен, что бы этот клас не стал абстрактным)
 * и метод определения является ли прямоугольник квадратом.
 * Условно будет считатся подклассом.
 *
 * @version 9
 * @author Magnum
 */
class Rectangle extends TwoDShape {
    // Полностью наследуемый конструктор по умолчанию
    public Rectangle() {
        super();
    }

    // Конструктор прямоугольника
    public Rectangle(double w, double h) {
        super(w, h, "прямоугольник"); // передаем параметры конструктору суперкласса
    }

    // Construct a square.
    public Rectangle(double x) {
        super(x, "прямоугольник"); // передаем параметры конструктору суперкласса
    }

    // Конструктор принимающий объекты в качестве параметров
    public Rectangle(Rectangle ob) {
        super(ob); // передаем объект конструктору суперклассу
    }

    public boolean isSquare() {
        if(getWidth() == getHeight()) {
            return true;
        } else {
            return false;
        }
    }

    // Переопределяем метод суперкласса, кторый должен быть переопределен что-бы класс не стал абстрактным
    @Override
    public double area() {
        return getWidth() * getHeight();
    }
}
