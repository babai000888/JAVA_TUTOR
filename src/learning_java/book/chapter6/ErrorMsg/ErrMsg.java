package learning_java.book.chapter6.ErrorMsg;

/**
 * Класс ErrMsg.
 * Сожержит массив строк msgs[] в котором хранят коды ошибок и метод getErrorMsg()
 * возвращающий объект типа String описывающий произошедшую ошибку и выводящий ее на экран.
 *
 * @author Magnum
 */
class ErrMsg {
    // Массив с описанием ошибок
    String msgs[] = {
            "Ошибка вывода",
            "Ошибка ввода",
            "Отсутсвует место на диске",
            "Выход индекса за граицы диапазона"
    };

    // Метод отобразающий код ошибки
    String getErrorMsg(int i) {
        if (i >= 0 & i < msgs.length) {
            return msgs[i];
        } else {
            return "Несуществующий код ошибки";
        }
    }
}
