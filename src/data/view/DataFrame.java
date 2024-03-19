package data.view;

import java.awt.Color;

import javax.swing.JFrame;

import data.controller.Controller;

public class DataFrame extends JFrame
{
	private Controller controller;
	
	private DataPanel panel; 
	
	public DataFrame(Controller controller)
	{
		super(); 
		this.controller = controller;
		this.panel = new DataPanel(controller);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(panel);
		this.setSize(800, 600);
		this.setTitle("DataStucts");
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
