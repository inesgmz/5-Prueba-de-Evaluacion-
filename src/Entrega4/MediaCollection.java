package Entrega4;
import java.util.ArrayList;
import java.util.List;
public class MediaCollection extends MediaComponent{
    List<MediaComponent> components = new ArrayList<>();

    @Override
    public void add(MediaComponent mediaComponent) {
        components.add(mediaComponent);
    }

    @Override
    public void remove(MediaComponent mediaComponent) {
        components.remove(mediaComponent);
    }

    @Override
    public MediaComponent getChild(int i) {
        return components.get(i);
    }

    @Override
    public void play() {
        for (MediaComponent component : components) {
            component.play();
        }
    }

    @Override
    public void display() {
        for (MediaComponent component : components) {
            component.display();
        }
    }
}
