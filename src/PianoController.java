import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.SequenceInputStream;
import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.FileChooser;

public class PianoController {

	/**
	 * controller for fxml file
	 */
	String name;
	@FXML
	private Rectangle c1, d1, e1, f1,g1,a1, b1, c2, d2,e2
	, f2,a2,g2,b2, cd1, de1, cd2,de2, fg1, fg2, ga1,ga2,
	ab1, ab2;
	
	@FXML
	private Button load;
	
	@FXML
	private Label msg;
	
	@FXML
	private Button record;

	private File file;
	public void clickedRect1()
	{
		NoteThread t = new NoteThread(SoundsGenerator.PATH+"C_4.wav");
		c1.setFill(Color.BLUE);
		t.start();
	}
	
	@FXML
	public void clickedRect2()
	{
		NoteThread t = new NoteThread(SoundsGenerator.PATH+"D_4.wav");
		d1.setFill(Color.BLUE);
		t.start();
	}
	
	@FXML
	public void clickedRect3()
	{
		NoteThread t = new NoteThread(SoundsGenerator.PATH+"E_4.wav");
		e1.setFill(Color.BLUE);
		t.start();
	}
	
	@FXML
	public void clickedRect4()
	{
		NoteThread t = new NoteThread(SoundsGenerator.PATH+"F_4.wav");
		f1.setFill(Color.BLUE);
		t.start();
	}
	
	@FXML
	public  void clickedRect5()
	{
		NoteThread t = new NoteThread(SoundsGenerator.PATH+"G_4.wav");
		g1.setFill(Color.BLUE);
		t.start();
	}
	
	@FXML
	public  void clickedRect6()
	{
		NoteThread t = new NoteThread(SoundsGenerator.PATH+"A_4.wav");
		a1.setFill(Color.BLUE);
		t.start();
	}
	
	@FXML
	public  void clickedRect7()
	{
		NoteThread t = new NoteThread(SoundsGenerator.PATH+"B_4.wav");
		b1.setFill(Color.BLUE);
		t.start();
	}
	
	@FXML
	public  void clickedRect8()
	{
		NoteThread t = new NoteThread(SoundsGenerator.PATH+"C_5.wav");
		c2.setFill(Color.BLUE);
		t.start();
	}
	
	@FXML
	public  void clickedRect9()
	{
		NoteThread t = new NoteThread(SoundsGenerator.PATH+"D_5.wav");
		d2.setFill(Color.BLUE);
		t.start();
	}
	
	@FXML
	public  void clickedRect10()
	{
		NoteThread t = new NoteThread(SoundsGenerator.PATH+"E_5.wav");
		e2.setFill(Color.BLUE);
		t.start();
	}
	
	@FXML
	public  void clickedRect11()
	{
		NoteThread t = new NoteThread(SoundsGenerator.PATH+"F_5.wav");
		f2.setFill(Color.BLUE);
		t.start();
	}
	
	@FXML
	public   void clickedRect12()
	{
		NoteThread t = new NoteThread(SoundsGenerator.PATH+"G_5.wav");
		g2.setFill(Color.BLUE);
		t.start();
	}
	
	@FXML
	public   void clickedRect13()
	{
		NoteThread t = new NoteThread(SoundsGenerator.PATH+"A_5.wav");
		a2.setFill(Color.BLUE);
		t.start();
	}
	
	@FXML
	public   void clickedRect14()
	{
		NoteThread t = new NoteThread(SoundsGenerator.PATH+"B_5.wav");
		b2.setFill(Color.BLUE);
		t.start();
	}
	
	@FXML
	public   void clickedRect15()
	{
		NoteThread t = new NoteThread(SoundsGenerator.PATH+"C#_4.wav");
		cd1.setFill(Color.RED);
		t.start();
	}
	
	@FXML
	public   void clickedRect16()
	{
		NoteThread t = new NoteThread(SoundsGenerator.PATH+"D#_4.wav");
		de1.setFill(Color.RED);
		t.start();
	}
	
	@FXML
	public   void clickedRect17()
	{
		NoteThread t = new NoteThread(SoundsGenerator.PATH+"F#_4.wav");
		fg1.setFill(Color.RED);
		t.start();
	}
	
