package Ejercicio2.Entrega1;

import javax.print.attribute.standard.Media;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        // Crear instancias de las clases necesarias
        MediaFactory factory = new BookFactory();
        MediaBuilder builder = new MediaBuilder() {
            @Override
            public void reset() {

            }

            @Override
            public void setTitle(String title) {

            }

            @Override
            public void setAuthor(String author) {

            }

            @Override
            public void setContent(String content) {

            }

            @Override
            public Media getResult() {
                return null;
            }
        };
        SearchStrategy searchStrategy = new TitleSearchStrategy();

        // Crear el gestor de la biblioteca de medios
        MediaLibraryManager libraryManager = new MediaLibraryManager(factory, builder, searchStrategy);

        // Utilizar el gestor para buscar y clasificar medios
        List<Media> sortedResult = libraryManager.searchAndSortMedia("The Great Gatsby", "F. Scott Fitzgerald", "...", "Gatsby");

        // Hacer algo con los resultados...
    }
}

