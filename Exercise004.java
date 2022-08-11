package com.exercise.demo;

import java.util.ArrayList;

public class Exercise004 {

	public static void main(String[] args) {
		
		ArrayList<String> animalnames = new ArrayList<String>();
		
		animalnames.add("Lion");
		animalnames.add("Tiger");
		animalnames.add("Cat");
		animalnames.add("Dog");
		animalnames.add("Cow");
	   
		System.out.println(animalnames);   //display animals
		
		animalnames.add(3,"horse");       //add animal horse
		
		for(String name:animalnames) {
			
	    System.out.println(name);         //display the list
	    
		}
	    
		
	}

}
