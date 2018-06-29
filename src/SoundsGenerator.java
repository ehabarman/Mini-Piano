import java.io.PrintWriter;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class SoundsGenerator extends Application{
/**
 * 
 * @param args
 * main class
 */
	public static PrintWriter writer;
	public static boolean recording =false;
	public static NoteThread[] t = new NoteThread[24];
	public final static String PATH= ".\\Resources\\Piano Notes\\";
	public static Stage current;
	public static void main(String[] args)
	{
		
		Application.launch(args);
		
	}
	@Override
	public void start(Stage arg0) throws Exception {

		// main stage
		FXMLLoader loader = new FXMLLoader(this.getClass().getResource("piano.fxml"));
		Parent root = (Parent) loader.load();	
		Scene scene = new Scene(root);
		Stage current = new Stage();
		current.sizeToScene();
		current.setScene(scene);
		current.setTitle("Piano");
		current.show();
		
		PianoController controller = loader.<PianoController>getController();
        controller.focus();
		
        scene.setOnKeyPressed(e->{//run notes using keyboard input
	    	  switch(e.getCode()){//import javafx.scene.input.KeyCode;
	    	  case A :  createThread(PATH+"C_4.wav");
	    		  break;
	    	  case B :  createThread(PATH+"D_4.wav");
	    		  break;
	    	  case C :  createThread(PATH+"E_4.wav");
	    		  break;
	    	  case D :  createThread(PATH+"F_4.wav");
	    		  break;
	    	  case E :  createThread(PATH+"G_4.wav");
	    		  break;
	    	  case F :  createThread(PATH+"A_4.wav");
	    		  break;
	    	  case G :  createThread(PATH+"B_4.wav");
	    		  break;
	    	  case H :  createThread(PATH+"C_5.wav");
	    		  break;
	    	  case I :  createThread(PATH+"D_5.wav");
	    		  break;
	    	  case J :  createThread(PATH+"E_5.wav");
	    		  break;
	    	  case K :  createThread(PATH+"F_5.wav");
	    		  break;
	    	  case L :  createThread(PATH+"G_5.wav");
	    		  break;
	    	  case M :  createThread(PATH+"A_5.wav");
	    		  break;
	    	  case N :  createThread(PATH+"B_5.wav");
	    		  break;
	    	  case O :  createThread(PATH+"C#_4.wav");
	    		  break;
	    	  case P :  createThread(PATH+"D#_4.wav");
	    		  break;
	    	  case Q :  createThread(PATH+"F#_4.wav");
	    		  break;
	    	  case R :  createThread(PATH+"G#_4.wav");
	    		  break;
	    	  case S :  createThread(PATH+"A#_4.wav");
	    		  break;
	    	  case T :  createThread(PATH+"C#_5.wav");
	    		  break;
	    	  case U :  createThread(PATH+"D#_5.wav");
	    		  break;
	    	  case V :  createThread(PATH+"F#_5.wav");
	    		  break;
	    	  case W :  createThread(PATH+"G#_5.wav");
	    		  break;
	    	  case X :  createThread(PATH+"A#_5.wav");
	    		  break; 		      
	    	
			default:
				break;
	    	  }	    	  
	      });
		
		
	}
	
	public static void createThread(String name)
	{
		NoteThread t = new NoteThread(name);
		t.start();
	}
	
}


