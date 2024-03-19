package data.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class IOController
{
	public static String loadFileBinary(Controller app, String path)
	{
		String contents = "";
		
		try
		{
			File saveFile = new File(path);
			
			if (saveFile.exists())
			{
				FileInputStream textFile = new FileInputStream(saveFile);
				
				int result = textFile.read();
				char letter = (char) result; 
				while (result != -1)
				{
					contents += Character.toString(letter);
					result = textFile.read();
					letter = (char) result; 
				}
				
				textFile.close();
			}
		}
		catch(IOException error)
		{
			app.handleError();
		}
		catch(Exception genericError)
		{
			app.handleError();
		}
		
		return contents;
	}

}
