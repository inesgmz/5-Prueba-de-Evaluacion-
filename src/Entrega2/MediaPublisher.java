package Entrega2;
import java.util.ArrayList;
import java.util.List;
public class MediaPublisher {
    private List<Observer> observers = new ArrayList<>();

    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    public void notify(Media media) {
        for (Observer observer : observers) {
            observer.update(media);
        }
    }
}
