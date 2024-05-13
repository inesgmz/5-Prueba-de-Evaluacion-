package Entrega3;

public class RecommendationService {
    private Command command;

    public RecommendationService(Command command){
        this.command = command;
    }

    public void executeCommand(){
        command.execute();
    }

    public Media getMedia () {
        return null;
    }
}
