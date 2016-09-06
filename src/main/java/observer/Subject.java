package observer;

/**
 * Created by cristian on 5/09/16.
 */
public interface Subject {

    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObservers();
}
