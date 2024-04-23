package MusicPlayer;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Main {
	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		FirstSong song1 = new FirstSong();
		song1.createFile();
		SecondSong song2 = new SecondSong();
		song2.createFile();
		ThirdSong song3 = new ThirdSong();
		song3.createFile();
		
		Scanner scanner = new Scanner(System.in);
		String userInput1;
		char userInput2;
		
		System.out.println("Guitar Player");
		System.out.println("Choose a song: ");
		System.out.println("1 - Hotel California");
		System.out.println("2 - I'll Be Over You");
		System.out.println("3 - Rosanna");
		
		userInput1 = scanner.next();
		userInput2 = 'z';
		
		if (userInput1.equals("1")) {
			song1.playSong(song1.clip, song1.audio, userInput1, userInput2);
		}
		else if (userInput1.equals("2")) {
			song2.playSong(song2.clip, song2.audio, userInput1, userInput2);
		}
		else if (userInput1.equals("3")) {
			song3.playSong(song3.clip, song3.audio, userInput1, userInput2);
		}
	}	
}
