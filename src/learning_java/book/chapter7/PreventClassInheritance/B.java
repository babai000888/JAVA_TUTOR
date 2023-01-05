package learning_java.book.chapter7.PreventClassInheritance;/*
 * Условно абстрактный подкласс.
 * Демонстрирующий невозможность наслеования от другого класса отмеченного как final.
 *
 * @author Magnum
 */

/**
 * Данный класс не пройдет компиляцию
 */
class B extends A {
    // здесь располагается тело класса
}
