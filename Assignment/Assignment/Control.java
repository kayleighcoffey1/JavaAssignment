package com.test.Assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import javax.swing.JFrame;
import com.test.Assignment.Screen;

import junit.framework.Test;

public class Control 
{
	public static void main(String[] args) throws FileNotFoundException
	{
		
			
			Screen Screen = new Screen("Assignment");
			Screen.setLocation(400,220);
			Screen.setSize(400,400);
			Screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
	
	
}
