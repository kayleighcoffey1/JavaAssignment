package com.test.Assignment;


import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;



public class Screen extends JFrame implements ActionListener, MouseListener
{
		JTextField users_tweet;
		JButton test_tweet;
		File file = new File("BadLanguageList.txt");
		
		JButton add;
		JButton remove;
		JTextField add_remove;
		
		public Screen(String title)
		{
			super(title);
			
			getContentPane().setLayout(new FlowLayout());
			
			JLabel label1 = new JLabel ("testing");
			label1.setText("Label Text");
	
			users_tweet = new JTextField("", 160);
			getContentPane().add(users_tweet);
			addMouseListener(this);
			setVisible(true);
			users_tweet.setColumns(10);
			
			test_tweet =  new JButton("Display Word List");
			test_tweet.addActionListener(this);
			getContentPane().add(test_tweet);
			
			JSeparator separator = new JSeparator();
			getContentPane().add(separator);
			
			add = new JButton("Check abusive words in Text File");
			add.addActionListener(this);
			getContentPane().add(add);
			
			
			
		}
		

		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			
			if(arg0.getSource()== test_tweet){
			try {
				JOptionPane.showMessageDialog(this, WordCollection.WordCheck());
			} catch (HeadlessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
			}
			}
			
			else if(arg0.getSource() == add){
				try {
					JOptionPane.showMessageDialog(null, WordCollection.CompareListAndTweets(null));
				} catch (HeadlessException | IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			//displays word list file
			
				
			
			
		}

		


		@Override
		public void mouseClicked(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
		
		
}
