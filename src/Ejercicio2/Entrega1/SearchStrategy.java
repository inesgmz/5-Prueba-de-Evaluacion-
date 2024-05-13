package Ejercicio2.Entrega1;

import javax.print.attribute.standard.Media;
import java.util.List;

public interface SearchStrategy {
    List<Media> search(List<Media> media, String query);
    List<Media> sort(List<Media> media);
}
