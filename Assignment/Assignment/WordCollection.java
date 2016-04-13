/*Kayleigh Coffey DT211 C14350506
 * 
 * For my code I used lecture notes, code from labs, and online research using
 * Tutorials Point and StackOverflow
 * 
 * This assignment is The Abusive text detector one.
 */





package com.test.Assignment;

import java.io.BufferedReader;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import junit.framework.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WordCollection 
{
	 private static String newWord;
	 private static Scanner fp;
	 static ArrayList<String> arrayOfWords = new ArrayList<String>();
	 static File tweets = new File ("Tweets.txt");

	
	
	public WordCollection(String newWord)
	{
		this.setNewWord(newWord);
	}
	
	 public static void main(String args[]) throws IOException
	 {
		ArrayList listOfWords = new ArrayList();
		
		listOfWords = WordCollection.WordCheck();
		
		CompareListAndTweets(listOfWords);
		
		 
		  
		 
	 }
	 
	
	 
	 //METHOD FOR CHECKING THE ARRAY LIST AND CHECKING THE INSERTED
	 //WORD IS IN THE LIST
	public static ArrayList<String> WordCheck() throws FileNotFoundException
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
			
			
		myScanner.close();
		
		for (int i = 0; i < arrayOfWords.size();i++)
		{
			System.out.println("\n"+ arrayOfWords.get(i));
		}
		//System.out.println( arrayOfWords);
		
		return(arrayOfWords);
		
	}//end method
	
	public static int CompareListAndTweets(ArrayList listOfWords) throws IOException
	{
		//System.out.println("ARRAYLIST:" + arrayOfWords);
		int countOfWords = 0;
		File tweetsFile = new File ("Tweets.txt");
		Scanner TweetsScanner = new Scanner(tweetsFile);
		
		
		
		for (int i = 0; i < arrayOfWords.size();i++)
		{

			String currentWord;
			String listword = arrayOfWords.get(i);
			
			while(TweetsScanner.hasNext())
			{
				currentWord = TweetsScanner.next();
				
				if(listword.equals(currentWord))
				{
					System.out.println("Found a word");
					countOfWords++;
				}//if
			}//while
			
			
		}//for
		System.out.println(countOfWords);
		return countOfWords;
		
		
		

	}
	

	
	
	///////////////SETTERS AND GETTERS///////////////////
	public static File getTweets() {
		return tweets;
	}

	public void setTweets(File tweets) {
		this.tweets = tweets;
	}



	public static String getNewWord() {
		return newWord;
	}



	public static void setNewWord(String newWord) {
		WordCollection.newWord = newWord;
	}
			

	
}
