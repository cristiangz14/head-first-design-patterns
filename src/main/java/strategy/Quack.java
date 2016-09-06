package strategy;

/**
 * Created by cristian on 5/09/16.
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack!!");
    }
}
