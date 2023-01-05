package learning_java.book.chapter6.ErrorMsg;

/**
 * Класс ErrorMsg.
 * Демонстрирующий работу метода getErrorMsg() который возвращает объект типа String
 * с описанием ошибки.
 */
class ErrorMsg {
    public static void main(String[] args) {
        ErrMsg err = new ErrMsg();

        System.out.println(err.getErrorMsg(2));
        System.out.println(err.getErrorMsg(19));
    }
}
