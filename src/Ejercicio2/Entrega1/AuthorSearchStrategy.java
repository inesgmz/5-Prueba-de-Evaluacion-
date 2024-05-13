package Ejercicio2.Entrega1;

import javax.print.attribute.standard.Media;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
public class AuthorSearchStrategy implements SearchStrategy{
    public List<Media> search(List<Media> media, String query) {
        List<Media> result = new ArrayList<>();
        for (Media m : media) {
            if (m.getCategory().isInterface()) {
                result.add(m);
            }
        }
        return result;
    }
    public List<Media> sort(List<Media> media) {
        Comparator<Object> Comparator = null;
        media.sort(Comparator);
        return media;
    }
}
