package job4j.chapter_003.src.main.java.sort;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *  Сортировка пользователей.
 */
public class SortUser {

    /**
     * TreeSet пользователей отсортированное по возрасту
     * @param users лист пользователей
     * @return отсортированное по возрасту TreeSet
     */
    public Set<User> sort(List<User> users) {
        return new TreeSet<>(users);
    }

    /**
     * List пользователей отсортированных по длине имени
     * @param users исходный список
     * @return отсортированный список
     */
    public List<User> sortNameLength(List<User> users) {
        users.sort(Comparator.comparingInt(o -> o.getName().length()));
        return users;
    }

    /**
     * Сортировка List<User> по обоим полям,
     * сначала сортировка по имени в лексикографическом порядке, потом по возрасту.
     * @param users исходный список
     * @return отсортированый список
     */
    public List<User> sortByAllFields(List<User> users) {
        users.sort((o1, o2) -> (o1.getName().equals(o2.getName()) ? o1.getAge() - o2.getAge() : o1.getName().compareTo(o2.getName())));
        return users;
    }


}
