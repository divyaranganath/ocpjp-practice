//program showing usuage of appendReplacement() and appendTail() methods
package oracle_java_tutorial_egs;

import java.util.regex.*;

public class RegexAppend {

	private static String REGEX = "a*b";
	   private static String INPUT = "aabfooaabfooabfoob";
	   private static String REPLACE = "-";
	   
	public static void main(String[] args) {
		
		Pattern p = Pattern.compile(REGEX);
		Matcher m = p.matcher(INPUT);
		
		StringBuffer sb = new StringBuffer();
		
		while(m.find()){
			m.appendReplacement(sb, REPLACE);
		}

		m.appendTail(sb);
		System.out.println(sb.toString());
	}

}
