package data.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.border.Border;

import data.controller.Controller;

public class DataPanel extends JPanel
{
	private Controller app;
	private SpringLayout layout;
	private JPanel fieldPanel;
	private JLabel testLabel; 
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private ImageIcon icon;
	private JLabel imageLabel; 
	private Border border;



	
	public DataPanel(Controller app)
	{
		super();
		
		this.app = app;
		this.layout = new SpringLayout();
		this.fieldPanel = new JPanel(new GridLayout(4,1));		
		this.testLabel = new JLabel("LABEL");
		this.button1 = new JButton("1");
		this.button2 = new JButton("2");
		this.button3 = new JButton("3");
		this.button4 = new JButton("4");
		this.icon = new ImageIcon("src/TextFiles/posscorps2.png");
		this.imageLabel = new JLabel("image");
		this.border = BorderFactory.createLineBorder(Color.cyan);


		
		setupPanel();
		setupLayout();
	}
	
	private void setupPanel()
	{
		this.setLayout(layout);
		this.setBackground(Color.lightGray);
		this.setPreferredSize(new Dimension(1024, 768));
		//this.add(testLabel);
		this.add(fieldPanel);		

		this.fieldPanel.add(button1);
		this.fieldPanel.add(button2);
		this.fieldPanel.add(button3);
		this.fieldPanel.add(button4);
		
		this.add(imageLabel);
		
		this.imageLabel.setVerticalTextPosition(JLabel.BOTTOM);
		this.imageLabel.setHorizontalTextPosition(JLabel.CENTER);
		this.imageLabel.setBorder(border);
		this.imageLabel.setIcon(icon);
	//	this.imageLabel.setBounds(0, 0, 100, 100);
		
		
		

		
	}
	
	private void setupLayout()
	{
		layout.putConstraint(SpringLayout.WEST, fieldPanel, -150, SpringLayout.EAST, this);
		layout.putConstraint(SpringLayout.EAST, fieldPanel, 0, SpringLayout.EAST, this);
		layout.putConstraint(SpringLayout.NORTH, fieldPanel, 0, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.SOUTH, fieldPanel, 0, SpringLayout.SOUTH, this);
		
		
		layout.putConstraint(SpringLayout.NORTH, imageLabel, 10, SpringLayout.NORTH, this);
		layout.putConstraint(SpringLayout.SOUTH, imageLabel, -10, SpringLayout.SOUTH, this);
		layout.putConstraint(SpringLayout.WEST, imageLabel, 150, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.EAST, imageLabel, -100, SpringLayout.WEST, fieldPanel);
		
	}

}
