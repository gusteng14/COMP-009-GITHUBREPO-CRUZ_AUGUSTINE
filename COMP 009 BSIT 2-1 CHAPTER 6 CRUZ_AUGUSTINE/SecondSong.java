package MusicPlayer;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.*;
import java.util.Scanner;


public class SecondSong extends FirstSong{
	File song;
	Scanner scanner = new Scanner(System.in);
	public Clip clip;
	public AudioInputStream audio;
	
	public void createFile() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		song = new File("Ill Be Over You.wav");
		audio = AudioSystem.getAudioInputStream(song);
		clip = AudioSystem.getClip();
	}
	
	public void playSong(Clip clip, AudioInputStream audio, String userInput1, char userInput2) throws IOException, LineUnavailableException  {
		clip.open(audio);
		clip.start();
		while(userInput2 != 'S') {
			System.out.println("Options (CAPITAL LETTERS ONLY): ");
			System.out.println("Q = Reset");
			System.out.println("W = Pause");
			System.out.println("E = Play");
			System.out.println("R = Stop (Exit)");

			userInput2 = scanner.next().charAt(0);
			
			switch(userInput2) {
			case 'Q': {
				clip.setMicrosecondPosition(0);
				break;
			}
			case 'W': {
				clip.stop();
				break;
			}
			case 'E': {
				clip.start();
				break;
			}
			case 'R': {
				clip.close();
				System.out.println("Thank you for listening!");
				return;
				
			}
			default: System.out.println("Invalid input!");
			}
		}
	}
}
