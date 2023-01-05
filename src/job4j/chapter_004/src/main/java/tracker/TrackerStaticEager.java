package job4j.chapter_004.src.main.java.tracker;

/**
 * static final field. Eager loading.
 *
 * @author Alexander Abramov (alllexe@mail.ru)
 * @version 1
 * @since 11.02.2019
 */
public class TrackerStaticEager {
    public static final Tracker INSTANCE = new Tracker();
    private TrackerStaticEager() { }
}
