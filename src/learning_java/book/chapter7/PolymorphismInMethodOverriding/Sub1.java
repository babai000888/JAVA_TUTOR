package learning_java.book.chapter7.PolymorphismInMethodOverriding;

/*
 * Класс наследуемы от суперкласса Sup.
 * Содержит свой переопределенный метод who().
 *
 * @author Magnum
 */
class Sub1 extends Sup {

    @Override
    public void who() {
        System.out.println("who() в Sub1");
    }
}
