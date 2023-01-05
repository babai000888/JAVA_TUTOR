package learning_java.book.chapter7.TwoDShapeVsPrivate;

/*
 * Класс описывающий фигуру состояющу из двух сторон.
 * Содержит метод выводящий на экран значение сторон.
 * Поля данного класса закрыты (private).
 * Условно будет считатся суперклассом.
 *
 * @version 2
 * @author Magnum
 */
class TwoDShape {
    private double width;  // зыкрытая переменная ширины
    private double height; // зыкрытая переменная высоты

    // Метод выводящий на экран значение сторон
    public void showDim() {
        System.out.println("ширина " + width + ", высота " + height);
    }
}
