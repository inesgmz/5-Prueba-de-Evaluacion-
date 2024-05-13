package Entrega3;

import Entrega2.User;

import java.awt.*;
import java.util.Objects;

public class LibraryMediator implements Mediator{
    private User ui;
    private StorageSystem storage;
    private RecommendationService recommendation;

    public LibraryMediator(User ui, StorageSystem storage, RecommendationService recommendation) {
        this.ui = ui;
        this.storage = storage;
        this.recommendation = recommendation;
    }

    @Override
    public void notify(Component sender, String event) {
        if (Objects.equals(sender, ui)) {
            if (event.equals("Download")) {
                Command downloadCommand = new DownloadCommand(storage);
                downloadCommand.execute();
            } else if (event.equals("Read")) {
                Command readCommand = new ReadCommand(storage);
                readCommand.execute();
            } else if (event.equals("MarkAsFavorite")) {
                Command markAsFavoriteCommand = new MarkAsFavoriteCommand(storage);
                markAsFavoriteCommand.execute();
            }
        } else if (Objects.equals(storage, sender)) {
            if (event.equals("Download")) {
                Command downloadCommand = new DownloadCommand(recommendation);
                downloadCommand.execute();
            } else if (event.equals("Read")) {
                Command readCommand = new ReadCommand(recommendation);
                readCommand.execute();
            } else if (event.equals("MarkAsFavorite")) {
                Command markAsFavoriteCommand = new MarkAsFavoriteCommand(recommendation);
                markAsFavoriteCommand.execute();
            }
        }
    }
}
