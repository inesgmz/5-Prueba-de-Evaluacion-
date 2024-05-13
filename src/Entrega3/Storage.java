package Entrega3;

public class Storage {
    private Media[] media;
    private int mediaCount;

    public Storage() {
        media = new Media[10];
        mediaCount = 0;
    }

    public void addMedia(Media media) {
        this.media[mediaCount] = media;
        mediaCount++;
    }

    public Media getMedia(int id) {
        for (int i = 0; i < mediaCount; i++) {
            if (media[i].getId() == id) {
                return media[i];
            }
        }
        return null;
    }
}
