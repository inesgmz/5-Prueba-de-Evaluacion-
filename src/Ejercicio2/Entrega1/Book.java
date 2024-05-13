package Ejercicio2.Entrega1;

public class Book {
    private String title;
    private String author;
    private String content;

    public Book() {
    }

    public Book(String title, String author, String content) {
        this.title = title;
        this.author = author;
        this.content = content;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getContent() {
        return this.content;
    }

    public String toString() {
        return "Book{title=" + this.title + ", author=" + this.author + ", content=" + this.content + "}";
    }
}
