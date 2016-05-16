package smilito.designpatterns.adapter;

public class Mp4Player implements AdvancedMediaPlayer {

	@Override
	public void playVLC(String filename) {
		// do nothing

	}

	@Override
	public void playMp4(String filename) {
		 System.out.println("Playing mp4 file. Name: "+ filename);		
	}

}
