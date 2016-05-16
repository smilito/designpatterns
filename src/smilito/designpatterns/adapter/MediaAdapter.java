package smilito.designpatterns.adapter;

public class MediaAdapter implements MediaPlayer {

	AdvancedMediaPlayer advancedMusicPlayer;

	@Override
	public void play(String audioType, String filename) {
		if (audioType.equalsIgnoreCase("vlc")) {
			advancedMusicPlayer.playVLC(filename);
		} else if (audioType.equalsIgnoreCase("mp4")) {
			advancedMusicPlayer.playMp4(filename);
		}

	}

	public MediaAdapter(String audioType) {
		if (audioType.equalsIgnoreCase("vlc")) {
			advancedMusicPlayer = new VLCPlayer();
		} else if (audioType.equalsIgnoreCase("mp4")) {
			advancedMusicPlayer = new Mp4Player();
		}
	}

}
