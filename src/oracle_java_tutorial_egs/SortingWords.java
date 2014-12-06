//program takes a Sentence and prints the given sentence and removes repeated words and prints it in sorted order

package oracle_java_tutorial_egs;

import java.util.*;

public class SortingWords {
	
	public static void main(String[] args) {
		
				Set<String> s = new TreeSet<String>();
				System.out.println("String entered is :");
				for(String m : args){
				System.out.print(m + " ");
				}
				System.out.println(" ");
				System.out.println("String size is:" + args.length);
				for(String a : args){
					s.add(a);
				}
				//System.out.println("Set contains:"+ s);
				//System.out.println("set size is:"+ s.size());
				System.out.println(s.size() + " distinct words: " + s);

			}

			}

