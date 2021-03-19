package interviewPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Return difference in the array of numbers. losing streak on hackerearth
 * @author Gautham Bhonsle
 *
 */

public class WorstLosingStreak {

	/*
	 * Complete the 'worstLosingStreak' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts
	 * INTEGER_ARRAY nums as parameter.
	 */

	public static int worstLosingStreak(List<Integer> nums) {
		List<Integer> intlist = new ArrayList<>();

		nums.forEach(i -> {
			System.out.println("i" + i + "index" + nums.indexOf(i));
			IntStream.rangeClosed(nums.indexOf(i), nums.size() - 1).forEach(e -> {
				System.out.println("e is" + e);
				int j = nums.get(e);

				//(1,8,4,2,10,3,2);
				// check if the array number is on the losing streak.
				if (i > j) {
					int diff = i - j;
					intlist.add(diff);
				}
			});
		});

		return intlist.stream().mapToInt(i -> i).max().getAsInt();

		/*
		 * for (int i : nums) { for (int j = nums.indexOf(i); j < nums.size(); j++) {
		 * int e = nums.get(j); if (i > e) { int diff = i - e; if (max < diff) { max =
		 * diff; } } } }
		 * 
		 * return max;
		 */
	}
	
	/**
	 * Imperative method
	 * @param nums
	 * @return
	 */
	public static int worstLosingStint(List<Integer> nums) {
		int max =0;
		for(int i=0;i<nums.size();i++) {
			for(int j=i+1;j<nums.size();j++) {
				if(nums.get(i)>nums.get(j)) {
					int diff = nums.get(i)-nums.get(j);
					if(max<diff) {
						max = diff;
					}
				}
			}
		}
		return max ;
		
	}

}
