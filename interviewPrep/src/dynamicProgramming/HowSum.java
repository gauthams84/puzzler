package dynamicProgramming;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Given a target sum and list of numbers, output the ways in which the number
 * can be generated Eg - [7,[2,3,4,7]] -> [3,4], [7]
 * 
 * Similar to Can sum, but insteaed of true, return the array or list Watch
 * coderByte@FreeCodeCamo - https://www.youtube.com/watch?v=oBt53YbR9Kk&t=4206s
 * for solution explanation
 * 
 * @author Gautham Bhonsle
 * 
 *         from the taget, remove number one by one , visualize a tree, The only
 *         values that can be reduced are the the ones lesser than remainder in
 *         the tree. when removed if the value is 0, it means we satisfied the
 *         condition ->base case
 *
 */
public class HowSum {

	static List<Integer> newList = new ArrayList<>();
	static List<Integer> newarrList = new ArrayList<>();

	/**
	 * Recursive solution
	 * 
	 * @param targetSum
	 * @param num
	 * @return
	 */
	public static List<Integer> howSum(int targetSum, List<Integer> num) {
		if (targetSum == 0) // base case ->
			return newList;
		if (targetSum < 0)
			return null;

		for (Integer integer : num) {
			int remainder = targetSum - integer;
			List<Integer> myNewList = howSum(remainder, num);
			if (myNewList != null) {
				myNewList.add(integer);
				return myNewList;
			}
		}

		return null;

	}

	/**
	 * Memoize solution
	 * @param targetSum
	 * @param num
	 * @param memo
	 * @return
	 */
	public static List<Integer> howSumMem(int targetSum, List<Integer> num, Map<Integer, List<Integer>> memo) {
		if (targetSum == 0) // base case ->
			return newarrList;
		if (targetSum < 0)
			return null;

		if (memo.containsKey(targetSum)) {
			return memo.get(targetSum);
		}

		for (Integer integer : num) {
			int remainder = targetSum - integer;
			List<Integer> myNewList = howSumMem(remainder, num, memo);
			if (myNewList != null) {
				myNewList.add(integer);
				memo.put(targetSum, myNewList);
				return myNewList;
			}
		}
		memo.put(targetSum, null);
		return null;

	}

}
