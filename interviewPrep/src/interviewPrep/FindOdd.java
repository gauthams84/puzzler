package interviewPrep;

import java.util.Arrays;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Given an array of integers, find the one that appears an odd number of times.
 * 
 * There will always be only one integer that appears an odd number of times.
 * 
 * @author KAUSHAL PC
 *
 */
public class FindOdd {
	public static int findIt(int[] a) {


		Set<Entry<Integer, Long>> mp = Arrays.stream(a).boxed()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet();// @formatter:off
	
		Entry<Integer, Long> val = mp.stream().filter(e -> e.getValue()%2!=0).findFirst().get();
 


		return val.getKey();
	}
}
