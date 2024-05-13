package Entrega3;

public class BorrowedState implements State{
    private Media media;

        public BorrowedState(Media media){
            this.media = media;
        }

        @Override
        public void handleRequest() {
            media.setState(new ReservedState(media));
        }
}
