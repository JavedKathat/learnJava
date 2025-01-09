import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;

public class AudioFile {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        Scanner sc = new Scanner(System.in);
        File file = new File("audio/Going_Home.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);

        String resp = "";
        while(!resp.equals("Q")) {
            System.out.println("P -> Play, S -> Stop, R -> Reset, Q -> Quit.");
            System.out.println("Enter your choice : ");
            resp = sc.next();
            resp = resp.toUpperCase();

            switch (resp) {
                case ("P") -> clip.start();
                case ("S") -> clip.stop();
                case ("R") -> clip.setMicrosecondPosition(0);
                case ("Q") -> clip.close();
                default -> System.out.println("Invalid input. Please enter a valid choice!");
            }
        }
        System.out.println("Thank you for play audio!");
    }
}
