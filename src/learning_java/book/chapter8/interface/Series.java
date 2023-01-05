package learning_java.book.chapter8.

/*
 * Демонстрация создания интерфейса.
 *
 * @author Magnum
 */
public interface Series {
    int getNext(); // вернуть следующее по порядку число
    void reset(); // сброс к начальному состоянию
    void setStart(int x); // уставновка начального значения
}
