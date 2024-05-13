package Ejercicio2.Entrega1;

public class NewspaperFactory implements MediaFactory {
    public Newspaper createMedia() {
        return new Newspaper();
    }
}
