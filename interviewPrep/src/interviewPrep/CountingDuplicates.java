package interviewPrep;

import java.util.HashMap;
import java.util.Map;

/**
 * Count the number of Duplicates Write a function that will return the count of
 * distinct case-insensitive alphabetic characters and numeric digits that occur
 * more than once in the input string. The input string can be assumed to
 * contain only alphabets (both uppercase and lowercase) and numeric digits.
 * 
 * Example "abcde" -> 0 # no characters repeats more than once "aabbcde" -> 2 #
 * 'a' and 'b' "aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
 * "indivisibility" -> 1 # 'i' occurs six times "Indivisibilities" -> 2 # 'i'
 * occurs seven times and 's' occurs twice "aA11" -> 2 # 'a' and '1' "ABBA" -> 2
 * # 'A' and 'B' each occur twice
 * 
 * @author KAUSHAL PC
 *
 */
public class CountingDuplicates {
	public static int duplicateCount(String text) {

		String[] strArr = text.toLowerCase().split("");
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

		int count = 0;
		for (Map.Entry<String, Integer> entry : mp.entrySet()) {
			if (entry.getValue() > 1) {
				count++;
			}
		}

		return count;
		
	}
	


}
/**
 *     private static Map<Character, Long> charFrequenciesMap(final String text) {
        return text.codePoints()
            .map(Character::toLowerCase)
            .mapToObj(c -> (char) c)
            .collect(groupingBy(identity(), counting()));
    }
    
    static int duplicateCount(final String text) {
        return (int) charFrequenciesMap(text).values().stream()
            .filter(i -> i > 1)
            .count();
    }
 */

