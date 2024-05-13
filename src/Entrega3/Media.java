package Entrega3;

public class Media {
    public void read() {
        System.out.println("Reading media");
    }
    public void download() {
        System.out.println("Downloading media");
    }
    public void markAsFavorite() {
        System.out.println("Marking media as favorite");
    }

    public void setState(ReservedState availableState) {
    }

    public int getId() {
        return 0;
    }
}
