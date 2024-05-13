package Entrega2;

public class User implements Observer{
    public void update(Media media) {
        System.out.println("New release: " + media.getTitle());
    }
}