	@FXML
	public   void clickedRect18()
	{
		NoteThread t = new NoteThread(SoundsGenerator.PATH+"G#_4.wav");
		ga1.setFill(Color.RED);
		t.start();
	}
	
	@FXML
	public   void clickedRect19()
	{
		NoteThread t = new NoteThread(SoundsGenerator.PATH+"A#_4.wav");
		ab1.setFill(Color.RED);
		t.start();
	}
	
	@FXML
	public   void clickedRect20()
	{
		NoteThread t = new NoteThread(SoundsGenerator.PATH+"C#_5.wav");
		t.start();
		cd2.setFill(Color.RED);
	}
	
	@FXML
	public   void clickedRect21()
	{
		NoteThread t = new NoteThread(SoundsGenerator.PATH+"D#_5.wav");
		t.start();
		de2.setFill(Color.RED);
	}
	
	@FXML
	public   void clickedRect22()
	{
		NoteThread t = new NoteThread(SoundsGenerator.PATH+"F#_5.wav");
		fg2.setFill(Color.RED);
		t.start();
	}
	
	@FXML
	public   void clickedRect23()
	{
		NoteThread t = new NoteThread(SoundsGenerator.PATH+"G#_5.wav");
		ga2.setFill(Color.RED);
		t.start();
	}
	
	@FXML
	public   void clickedRect24()
	{
		NoteThread t = new NoteThread(SoundsGenerator.PATH+"A#_5.wav");
		ab2.setFill(Color.RED);
		t.start();
	}
	
	
	@FXML
	public void mouseReleased()
	{
		c1.setFill(Color.WHITE);
		c2.setFill(Color.WHITE);
		d1.setFill(Color.WHITE);
		d2.setFill(Color.WHITE);
		e1.setFill(Color.WHITE);
		e2.setFill(Color.WHITE);
		f1.setFill(Color.WHITE);
		f2.setFill(Color.WHITE);
		g1.setFill(Color.WHITE);
		g2.setFill(Color.WHITE);
		a1.setFill(Color.WHITE);
		a2.setFill(Color.WHITE);
		b1.setFill(Color.WHITE);
		b2.setFill(Color.WHITE);
		cd1.setFill(Color.BLACK);
		cd2.setFill(Color.BLACK);
		de1.setFill(Color.BLACK);
		de2.setFill(Color.BLACK);
		fg1.setFill(Color.BLACK);
		fg2.setFill(Color.BLACK);
		ga1.setFill(Color.BLACK);
		ga2.setFill(Color.BLACK);
		ab1.setFill(Color.BLACK);
		ab2.setFill(Color.BLACK);

	}
	
	@FXML
	public void KeyPressed(KeyEvent e){
		switch (e.getCode()) {
		case A:c1.setFill(Color.BLUE);
			break;
		case B:d1.setFill(Color.BLUE);
			break;
		case C :e1.setFill(Color.BLUE); 
		  	break;
		case D :f1.setFill(Color.BLUE);
		  	break;
		case E :g1.setFill(Color.BLUE);
		  	break;
		case F :a1.setFill(Color.BLUE);
		  	break;
		case G :b1.setFill(Color.BLUE);
		  	break;
		case H :c2.setFill(Color.BLUE);
		  	break;
		case I :d2.setFill(Color.BLUE);
		  	break;
		case J :e2.setFill(Color.BLUE);
		  	break;
		case K :f2.setFill(Color.BLUE);
		  	break;
		case L :g2.setFill(Color.BLUE);
		  	break;
		case M :a2.setFill(Color.BLUE);
		  	break;
		case N :b2.setFill(Color.BLUE);
		  	break;
		case O : cd1.setFill(Color.RED);
		  	break;
		case P :de1.setFill(Color.RED);
		  	break;
		case Q :fg1.setFill(Color.RED);
		  	break;
		case R :ga1.setFill(Color.RED);
		  	break;
		case S : ab1.setFill(Color.RED);
		  	break;
		case T : cd2.setFill(Color.RED);
		  	break;
		case U : de2.setFill(Color.RED);
		  	break;
		case V :fg2.setFill(Color.RED);
		  	break;
		case W : ga2.setFill(Color.RED);
		  	break;
		case X :ab2.setFill(Color.RED);
		  	break;

	  default:
		  break;
	  }	
	}

