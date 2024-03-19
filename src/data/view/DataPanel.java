package data.view;

import java.awt.Color;

import javax.swing.JPanel;

import data.controller.Controller;

public class DataPanel extends JPanel
{
	private Controller app;
	
	public DataPanel(Controller app)
	{
		super();
		
		setupPanel();
	}
	
	private void setupPanel()
	{
		this.setBackground(Color.cyan);
	}

}
