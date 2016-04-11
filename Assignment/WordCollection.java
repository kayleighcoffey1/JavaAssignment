package com.test.Assignment;

import java.io.BufferedReader;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WordCollection 
{
	 private static String newWord;
	 private static Scanner fp;
	 ArrayList<String> arrayOfWords = new ArrayList<String>();
	 static File tweets = new File ("abusivetweets.txt");
	//static File tweets;
	
	
	/*public WordCollection(String newWord)
	{
		this.setNewWord(newWord);
	}//end constructor*/
	
	 public static void main(String args[]) throws IOException
	 {
		 //File tweets = new File ("abusivetweets.txt");
		 //create object of file reader
		 FileReader readfile = new FileReader(tweets);
		 //open file
		 //instantiate the bufferedreader class
		 BufferedReader bufferReader = new BufferedReader(readfile);
		 
		 //variable to hold the one line of data
		 String line;
		 
	 }
	
	 
	 //METHOD FOR CHECKING THE ARRAY LIST AND CHECKING THE INSERTED
	 //WORD IS IN THE LIST
	public ArrayList<String> WordCheck() throws FileNotFoundException
	{
		
	
		Scanner myScanner = null;
		File file = new File("BadLanguageList.txt");
		myScanner = new Scanner(file);
		//ArrayList<String> arrayOfWords = new ArrayList<String>();
		
		while(myScanner.hasNext())
		{
			String line = myScanner.next();
			
			
			Scanner newScanner = new Scanner(line);
			newScanner.useDelimiter(line);
			newScanner.useDelimiter(",\\s*");
			
			while(newScanner.hasNext())
			{
				arrayOfWords.add(newScanner.next());
			}//end inner while
			
			newScanner.close();
			
		}//end while
			
		if(arrayOfWords.contains(getTweets())){
			System.out.println("This word is already in the list!");
		}
		else
		{
			System.out.println("Word is not in the list!");
		}
			
		myScanner.close();
		System.out.println( arrayOfWords);
		
		return(arrayOfWords);
		
	}//end method
	
	public static void CompareListAndTweets()
	{
		
	}
	
	

	
	
	///////////////SETTERS AND GETTERS///////////////////
	public static File getTweets() {
		return tweets;
	}

	public void setTweets(File tweets) {
		this.tweets = tweets;
	}
			

	
}
