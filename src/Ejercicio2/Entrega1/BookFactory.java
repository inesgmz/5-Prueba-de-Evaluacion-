package Ejercicio2.Entrega1;

import java.awt.print.Book;

public class BookFactory  implements MediaFactory {
    public Newspaper createMedia() {
        return new Book();
    }
}
