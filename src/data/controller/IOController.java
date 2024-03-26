package data.controller;

import java.io.*;
import java.time.LocalDateTime;
import java.util.Scanner;

public class IOController
{
	public static String loadFileBinary(Controller app, String path)
	{
		String contents = "";	//Contents, this will be the final result
		
		try
		{
			File saveFile = new File(path);	//Set file to the path we give
			
			if (saveFile.exists())		//If the file exists...
			{
				FileInputStream textFile = new FileInputStream(saveFile);	//Start new fileinput stream
				
				int result = textFile.read();	//Iterate over the file, and read each char
				char letter = (char) result; 
				while (result != -1)		
				{
					contents += Character.toString(letter);	//Convert to string
					result = textFile.read();
					letter = (char) result; 
				}
				
				textFile.close();	//Close the file stream
			}
		}
		catch(IOException error)		//Handle errors
		{
			app.handleError();
		}
		catch(Exception genericError)
		{
			app.handleError();
		}
		
		return contents;
	}
	
	public static void saveStringFile(Controller app, String path, String textToSave)
	{
		String filename = path;
		LocalDateTime date = LocalDateTime.now();
		filename += "/" + date.getMonth() + "" + date.getDayOfMonth();
		filename += "datastruct.txt";
		
		File saveFile = new File(filename);
		
		try(FileOutputStream fileOutput = new FileOutputStream(saveFile, true); Scanner textScanner = new Scanner(textToSave))
		{
			while (textScanner.hasNext())
			{
				String currentLine = textScanner.nextLine() + "\n";
				byte[] currentLineAsByte = currentLine.getBytes();
				fileOutput.write(currentLineAsByte);
			}
			//filename += "\n" + date.getHour() + ":" + date.getMinute() + "\n";
			//fileOutput.write(filename.getBytes());
		}
		catch(IOException error)
		{
			System.out.println("IOError!" + error);
		}
		catch(Exception error)
		{
			System.out.println("Generic error! " + error);
		}
	}
}
