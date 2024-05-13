package Ejercicio2.Entrega1;

public class NewspaperBuilder {
    private String name;
    private String type;
    private String category;
    private String date;
    private String author;
    private String content;

    public NewspaperBuilder() {
    }

    public NewspaperBuilder name(String name) {
        this.name = name;
        return this;
    }

    public NewspaperBuilder type(String type) {
        this.type = type;
        return this;
    }

    public NewspaperBuilder category(String category) {
        this.category = category;
        return this;
    }

    public NewspaperBuilder date(String date) {
        this.date = date;
        return this;
    }

    public NewspaperBuilder author(String author) {
        this.author = author;
        return this;
    }

    public NewspaperBuilder content(String content) {
        this.content = content;
        return this;
    }

    public Newspaper createNewspaper() {
        return new Newspaper();
    }
}
