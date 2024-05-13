package Entrega3;

public class AvailableState implements State{
    private Media media;

    public AvailableState(Media media){
        this.media = media;
    }

    @Override
    public void handleRequest() {
        System.out.println("Available State");
        media.setState(new BorrowedState(media));
    }
}
