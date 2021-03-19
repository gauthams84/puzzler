package interviewPrep;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * A pangram is a sentence that contains every single letter of the alphabet at
 * least once. For example, the sentence "The quick brown fox jumps over the
 * lazy dog" is a pangram, because it uses the letters A-Z at least once (case
 * is irrelevant).
 * 
 * Given a string, detect whether or not it is a pangram. Return True if it is,
 * False if not. Ignore numbers and punctuation.
 * 
 * @author KAUSHAL PC
 *
 */
public class PangramChecker {
	public boolean check(String sentence){
		
		//sentence = StringUtils.normalizeSpace(sentence).strip().trim();
		sentence = sentence.replace(" ", "");

		
		Map<String,Long> mapping =
		Arrays.stream(sentence.split("")).map(String::toLowerCase)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		//Entry<String, Long> val = mapping.entrySet().stream().filter(x -> x.getValue()>1).findFirst().get();
		for(char alphabet = 'a'; alphabet <='z'; alphabet ++ )
        {

            if(!mapping.containsKey(String.valueOf(alphabet))) {
            	return false;
            }
        }
		
		return  true;
	    //code
	  }
	
	/**
	 * Clever
	 * 
	 *     boolean check(final String sentence) {
        return sentence.chars()
            .filter(Character::isLetter)
            .map(Character::toLowerCase)
            .distinct()
            .count() == 26;
    }
	 */

}
