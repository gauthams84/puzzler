package interviewPrep;

import java.util.Map;

/**
 * A robot is located at the top-left corner of a m x n grid (marked 'Start' in
 * the diagram below).
 * 
 * The robot can only move either down or right at any point in time. The robot
 * is trying to reach the bottom-right corner of the grid (marked 'Finish' in
 * the diagram below).
 * 
 * How many possible unique paths are there?
 * 
 * Input: m = 3, n = 2 Output: 3 Explanation: From the top-left corner, there
 * are a total of 3 ways to reach the bottom-right corner: 1. Right -> Down ->
 * Down 2. Down -> Down -> Right 3. Down -> Right -> Down
 * 
 * @author Gautham Bhonsle
 *
 */
/**
 * Explanation - Consider moving left as m and moving right as n. Visualizig the
 * grid , when you move right, the grid is reduced by 1 Similarly, moving down,
 * the grid is reduced by 1. hence its val = (m-1,n)+(m,n-1) Visualize this as a
 * tree. either m=0 or n=0 is invalid Base case is M=1 and N=1 ,there is only
 * one way, hence the base case Complexity - O(n*m) => O(n)
 * 
 * @author Gautham Bhonsle
 *
 */
public class GridTraveller {

	// Recursive solution
	public static Long gridTravellerRecursive(int m, int n) {
		if (m == 0 || n == 0) {
			return 0L;
		}
		if (m == 1 && n == 1)
			return 1L;

		return gridTravellerRecursive(m - 1, n) + gridTravellerRecursive(m, n - 1);

	}

	// Memoize
	public static Long gridTraveller(int m, int n, Map<String, Long> memo) {
		String key = String.valueOf(m) + "," + String.valueOf(n);
		Long val = 0L;
		if (m == 0 || n == 0) {
			return 0L;
		}
		if (m == 1 && n == 1)
			return 1L;

		if (memo.containsKey(key)) {
			return memo.get(key);
		}

		val = gridTraveller(m - 1, n, memo) + gridTraveller(m, n - 1, memo);
		memo.put(key, val);

		return val;
	}

}
