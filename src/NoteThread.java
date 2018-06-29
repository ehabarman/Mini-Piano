
public class NoteThread  extends Thread{
	/**
	 * create threads to run notes
	 * to run multiple notes at the same time
	 * */
	
	private String noteName;
	
	

	public NoteThread(String noteName2) {
		this.noteName=noteName2;
	}


	public void run()
	{
		if(SoundsGenerator.recording)
			{
			String line = noteName;
			SoundsGenerator.writer.println(line.replaceAll(".wav", ""));
			}
		Note note=new Note(noteName);
		note.playNote();
	}
}
