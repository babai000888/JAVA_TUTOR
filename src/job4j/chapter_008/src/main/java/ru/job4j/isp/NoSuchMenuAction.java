package job4j.chapter_008.src.main.java.ru.job4j.isp;

public class NoSuchMenuAction extends RuntimeException {

    public NoSuchMenuAction() {
    }

    public NoSuchMenuAction(String message) {
        super(message);
    }
}
