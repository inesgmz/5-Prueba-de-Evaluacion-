package Entrega3;

public class DownloadCommand implements Command{
    private Media media;

    public DownloadCommand(RecommendationService media){
        this.media = media.getMedia();
    }

    public DownloadCommand(StorageSystem storage) {
        this.media = storage;
    }

    @Override
    public void execute() {
        media.download();
    }
}
