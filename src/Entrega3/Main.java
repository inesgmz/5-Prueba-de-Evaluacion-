package Entrega3;

import Entrega4.*;
import Entrega4.Media;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de Media
        Entrega4.Media media1 = new Entrega4.Media("Media 1");
        Entrega4.Media media2 = new Media("Media 2");

        // Crear una instancia de MediaCollection y agregar los medios a la colección
        MediaCollection mediaCollection = new MediaCollection();
        mediaCollection.add(media1);
        mediaCollection.add(media2);

        // Crear instancias de MediaView y MediaModel
        MediaView view = new MediaView();
        MediaModel model = new MediaModel(); // Asegúrate de implementar esta clase

        // Crear una instancia de MediaController
        MediaController controller = new MediaController(model, view);

        // Demostrar la funcionalidad de la aplicación
        controller.addMediaToCollection(media1, mediaCollection);
        controller.playMedia(media1);
    }
}
