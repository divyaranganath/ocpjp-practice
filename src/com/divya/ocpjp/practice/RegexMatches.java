//program to shoe the use of lookingAt() and matches() methods
package com.divya.ocpjp.practice;

import java.util.regex.*;
public class RegexMatches {
	public static final String REGEX = "foo";
	public static final String INPUT = "fooooooooooooooo";
	
	

	public static void main(String[] args) {
		
	Pattern	p = Pattern.compile(REGEX);
	Matcher	m = p.matcher(INPUT);
	
	System.out.println("Using lookingAt(): Match found "+ m.lookingAt());
	System.out.println("Using matches() : Match found "+ m.matches());
		
		

	}

}
