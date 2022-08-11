package com.exercise.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    public class Exercise003 {

	public static void main(String[] args) {
	
	List<String> words = new ArrayList<String>();
			
	words.add("bookss");
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
	Scanner sc = new Scanner(System.in);

	System.out.println("enter the word length: ");

	int length = sc.nextInt(); 
				
				
	for(int i=0; i< words.size();i++)  {
					
     	String	n=words.get(i);
				
			if(n.length()== length)
   			{
					
				System.out.println(n);   
					
				}
			sc.close();
		}

	}
			

}
