package dynamicProgramming;

import java.util.ArrayList;
import java.util.List;

/**
 * Same as HowSum, but best combination
 * 
 * @author Gautham Bhonsle
 *
 */
public class BestSum {

	

	public static List<Integer> bestSum(int targetSum, List<Integer> numbers) {
		List<Integer> shortestcombinaton = new ArrayList<>();
		 List<Integer> bestSumList = new ArrayList<>();
		if (targetSum == 0)
			return bestSumList;
		if (targetSum < 0)
			return null;

		for (Integer integer : numbers) {
			int remainder = targetSum - integer;
			List<Integer> combination = bestSum(remainder, numbers);
			if (combination != null) {
				combination.add(integer);
				/*
				 * if (shortestcombinaton.isEmpty() || (combination.size() <
				 * shortestcombinaton.size())) { shortestcombinaton.clear();
				 * shortestcombinaton.addAll(combination); }
				 */

				return combination;
			}
		}

		return null;

	}

}
