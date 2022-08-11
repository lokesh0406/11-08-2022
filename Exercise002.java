package com.exercise.demo;

import java.util.ArrayList;
import java.util.List;

public class Exercise002 {
	
public static void main(String[] args) {
		
	List<String> words = new ArrayList<String>();
	
	words.add("book");
	words.add("animal");
	words.add("clock");
	words.add("noise");
	words.add("sound");
	words.add("show");
	words.add("lokii");
    words.add("array");

    printWord(words);
	 
    }
	
	public static void printWord(List<String> words)
	
	{
	   for(String word:words) {
			
		if(word.length()==5)
      	  {
		System.out.println(word);
		  }
			
		}
     
    }
}
