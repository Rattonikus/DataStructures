package data.controller;

import data.view.DataFrame;

public class Controller 
{
	
	private DataFrame window; 
	
	public Controller()
	{
		this.window = new DataFrame(this);
	}
	
	public void start()
	{
		System.out.println(IOController.loadFileBinary(this, "file.txt"));
	}
	
	public void handleError()
	{
		System.out.println("An error occured");
	}

}
