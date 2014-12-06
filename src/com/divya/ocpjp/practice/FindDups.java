//program takes a Sentence and prints the given sentence and removes repeated words and prints it


package com.divya.ocpjp.practice;

import java.util.HashSet;
import java.util.Set;

public class FindDups {

	
	public static void main(String[] args) {
		
		Set<String> s = new HashSet<String>();
		System.out.println("String entered is :");
		for(String m : args){
		System.out.print(m + " ");
		}
		System.out.println(" ");
		System.out.println("String size is:" + args.length);
		for(String a : args){
			s.add(a);
		}
		System.out.println("Set contains:"+ s);
		System.out.println("set size is:"+ s.size());

	}

}
