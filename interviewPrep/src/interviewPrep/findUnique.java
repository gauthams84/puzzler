package interviewPrep;

import java.util.Arrays;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * There is an array with some numbers. All numbers are equal except for one.
 * Try to find it!
 * 
 * Kata.findUniq(new double[]{ 1, 1, 1, 2, 1, 1 }); // => 2 Kata.findUniq(new
 * double[]{ 0, 0, 0.55, 0, 0 }); // => 0.55 It’s guaranteed that array contains
 * at least 3 numbers.
 * 
 * The tests contain some very huge arrays, so think about performance.
 * 
 * @author KAUSHAL PC
 *
 */
public class findUnique {

	public static double findUniq(double arr[]) {

		Set<Entry<Double, Long>> mp = Arrays.stream(arr).boxed()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet();
		// Do the magic

		Entry<Double, Long> val = mp.stream().filter(e -> e.getValue() == 1).findFirst().get();

		return val.getKey();
	}
	
	/**
	 * return Arrays.stream(array).boxed()
                .collect(groupingBy(identity(), counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .findFirst()
                .map(Entry::getKey)
                .orElse(0.0);
	 */

}
