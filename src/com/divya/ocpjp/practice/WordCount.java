//program that counts the number of times the word "cats" appears in the input string
package com.divya.ocpjp.practice;

import java.util.regex.*;

public class WordCount {

	
	public static void main(String[] args) {
		
		String pattern = "\\bcat\\b";
		String line = "cat cat cat cattie cat";
		
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(line);
		
		int count = 0;
		
		while(m.find()){
			count++;
		}
		
		System.out.println("Word " + pattern.replaceAll("\\\\b", "") + "is found "+ count + "times in " + line);
	}

}
