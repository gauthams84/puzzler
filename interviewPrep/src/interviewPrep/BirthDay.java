package interviewPrep;

import java.util.List;

/**
 * Two children, Lily and Ron, want to share a chocolate bar. Each of the
 * squares has an integer on it.
 * 
 * Lily decides to share a contiguous segment of the bar selected such that:
 * 
 * The length of the segment matches Ron's birth month, and, The sum of the
 * integers on the squares is equal to his birth day. Determine how many ways
 * she can divide the chocolate.
 * 
 * Example s = [2,2,1,3,2] d=4, ->should be the sum m= 2 -> contiguous bar
 * 
 * 
 * Lily wants to find segments summing to Ron's birth day d=4, with a length
 * equalling his birth month, m=2. In this case, there are two segments meeting
 * her criteria: [2,2] and [1,3].
 * 
 * @author Gautham Bhonsle
 *
 */
public class BirthDay {

	static int birthday(List<Integer> s, int d, int m) {
		int count = 0;
		for (int i = 0; i < s.size() - m + 1; i++) {
			int j = i;
			int e = 1;
			int sum = 0;
			// m = 2, i.e 2 contiguous numbers
			// d = 4, i.e the sum
			while (e <= m) {
				sum += s.get(j);
				e++;
				j++;
			}
			if (sum == d) {
				count++;
			}
		}
		return count;

	}

}
