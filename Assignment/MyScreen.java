package com.test.Assignment;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class MyScreen extends JFrame implements ActionListener, MouseListener
{
	JTextField text1;
	JTextField text2;
	JButton button1;
	JButton button2;
	
	public MyScreen(String title)
	{
		super(title);
		setLayout(new FlowLayout());
		
		button1 = new JButton("Add Word");
		button1.addActionListener(this);
		add(button1);
		
		text1 = new JTextField("", 20);
		add(text1);
		addMouseListener(this);
		setVisible(true);
	
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0)
	{
		JOptionPane.showMessageDialog(this,"Mouse Clicked");
		// TODO Auto-generated method stub
		
	}

	public void mouseEntered(MouseEvent arg0) 
	{
		// TODO Auto-generated method stub
		
	}

	public void mouseExited(MouseEvent arg0) 
	{
		// TODO Auto-generated method stub
		
	}

	public void mousePressed(MouseEvent arg0) 
	{
		// TODO Auto-generated method stub
		
	}

	public void mouseReleased(MouseEvent arg0) 
	{
		// TODO Auto-generated method stub
		
	}

	public void actionPerformed(ActionEvent arg0) 
	{
		if(arg0.getSource() == button1)
		{
			//JOptionPane.showMessageDialog(this, text1.getText());
			String content = text1.getText();
			
			
			if(content == )
			{
				
			
		
			}//end inner if 
			else
			{
				JOptionPane.showInputDialog(this, "It's not the Same");
			}//end inner else
		}//end outer if
			
		else if (arg0.getSource() == button2)
		{
			JOptionPane.showMessageDialog(null, "Not the edit checking");
		}//end else if
			
			
	}//end ActionEvent
}//end class
	


