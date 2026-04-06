import javax.sound.sampled.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Scanner;

public class AlarmClock implements Runnable{

    private final LocalTime AlarmTime;
    private final String filePath;
    private final Scanner scanner;

    AlarmClock(LocalTime AlarmTime, String filePath, Scanner scanner){
        this.AlarmTime=AlarmTime;
        this.filePath = filePath;
        this.scanner = scanner;
    }

    @Override
    public void run(){
//        LocalTime now = LocalTime.now();
//        System.out.println(now);
        while (LocalTime.now().isBefore(AlarmTime)){
            try{
                Thread.sleep(1000);

                LocalTime now= LocalTime.now();
                int hours= now.getHour();
                int minutes = now.getMinute();
                int seconds = now.getSecond();
                System.out.printf("\r%02d:%02d:%02d",hours,minutes,seconds);
            }catch (InterruptedException e){
                System.out.println("The thread was interrupted.");
            }
        }

        System.out.println("\n*ALARM NOISES*");
//        Toolkit.getDefaultToolkit().beep();
        playSound(filePath);
    }

    private void playSound(String filePath){
        File audioFile= new File(filePath);


        try(AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile)){
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
            System.out.print("Press enter to stop the alarm: ");
            scanner.nextLine();
            clip.stop();
            scanner.close();
        }catch(UnsupportedAudioFileException e){
            System.out.println("Audio file is not supported.");
        }catch (LineUnavailableException e){
            System.out.println("Audio is unavailable");
        } catch(IOException e){
            System.out.println("Error reading audio file");
        }
    }
}
