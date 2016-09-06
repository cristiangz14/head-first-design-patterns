package strategy;

/**
 * Created by cristian on 5/09/16.
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak!!");
    }
}
