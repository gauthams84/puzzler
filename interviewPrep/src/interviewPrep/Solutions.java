package interviewPrep;

import org.apache.commons.lang3.StringUtils;

public class Solutions {
	
/**
* Trolls are attacking your comment section!
* A common way to deal with this situation is to remove all of the vowels from the trolls' comments, neutralizing the threat.
* Your task is to write a function that takes a string and return a new string with all vowels removed.
* For example, the string "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".
*/
	static char [] vowels = {'a', 'e', 'i', 'o', 'u'};
	
	public static String disemvowel(String str) {
		
		String [] sa = str.split(" ");
		
		StringBuffer finalStr = new StringBuffer();
		for (String s : sa) {
			for(char v : vowels) {
				s = s.replaceAll(Character.toString(v), "");
				s = s.replaceAll(Character.toString(v).toUpperCase(), "");
			}
			
			finalStr.append(s).append(" ");
			
		}
		return finalStr.toString().trim().strip();
        
    }
	
	/** Best solution
	 *  public static String disemvowel(String Z) {
        return Z.replaceAll("(?i)[aeiou]" , "");
    }
    
    OR
    
      public static String disemvowel(String str) {
      return str.replaceAll("[aeiouAEIOU]", "");
  } 
    
	 */

}