	@FXML
	public void KeyReleased(KeyEvent e){
		switch (e.getCode()) {
		case A:c1.setFill(Color.WHITE);
		break;
	case B:d1.setFill(Color.WHITE);
		break;
	case C :e1.setFill(Color.WHITE); 
	  	break;
	case D :f1.setFill(Color.WHITE);
	  	break;
	case E :g1.setFill(Color.WHITE);
	  	break;
	case F :a1.setFill(Color.WHITE);
	  	break;
	case G :b1.setFill(Color.WHITE);
	  	break;
	case H :c2.setFill(Color.WHITE);
	  	break;
	case I :d2.setFill(Color.WHITE);
	  	break;
	case J :e2.setFill(Color.WHITE);
	  	break;
	case K :f2.setFill(Color.WHITE);
	  	break;
	case L :g2.setFill(Color.WHITE);
	  	break;
	case M :a2.setFill(Color.WHITE);
	  	break;
	case N :b2.setFill(Color.WHITE);
	  	break;
	case O :cd1.setFill(Color.BLACK);
	  	break;
	case P :de1.setFill(Color.BLACK);
	  	break;
	case Q :fg1.setFill(Color.BLACK);
	  	break;
	case R :ga1.setFill(Color.BLACK);
	  	break;
	case S :ab1.setFill(Color.BLACK);
	  	break;
	case T :cd2.setFill(Color.BLACK);
	  	break;
	case U :de2.setFill(Color.BLACK);
	  	break;
	case V :fg2.setFill(Color.BLACK);
	  	break;
	case W :ga2.setFill(Color.BLACK);
	  	break;
	case X :ab2.setFill(Color.BLACK);
	  	break;

	  default:
		  break;
	  }	
	}
	
	public void focus() {
		// TODO Auto-generated method stub
	    c1.requestFocus();
	}
	
