package strategy;

/**
 * Created by cristian on 5/09/16.
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly.");
    }
}
