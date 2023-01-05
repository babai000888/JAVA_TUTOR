package job4j.chapter_008.src.main.java.ru.job4j.lsp.storage;


import ru.job4j.lsp.food.Food;

import java.util.List;

/**
 * Strategy for adding to trash storage
 *
 * @author Alexander Abramov (alllexe@mail.ru)
 * @version 1
 * @since 19.06.2019
 */
public class TrashStrategy implements StorageStrategy {

    @Override
    public boolean add(Food food, List<Food> foods) {
        boolean added = false;
        if (food.getExpaireRate() >= 100) {
            added = foods.add(food);
        }
        return added;
    }
}
