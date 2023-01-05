package job4j.chapter_008.src.main.java.ru.job4j.lsp.storage;


import ru.job4j.lsp.food.Food;

import java.util.List;

public interface StorageStrategy {

    boolean add(Food food, List<Food> foods);

}
