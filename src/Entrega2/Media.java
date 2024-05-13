package Entrega2;

public class Media implements MediaComponent{
    private String title;
    private String author;
    private String content;

    public Media(String title, String author, String content){
        this.title = title;
        this.author = author;
        this.content = content;
    }

    public Media(String title) {
    }

    public void play(){
        System.out.println("Playing media: " + this.title);
    }

    public void display(){
        System.out.println("Displaying media: " + this.title);
    }

    public String getTitle(){
        return this.title;
    }

    public String getAuthor(){
        return this.author;
    }

    public String getContent(){
        return this.content;
    }
}
