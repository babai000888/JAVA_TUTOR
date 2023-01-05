package job4j.chapter_009.src.main.java.ru.job4j.cache;

import java.lang.ref.SoftReference;

/**
 * @author Alexander Abramov (alllexe@mail.ru)
 * @version 1
 * @since 16.08.2019
 */
public interface SoftReferenceCache<T, V> {

    V getValue(T key);

}
