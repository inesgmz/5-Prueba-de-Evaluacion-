package Entrega2;

import Ejercicio2.Entrega1.AuthorSearchStrategy;
import Ejercicio2.Entrega1.Book;
import Ejercicio2.Entrega1.BookBuilder;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de Media
        Media media1 = new Media("Media 1");
        Media media2 = new Media("Media 2");

        // Crear una lista de Media y agregar los medios a la lista
        List<Media> mediaList = new ArrayList<>();
        mediaList.add(media1);
        mediaList.add(media2);

        // Crear una instancia de AuthorSearchStrategy
        AuthorSearchStrategy authorSearch = new AuthorSearchStrategy();

        // Buscar en la lista de medios
        //List<Media> result = authorSearch.search(mediaList, "Author 1");

        // Crear una instancia de BookBuilder
        BookBuilder bookBuilder = new BookBuilder();
        bookBuilder.setTitle("Book 1");
        bookBuilder.setAuthor("Author 1");
        bookBuilder.setContent("Content of Book 1");

        // Obtener el resultado del BookBuilder
        Book book = bookBuilder.getResult();
    }
}
