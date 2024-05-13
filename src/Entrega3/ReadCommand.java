package Entrega3;

public class ReadCommand implements Command{
    private Media media;

    public ReadCommand(RecommendationService media){

        this.media = media.getMedia();
    }

    public ReadCommand(StorageSystem storage) {
    }


    @Override
    public void execute() {
        media.read();
    }
}
