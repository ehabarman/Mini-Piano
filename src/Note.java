import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

public class Note {
	/**
	 * raed note from pc then replay it
	 */
	private final int BUFFER_SIZE = 4000000;
	private File soundFile;
    private AudioInputStream audioStream;
    private AudioFormat audioFormat;
    private SourceDataLine sourceLine;
    
    public Note(String filename)
    {
    	 try {
             soundFile = new File(filename);
         } catch (Exception e) {
             e.printStackTrace();
             System.exit(1);
         }

         try {
             audioStream = AudioSystem.getAudioInputStream(soundFile);
         } catch (Exception e){
             e.printStackTrace();
             System.exit(1);
         }

         audioFormat = audioStream.getFormat();

         DataLine.Info info = new DataLine.Info(SourceDataLine.class, audioFormat);
         try {
             sourceLine = (SourceDataLine) AudioSystem.getLine(info);
             sourceLine.open(audioFormat);
         } catch (LineUnavailableException e) {
             e.printStackTrace();
             System.exit(1);
         } catch (Exception e) {
             e.printStackTrace();
             System.exit(1);
         }
    }
    
    public void playNote()
    {
        sourceLine.start();

        int nBytesRead = 0;
        byte[] abData = new byte[BUFFER_SIZE];
        while (nBytesRead != -1) {
            try {
                nBytesRead = audioStream.read(abData, 0, abData.length);
                
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (nBytesRead >= 0) {
                @SuppressWarnings("unused")
                int nBytesWritten = sourceLine.write(abData, 0, nBytesRead);
            }
        }

        sourceLine.drain();
        sourceLine.close();
    }

}
