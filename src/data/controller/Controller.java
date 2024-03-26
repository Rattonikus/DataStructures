package data.controller;

import data.view.DataFrame;

public class Controller 
{
	
	private DataFrame window; 
	
	public Controller()
	{
		this.window = new DataFrame(this);
		//System.out.println(IOController.loadFileBinary(this, "file"));
	//	newText += "This is a moooodified data entry";

		
		
		
	}
	
	public void start()
	{
		//System.out.println(IOController.loadFileBinary(this, "file.txt"));
		//String fileString = new String("TEXTFILE TEST" + IOController.loadFileBinary(this, "file.txt"));
		//IOController.saveStringFile(this, "src/TextFiles", "Hi " + fileString);
	}
	
	public void handleError()
	{
		System.out.println("An error occured");
	}

}
