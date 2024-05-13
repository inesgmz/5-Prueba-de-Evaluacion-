package Entrega3;

public class MarkAsFavoriteCommand implements Command{
    private Media media;

    public MarkAsFavoriteCommand(StorageSystem media){
        this.media = media;
    }

    public MarkAsFavoriteCommand(RecommendationService recommendation) {
    }

    @Override
    public void execute() {
        media.markAsFavorite();
    }
}
