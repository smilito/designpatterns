package smilito.designpatterns.adapter;

public class AudioPlayer implements MediaPlayer {

	private MediaAdapter mediaAdapter;

	@Override
	public void play(String audioType, String filename) {

		if (audioType.equalsIgnoreCase("mp3")) {
			System.out.println("Playing mp3 file. Name: " + filename);
		} else if (audioType.equalsIgnoreCase("mp4")
				|| audioType.equalsIgnoreCase("vlc")) {
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, filename);
		} else {
			System.out.println("Invalid media. " + audioType
					+ " format not supported");
		}

	}

}
