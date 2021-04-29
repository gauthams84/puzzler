package interviewPrep;

import java.util.List;

/**
 * Given a square matrix, calculate the absolute difference between the sums of its diagonals.

For example, the square matrix  is shown below:

1 2 3
4 5 6
9 8 9  
The left-to-right diagonal =1+5+9=15 . The right to left diagonal 3+5+9=17 . Their absolute difference is . 15-17 =2
 * @author Gautham Bhonsle
 *
 */
public class DiagonalDifference {
	public static int diagonalDifference(List<List<Integer>> arr) {
		int leftDiagonal = 0;
		int rightDiagonal = 0;
		int size = arr.size();
		for (int i = 0; i < arr.size(); i++) {
			leftDiagonal += arr.get(i).get(i); // always gets [0][0], [1][1] and [2,2]
			rightDiagonal += arr.get(i).get(size - 1 - i); // gets [0][2],[1][1], [2,0]
		}
		return Math.abs(leftDiagonal - rightDiagonal);
		
	}

}
