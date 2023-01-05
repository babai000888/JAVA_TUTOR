package learning_java.book.chapter6.FailSoftArray;

/*
 * Класс в который содержит метод main() для проверки работы класса FailSoftArray.
 *
 * @author Magnum
 */
class FSDemo {
    public static void main(String[] args) {
        FailSoftArray fs = new FailSoftArray(5, -1);
        int x;

        // Демонстрация работы с ввода и вывода значений без отчета о выходе за пределы массива
        System.out.println("Обработка ошибок без выводи отчета.");

        // Заполняем массив значениями с помощью метода put()
        for (int i = 0; i < (fs.length * 2); i++) {
            fs.put(i, i * 10);
        }

        /*
         Полуаем значения из массива и выводи его на экран если
         не произошел выход за пределы массива
         */
        for (int i = 0; i < (fs.length * 2); i++) {
            x = fs.get(i);

            if (x != -1) {
                System.out.print(x + " ");
            }
        }
        System.out.println();
        System.out.println();

        // Демонстрация работы ввода и вывода значений с выводом отчета о выходе за пределы массива
        System.out.println("Обработка ошибко в выводом отчета");

        /*
         Заполняем массив данными, и если получаем ошибку о выходе за граници массива
         то выводим соотвествующее уведовление
         */
        for (int i = 0; i < (fs.length * 2); i++) {
            if (!fs.put(i, i * 10)) {
                System.out.println("Данный индекс " + i + " вне допустимого диапазона");
            }
        }

        /*
         Получаем значения из массива, и если получаем ошибку о выходе за границы массива
         то воводим на экран сообщение об этом
         */
        for (int i = 0; i < (fs.length * 2); i++) {
            x = fs.get(i);

            if (x != -1) {
                System.out.print(x + " ");
            } else {
                System.out.println("Данный индекс " + i + " вне допустимого диапазона");
            }
        }
    }
}
