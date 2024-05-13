package Entrega3;

public class StorageSystem extends Media {
    private static StorageSystem instance = null;
    private static Storage storage;

    private StorageSystem() {
        storage = new Storage();
    }

    public static StorageSystem getInstance() {
        if (instance == null) {
            instance = new StorageSystem();
        }
        return instance;
    }

    public Storage getStorage() {
        return storage;
    }
    public void setStorage(Storage storage) {
        this.storage = storage;
    }
    public Media getMedia(int id) {
        return storage.getMedia(id);
    }
}
