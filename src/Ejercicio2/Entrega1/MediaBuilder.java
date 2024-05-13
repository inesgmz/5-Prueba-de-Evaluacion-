package Ejercicio2.Entrega1;

import javax.print.attribute.standard.Media;

public interface MediaBuilder {
    void reset();
    void setTitle(String title);
    void setAuthor(String author);
    void setContent(String content);
    Media getResult();

}
