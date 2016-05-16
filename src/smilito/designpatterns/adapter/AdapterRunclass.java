package smilito.designpatterns.adapter;

public class AdapterRunclass {
	
	public static void run(){
		System.out.println("BEGIN 	ADAPTER PATTERN ================");
		AudioPlayer audioPlayer = new AudioPlayer();
		audioPlayer.play("mp3", "Alexandre Desplat - Budapest Theme");
		audioPlayer.play("mp4", "Paul McCartney - Yellow Submarine");
		audioPlayer.play("vlc", "John Williams - Star Wars Theme");
		System.out.println("END 	ADAPTER PATTERN ================");
	}

}
