package interviewPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Write a function that, given a string of text (possibly with punctuation and
 * line-breaks), returns an array of the top-3 most occurring words, in
 * descending order of the number of occurrences.
 * 
 * Assumptions: A word is a string of letters (A to Z) optionally containing one
 * or more apostrophes (') in ASCII. (No need to handle fancy punctuation.)
 * Matches should be case-insensitive, and the words in the result should be
 * lowercased. Ties may be broken arbitrarily. If a text contains fewer than
 * three unique words, then either the top-2 or top-1 words should be returned,
 * or an empty array if a text contains no words. Examples: top_3_words("In a
 * village of La Mancha, the name of which I have no desire to call to mind,
 * there lived not long since one of those gentlemen that keep a lance in the
 * lance-rack, an old buckler, a lean hack, and a greyhound for coursing. An
 * olla of rather more beef than mutton, a salad on most nights, scraps on
 * Saturdays, lentils on Fridays, and a pigeon or so extra on Sundays, made away
 * with three-quarters of his income.") # => ["a", "of", "on"]
 * 
 * top_3_words("e e e e DDD ddd DdD: ddd ddd aa aA Aa, bb cc cC e e e") # =>
 * ["e", "ddd", "aa"]
 * 
 * top_3_words(" //wont won't won't") # => ["won't", "wont"]
 * 
 * @author KAUSHAL PC
 *
 */
public class TopWords {
	public static List<String> top3(String s) {
	
		List<String> result = new ArrayList<String>();
		List<String> r = new ArrayList<String>();
		String[] strAr = s.split(" ");
		for (String string : strAr) {
			//string = string.replaceAll("//", "");
			string = string.replaceAll("[^a-zA-Z0-9]/", "");
			r.add(string);
		}
		Set<Entry<String, Long>> mp = r.stream()
											.map(e -> e.toLowerCase())
											.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
											.entrySet();
		
		mp.stream().filter(x -> x.getKey()!=null)
		.filter(x -> x.getKey()!="")
		.sorted(Map.Entry.<String, Long>comparingByKey())
        .sorted(Map.Entry.<String, Long>comparingByValue().reversed()).limit(3)
      //  .filter(g ->g.getKey())
        .forEachOrdered(x -> result.add(x.getKey()));
		
		// Your code here
		return result;
	}

}
