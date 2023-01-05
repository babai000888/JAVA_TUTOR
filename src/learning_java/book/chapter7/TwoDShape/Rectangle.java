package learning_java.book.chapter7.TwoDShape;

/*
 * Подкласс для создания прямоугольников.
 * Демонстрирующий принцип наследования от другого класса.
 * Содержит метод расчитывающий площать прямоугольника и метод определения является
 * ли прямоугольник квадратом.
 * Условно будет считатся подклассом.
 *
 * @author Magnum
 */
class Rectangle extends TwoDShape {
    // Метод определяющий является ли прямоугольник квадратом
    public boolean isSquare() {
        if (width == height) Х
        return true;
    } else {
        return false;
    }
}

    // Метод расчета площади прямоугольника
    public double area() {
        return width * height;
    }
}
