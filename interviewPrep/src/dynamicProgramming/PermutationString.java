package dynamicProgramming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Compute permutation of strings
 * 
 * @author Gautham Bhonsle
 *
 */

/**
 * Step 1: Merge [a] and b: [ba, ab]
 * 
 * Step 2: Merge [ba, ab] and c: [cba, bca, bac, cab, acb, abc] -> adding c in
 * all possible places
 * 
 * Step 3: Merge [cba, bca, bac, cab, acb, abc] and d: [dcba, cdba, cbda, cbad,
 * dbca, bdca, bcda, bcad, dbac, bdac, badc, bacd, dcab, cdab, cadb, cabd, dacb,
 * adcb, acdb, acbd, dabc, adbc, abdc, abcd]
 * 
 * @author Gautham Bhonsle
 *
 */
public class PermutationString {

	public static String getMiddleOfPermutation(String s) {
		List<String> result = computePer(s);
		int middle = result.size() / 2;
		return result.get(middle - 1);
	}

	public static List<String> computePer(String s) {
		List<String> res = new ArrayList<>();

		if (s.length() == 1) {
			res.add(s);
		} else {
			// get last index
			int lastIndex = s.length() - 1;
			// get last char
			String last = s.substring(lastIndex);

			// get remaining
			String remainingStr = s.substring(0, lastIndex);

			// perform permutation on the rest of the string and merge
			res = merge(computePer(remainingStr), last);
		}
		Collections.sort(res);
		return res;

	}

	private static List<String> merge(List<String> remaining, String last) {
		List<String> res = new ArrayList<>();
		// loop through the string and
		for (String s : remaining) {
			
			// add the last character in all the possible places
			for (int i = 0; i <= s.length(); i++) {
				String p = new StringBuffer(s).insert(i, last).toString();
				res.add(p);
			}
		}
		return res;

	}

}
