package Entrega4;

public class MediaModel {
    private MediaComponent mediaCollection;

    public MediaModel() {
        this.mediaCollection = mediaCollection;
    }

    public void addMedia(Media media) {
        MediaComponent mediaComponent = new MediaLeaf(media);
        mediaCollection.add(mediaComponent);
    }

    public void playMedia(Media media) {
        media.play();
    }

    public void displayMediaCollection() {
        mediaCollection.display();
    }

    public void removeMedia(Media media) {
        MediaComponent mediaComponent = new MediaLeaf(media);
        mediaCollection.remove(mediaComponent);
    }

    public void playMediaCollection() {
        mediaCollection.play();
    }

    public MediaComponent getMediaCollection() {
        return mediaCollection;
    }

    private class MediaLeaf extends MediaComponent {
        public MediaLeaf(Media media) {
            super();
        }
    }
}
