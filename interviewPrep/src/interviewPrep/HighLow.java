/**
 * In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.

Example:

highAndLow("1 2 3 4 5")  // return "5 1"
highAndLow("1 2 -3 4 5") // return "5 -3"
highAndLow("1 9 3 4 -5") // return "9 -5"
Notes:

All numbers are valid Int32, no need to validate them.
There will always be at least one number in the input string.
Output string must be two numbers separated by a single space, and highest number is first.
 */
package interviewPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class HighLow {
	
	public static String highAndLow(String numbers) {
		List<Integer> sortList = new ArrayList<Integer>();
		Stream<String> st = Arrays.stream(numbers.split(" "));
		st.mapToInt(num -> Integer.parseInt(num)).forEach(i -> sortList.add(i));
		Collections.sort(sortList);
		String finalStr = "".concat(sortList.get(sortList.size()-1).toString()).concat(" ").
				concat(sortList.get(0).toString());
		//System.out.println(finalStr);
		return finalStr;

	  }
	
	/**
	 * Best sol
	 *     int min = Arrays.stream(numbers.split(" "))
                        .mapToInt(i -> Integer.parseInt(i))
                        .min()
                        .getAsInt();

        int max = Arrays.stream(numbers.split(" "))
                        .mapToInt(i -> Integer.parseInt(i))
                        .max()
                        .getAsInt();

        return String.format("%d %d", max, min);
	 */

}
