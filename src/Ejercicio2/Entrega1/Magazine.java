package Ejercicio2.Entrega1;

public class Magazine {
    private String title;
    private String author;
    private String content;

    public Magazine() {
    }

    public Magazine(String title, String author, String content) {
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
        return "Magazine{title=" + this.title + ", author=" + this.author + ", content=" + this.content + "}";
    }
}
