//program to find a digit string from the given alphanumeric string

package com.divya.ocpjp.practice;

import java.util.regex.*;

public class DigitFinder {

	public static void main(String[] args) {
		
		String line = "This order was placed for QT3000! OK?";
		String pattern = "(.*)(\\d+)(.*)";
		
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(line);
		
		System.out.println("capturing group count is : "+ m.groupCount());
		/*
		if(m.find()){
			System.out.println("Match found : "+ m.group(0));
			System.out.println("Match found : "+ m.group(1));
			System.out.println("Match found : "+ m.group(2));
			
			
		}
		else{
			System.out.println("No match found");
		}
		*/
		while(m.find()){
			System.out.println(m.group());
		}

	}

}
