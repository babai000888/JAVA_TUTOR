package job4j.chapter_004.src.main.java.tracker;

import java.util.List;

/**
 * Интерфейс ввода. Выводит текст вопроса и возвращает ввод пользователя
 */
public interface Input {
    String ask(String question);
    int ask(String question, List<Integer> range);
}
