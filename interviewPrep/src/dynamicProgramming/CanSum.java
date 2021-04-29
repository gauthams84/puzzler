package dynamicProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Watch coderByte@FreeCodeCamo -
 * https://www.youtube.com/watch?v=oBt53YbR9Kk&t=4206s for solution explanation
 * 
 * Constraint - can use te same number twice or more to get to the targetsum
 * 
 * @author Gautham Bhonsle
 *
 */
public class CanSum {
	// brute force - Recursive
	public static boolean canSum(int targetSum, Integer[] num) {
		if (targetSum == 0)
			return true;
		if (targetSum < 0)
			return false;

		for (int i : num) {
			int remainder = targetSum - i;
			if (canSum(remainder, num) == true) {
				return true;
			}
		}

		return false;
	}

	// Gautham's solution
	public static boolean canSumGautham(int targetSum, Integer[] arr) {
		long startTime = System.currentTimeMillis();
		boolean isFound = false;
		List<Integer> myList = Arrays.asList(arr);
		for (Integer i : myList) {
			int remainder = targetSum - i;
			if (myList.contains(remainder) || remainder == 0) {
				isFound = true;
				break;
			}
			// return true;
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Gautham Time elapsed" + (endTime - startTime));
		return isFound;

	}

	// memoise
	public static boolean canSumMem(int targetSum, Integer[] arr, Map<Long, Boolean> memo) {

		if (memo.containsKey(targetSum)) {
			return memo.get(targetSum);
		}

		if (targetSum == 0)
			return true;
		if (targetSum < 0)
			return false;

		for (int i : arr) {
			int remainder = targetSum - i;
			if (canSumMem(remainder, arr, memo) == true) {
				memo.put((long) targetSum, true);
				return true;
			}
		}

		memo.put((long) targetSum, false);
		return false;
		// return false;

	}

}
