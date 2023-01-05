package job4j.chapter_005.src.main.java.ru.job4j.list;

/**
 * Очередь FIFO
 *
 * @author Alexander Abramov (alllexe@mail.ru)
 * @version 1
 * @since 26.03.2019
 */
public class SimpleQueue<T> {

    private final SimpleStack<T> stack = new SimpleStack<>();
    private final SimpleStack<T> stackReverse = new SimpleStack<>();

    /**
     * Добавить элемент в очередь
     * @param value добавляемый элемент
     */
    public void push(T value) {
        stack.push(value);
    }

    /**
     * Взять элемент из очереди по FIFO
     * @return элемент из очереди
     */
    public T poll() {
        if (stackReverse.size() == 0) {
            int stackSize = stack.size();
            for (int i = 0; i < stackSize; i++) {
                stackReverse.push(stack.poll());
            }
        }
        return stackReverse.poll();
    }

    /**
     * Возвращает размер очереди
     * @return размер очереди
     */
    public int size() {
        return stack.size() + stackReverse.size();
    }

}
