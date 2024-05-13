package Entrega4;

public class Media extends MediaComponent{
    private String title;

    public Media(String title){
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }

    @Override
    public void add(MediaComponent mediaComponent) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void remove(MediaComponent mediaComponent) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public MediaComponent getChild(int i) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void play() {
        System.out.println("Playing media: " + title);
    }

    @Override
    public void display() {
        System.out.println("Displaying media: " + title);
    }
}
