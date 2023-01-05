package job4j.chapter_011.src.main.java.ru.job4j.crud.model;

public enum Role {

    ADMIN(1),
    USER(2);

    private final int id;

    Role(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

}