	public void loadSymphony() throws FileNotFoundException, InterruptedException
	{
		msg.setText("");
		focus();
		FileChooser Chooser = new FileChooser();
		file = Chooser.showOpenDialog(SoundsGenerator.current);
		try{
			if(file!=null||file.toString().compareTo("")!=0)
			{
			Scanner s= new Scanner(file);
			if(file.toString().substring(file.toString().length()-4).compareTo(".wav")==0)
			{
				Note n = new Note(file.toString());
				n.playNote();
				return;
			}

			while(s.hasNextLine()){
				String line=s.nextLine();
				String[] notes=line.split(" ");
					
				for(int i=0;i<notes.length;i++)
				{
					
					if(notes[i].compareTo("C_4")==0)
					{
					
						NoteThread t = new NoteThread(notes[i]+".wav");
						t.start();

					}
					else if(notes[i].compareTo("D_4")==0)
					{
						
						NoteThread t = new NoteThread(notes[i]+".wav");
						t.start();
					}
					else if(notes[i].compareTo("E_4")==0)
					{
 
						NoteThread t = new NoteThread(notes[i]+".wav");
						t.start();
					}
					else if(notes[i].compareTo("F_4")==0)
					{

						NoteThread t = new NoteThread(notes[i]+".wav");
						t.start();
					}
					else if(notes[i].compareTo("G_4")==0)
					{
						
						NoteThread t = new NoteThread(notes[i]+".wav");
						t.start();
					}
					else if(notes[i].compareTo("A_4")==0)
					{
						NoteThread t = new NoteThread(notes[i]+".wav");
						t.start();
					}
					else if(notes[i].compareTo("B_4")==0)
					{
						NoteThread t = new NoteThread(notes[i]+".wav");
						t.start();
					}
					else if(notes[i].compareTo("C_5")==0)
					{
						NoteThread t = new NoteThread(notes[i]+".wav");
						t.start();
					}
					else if(notes[i].compareTo("D_5")==0)
					{
						NoteThread t = new NoteThread(notes[i]+".wav");
						t.start();
					}
					else if(notes[i].compareTo("E_5")==0)
					{		
						NoteThread t = new NoteThread(notes[i]+".wav");
						t.start();
					}
					else if(notes[i].compareTo("F_5")==0)
					{
						NoteThread t = new NoteThread(notes[i]+".wav");
						t.start();
					}
					else if(notes[i].compareTo("G_5")==0)
					{
						NoteThread t = new NoteThread(notes[i]+".wav");
						t.start();
					}
					else if(notes[i].compareTo("A_5")==0)
					{
						NoteThread t = new NoteThread(notes[i]+".wav");
						t.start();
					}
					else if(notes[i].compareTo("B_5")==0)
					{
						NoteThread t = new NoteThread(notes[i]+".wav");
						t.start();
					}
					else if(notes[i].compareTo("C#_4")==0)
					{
						NoteThread t = new NoteThread(notes[i]+".wav");
						t.start();
					}
					else if(notes[i].compareTo("D#_4")==0)
					{
						NoteThread t = new NoteThread(notes[i]+".wav");
						t.start();
					}
					else if(notes[i].compareTo("F#_4")==0)
					{
						NoteThread t = new NoteThread(notes[i]+".wav");
						t.start();
					}
					else if(notes[i].compareTo("G#_4")==0)
					{
						NoteThread t = new NoteThread(notes[i]+".wav");
						t.start();
					}
					else if(notes[i].compareTo("A#_4")==0)
					{
						NoteThread t = new NoteThread(notes[i]+".wav");
						t.start();
					}
					else if(notes[i].compareTo("C#_5")==0)
					{
						NoteThread t = new NoteThread(notes[i]+".wav");
						t.start();
					}
					else if(notes[i].compareTo("D#_5")==0)
					{
						NoteThread t = new NoteThread(notes[i]+".wav");
						t.start();
					}
					else if(notes[i].compareTo("F#_5")==0)
					{
						NoteThread t = new NoteThread(notes[i]+".wav");
						t.start();
					}
					else if(notes[i].compareTo("G#_5")==0)
					{
						NoteThread t = new NoteThread(notes[i]+".wav");
						t.start();
					}
					else if(notes[i].compareTo("A#_5")==0)
					{
						NoteThread t = new NoteThread(notes[i]+".wav");
						t.start();
					}
					
					
				}
			
				
				Thread.sleep(800);
			}
			s.close();
			}
		}
		catch(Exception e)
		{
			
		}
		
		}

	
	
	
	@FXML
	public void recording() throws UnsupportedAudioFileException, IOException
	{
		focus();
		
		if(SoundsGenerator.recording)
		{
			msg.setVisible(false);
			SoundsGenerator.recording=false;
			SoundsGenerator.writer.close();
			saveWavSymphony(name);
			
		}
		else
		{
			msg.setVisible(true);
			SoundsGenerator.recording=true;
			try {
				DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
				Date date = new Date();
				name=dateFormat.format(date).toString();
				name=name.replace(' ', '_');
				name=name.replaceAll(":", "");
				name=name.replaceAll("/", "");
				msg.setText("Recording on "+name);
				SoundsGenerator.writer = new PrintWriter(name+".txt", "UTF-8");
			} catch (FileNotFoundException e) {
				System.out.println(e.getMessage());
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void saveWavSymphony(String filename) throws UnsupportedAudioFileException, IOException
	{
		File f = new File(filename+".txt");
		Scanner s = new Scanner(f);
		ArrayList<String> list= new ArrayList<>();
		
		while(s.hasNextLine())
			list.add(s.nextLine()+".wav");
		
		
		if(list.size()==0) {

			return;
		}
		if(list.size()==1)
		{
			AudioInputStream clip = AudioSystem.getAudioInputStream(new File(list.get(0)));
			AudioSystem.write(clip,AudioFileFormat.Type.WAVE, new File(filename+".wav"));
		}
		else
		{
			
			AudioInputStream appendedFiles=appendRecusivly(list,0);
			AudioSystem.write(appendedFiles,AudioFileFormat.Type.WAVE, new File(filename+".wav"));
		}
		
	}
	
	 public static AudioInputStream appendRecusivly(ArrayList<String> list,int i) throws UnsupportedAudioFileException, IOException
	  {//appending method recusivly
		  if(list.size()-1<=i)
				return AudioSystem.getAudioInputStream(new File(list.get(i)));
		
			
		  
		  AudioInputStream clip1 = AudioSystem.getAudioInputStream(new File(list.get(i)));
		  AudioInputStream clip2 = appendRecusivly(list,i+1);
		  return new AudioInputStream(new SequenceInputStream(clip1, clip2),clip1.getFormat(),clip1.getFrameLength() + clip2.getFrameLength());
		  
		 
	  }
		
	
}
