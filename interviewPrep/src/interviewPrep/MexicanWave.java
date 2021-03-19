package interviewPrep;

import java.util.ArrayList;
import java.util.List;

/**
 * In this simple Kata your task is to create a function that turns a string
 * into a Mexican Wave. You will be passed a string and you must return that
 * string in an array where an uppercase letter is a person standing up.
 * wave("hello") => []string{"Hello", "hEllo", "heLlo", "helLo", "hellO"}
 * 
 * @author KAUSHAL PC
 *
 */
public class MexicanWave {
	
	 public static String[] wave(String str) {

		 List<String> result = new ArrayList<String>();
		 for(int i =0; i<str.length(); i++) {
			 StringBuilder strBuilder = new StringBuilder(str);
			 char s = str.charAt(i);
			 if(s != ' ') {
			 strBuilder.setCharAt(i, Character.toUpperCase(s));
			 result.add(strBuilder.toString());
			 }
		 }
	        // Your code here
	        return result.toArray(new String[result.size()]);
	    }
	 
	 /**
	  * Better code
	  * 
	  *         String[] result = IntStream.range(0, str.length())
                .mapToObj(n ->
                        str.substring(0, n) + Character.toUpperCase(str.charAt(n)) + str.substring(n + 1)
                )
                .filter(a -> !a.equals(str)) // filter to remove same string caused due to space
                .toArray(String[]::new);
        
        return result;
	  */

}
