package interviewPrep;

import java.util.HashMap;
import java.util.Map;

/**
 * The goal of this exercise is to convert a string to a new string where 
 * each character in the new string is "(" if that character appears only 
 * once in the original string, or ")" if that character appears more
 *  than once in the original string. Ignore capitalization when determining 
 *  if a character is a duplicate.

Examples
"din"      =>  "((("
"recede"   =>  "()()()"
"Success"  =>  ")())())"
"(( @"     =>  "))((" 
 * @author KAUSHAL PC
 *
 */


public class DuplicateEncoder {
	static final String OPEN_BRACE = "(";
	static final String CLOSE_BRACE = ")";

	static String encode(String word) {
		StringBuilder finalStr = new StringBuilder();
		String[] strArr = word.toLowerCase().split("");
		Map<String, Integer> mp = new HashMap<String, Integer>();
		for (String c : strArr) {
			int count = 0;
			if (mp.containsKey(c)) {
				count = mp.get(c);
				count++;
				mp.put(c, count);
			} else {
				mp.put(c, 1);
			}
		}

		for (String c : strArr) {
			int count = 0;
			count = mp.get(c);
			if (count > 1) {
				finalStr.append(CLOSE_BRACE);
			} else {
				finalStr.append(OPEN_BRACE);
			}
		}

		return finalStr.toString();
	}
	
	/**
	 * BEst SOlution -> if occurence is only once, lastindex and index will be same.
	 *  Else different and close brace can be used.
	 */
	/**
	 *   static String encode(String word){
    word = word.toLowerCase();
    String result = "";
    for (int i = 0; i < word.length(); ++i) {
      char c = word.charAt(i);
      result += word.lastIndexOf(c) == word.indexOf(c) ? "(" : ")";
    }
    return result;
  }
	 */

}
