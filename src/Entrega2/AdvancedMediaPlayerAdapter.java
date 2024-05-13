package Entrega2;

public class AdvancedMediaPlayerAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMediaPlayer;

    public AdvancedMediaPlayerAdapter(AdvancedMediaPlayer advancedMediaPlayer) {
        this.advancedMediaPlayer = advancedMediaPlayer;
    }

    public void play(Media media) {
        advancedMediaPlayer.play(media.getContent());
    }

    private class AdvancedMediaPlayer {
        public void play(String content) {
        }
    }
}
