package interviewPrep;

import java.util.Arrays;

/**
 * In this challenge, you are required to calculate and print the sum of the
 * elements in an array, keeping in mind that some of those integers may be
 * quite large.
 * 
 * @author Gautham Bhonsle
 *
 */
public class VeryBigSum {
	static long aVeryBigSum(long[] ar) {
		return Arrays.stream(ar).sum();

	}

}
