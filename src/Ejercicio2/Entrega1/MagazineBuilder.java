package Ejercicio2.Entrega1;

import javax.print.attribute.standard.Media;

public class MagazineBuilder implements MediaBuilder {
    private Magazine magazine;

    public MagazineBuilder(){
        this.reset();
    }

    public void reset(){
        this.magazine = new Magazine();
    }

    public void setTitle(String title){
        this.magazine.setTitle(title);
    }

    public void setAuthor(String author){
        this.magazine.setAuthor(author);
    }

    public void setContent(String content){
        this.magazine.setContent(content);
    }

    public Media getResult(){
        Magazine result = this.magazine;
        this.reset();
        return result;
    }
}
