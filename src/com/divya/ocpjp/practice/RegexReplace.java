//program to show the usage of replaceFirst() and replaceAll() methods
package com.divya.ocpjp.practice;

import java.util.regex.*;

public class RegexReplace {

	private static String REGEX = "dog";
    private static String INPUT = "The dog says meow. " +
                                    "All dogs say meow.";
    private static String REPLACE = "cat";
    
	public static void main(String[] args) {
		
		Pattern p =Pattern.compile(REGEX);
		Matcher m = p.matcher(INPUT);
		
		System.out.println("original String is :" + INPUT);
		System.out.println("String after replace using replaceFirst() method is:"+ m.replaceFirst(REPLACE));
		System.out.println("String after replace using replaceAll() method is:"+ m.replaceAll(REPLACE));
		

	}

}
