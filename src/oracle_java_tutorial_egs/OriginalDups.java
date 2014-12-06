//to know which words in the argument list occur only once and which occur more than once, but you do not want any duplicates printed out repeatedly. 
//This effect can be achieved by generating two sets — one containing every word in the argument list and the other containing only the duplicates. 
//The words that occur only once are the set difference of these two sets, which we know how to compute

package oracle_java_tutorial_egs;

import java.util.*;

public class OriginalDups {

	public static void main(String[] args) {
		
		Set<String> originals = new HashSet<>();
		Set<String> dups = new HashSet<>();
		
		for(String s : args){
			if(!originals.add(s))
				dups.add(s);
		}
		
		originals.removeAll(dups);
		System.out.println("Words occuring only once are: " + originals);
		System.out.println("words occuring more than once are: " + dups);

	}

}
