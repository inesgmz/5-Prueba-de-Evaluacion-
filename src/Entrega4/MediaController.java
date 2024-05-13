package Entrega4;

public class MediaController {
    private MediaModel model;
    private MediaView view;

    public MediaController(MediaModel model, MediaView view) {
        this.model = model;
        this.view = view;
    }

    public void addMediaToCollection(Media media, MediaCollection collection) {
        collection.add(media);
        view.displayMediaCollection(collection);
    }

    public void playMedia(Media media) {
        media.play();
        view.displayMedia(media);
    }

}
