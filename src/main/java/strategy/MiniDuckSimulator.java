package strategy;

/**
 * Created by cristian on 5/09/16.
 */
public class MiniDuckSimulator {

    public static void main(String... args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        mallard.setQuackBehavior(new Squeak());
        mallard.performQuack();
    }
}
