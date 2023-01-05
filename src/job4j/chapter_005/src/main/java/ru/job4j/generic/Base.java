package job4j.chapter_005.src.main.java.ru.job4j.generic;

public abstract class Base {
    private final String id;

    protected Base(final String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }
}
