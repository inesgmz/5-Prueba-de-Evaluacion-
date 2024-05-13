package Entrega2;
import java.util.ArrayList;
import java.util.List;

public class MediaCollection implements MediaComponent{
    private List<MediaComponent> components = new ArrayList<>();

    public void add(MediaComponent component) {
        components.add(component);
    }

    public void remove(MediaComponent component) {
        components.remove(component);
    }

    public void play() {
        for (MediaComponent component : components) {
            component.play();
        }
    }

    public void display() {
        for (MediaComponent component : components) {
            component.display();
        }
    }
}
