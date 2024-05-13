package Ejercicio2.Entrega1;

public class MagazineFactory implements MediaFactory {
    public Newspaper createMedia() {
        return new Magazine();
    }
}
