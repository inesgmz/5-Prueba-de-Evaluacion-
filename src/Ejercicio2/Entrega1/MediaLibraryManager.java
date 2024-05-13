package Ejercicio2.Entrega1;
import javax.print.attribute.standard.Media;
import java.util.ArrayList;
import java.util.List;
public class MediaLibraryManager {
    private MediaFactory factory;
    private MediaBuilder builder;
    private SearchStrategy searchStrategy;

    public MediaLibraryManager(MediaFactory factory, MediaBuilder builder, SearchStrategy searchStrategy) {
        this.factory = factory;
        this.builder = builder;
        this.searchStrategy = searchStrategy;
    }

    public List<Media> searchAndSortMedia(String title, String author, String content, String query) {
        // Crear un medio digital
        builder.setTitle(title);
        builder.setAuthor(author);
        builder.setContent(content);
        Media media = builder.getResult();

        // Realizar la búsqueda y clasificación
        List<Media> mediaList = new ArrayList<>();
        mediaList.add(media);

        List<Media> searchResult = searchStrategy.search(mediaList, query);
        List<Media> sortedResult = searchStrategy.sort(searchResult);

        return sortedResult;
    }
}
