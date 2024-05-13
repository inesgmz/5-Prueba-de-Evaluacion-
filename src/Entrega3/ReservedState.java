package Entrega3;

public class ReservedState implements State{
    private Media media;

    public ReservedState(Media media){
        this.media = media;
    }

    @Override
    public void handleRequest() {
        System.out.println("Reserved State");
        media.setState(new AvailableState(media));
    }
}
