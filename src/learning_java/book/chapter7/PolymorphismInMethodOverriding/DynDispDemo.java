package learning_java.book.chapter7.PolymorphismInMethodOverriding;

/*
 * Клас содержащий метод main для запуска програмы и теста класса Triangle.
 *
 * @author Magnum
 */
class DynDispDemo {
    public static void main(String args[]) {
        Sup superOb = new Sup();  // создание объекта суперкласса
        Sub1 subOb1 = new Sub1(); // создание объекта подкласса
        Sub2 subOb2 = new Sub2(); // создание объекта подкласса

        Sup supRef; // пустая переменная суперкласса без ссылки на какой либо объект

        // присваиваем пустой переменной суперкласса ссылку на объект суперкласса
        supRef = superOb;
        supRef.who(); // вызывется метод суперкласса

        // присваиваем пустой переменной суперкласса ссылку на объект подкласса
        supRef = subOb1;
        supRef.who(); // вызывется метод подкласса Sub1

        // присваиваем пустой переменной суперкласса ссылку на объект подкласса
        supRef = subOb2;
        supRef.who(); // вызывется метод подкласса Sub2
    }
}
