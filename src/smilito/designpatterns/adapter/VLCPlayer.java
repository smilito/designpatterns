package smilito.designpatterns.adapter;

public class VLCPlayer implements AdvancedMediaPlayer {

	@Override
	public void playVLC(String filename) {
		System.out.println("Playing vlc file. Name: "+ filename);
	}

	@Override
	public void playMp4(String filename) {
		// do nothing

	}

}
