package Ejercicio2.Entrega1;

import javax.print.attribute.standard.Media;

public class BookBuilder implements MediaBuilder {
    private Book book;

    public BookBuilder(){
        this.reset();
    }

    public void reset(){
        this.book = new Book();
    }

    public void setTitle(String title){
        this.book.setTitle(title);
    }

    public void setAuthor(String author){
        this.book.setAuthor(author);
    }

    public void setContent(String content){
        this.book.setContent(content);
    }

    public Media getResult(){
        Book result = this.book;
        this.reset();
        return result;
    }
}


