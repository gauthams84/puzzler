package interviewPrep;

import java.util.stream.IntStream;

/**
 * You are choreographing a circus show with various animals. For one act, you
 * are given two kangaroos on a number line ready to jump in the positive
 * direction (i.e, toward positive infinity).
 * 
 * The first kangaroo starts at location 'x1' and moves at a rate of 'v1' meters
 * per jump. The second kangaroo starts at location 'x2' and moves at a rate of
 * 'v2' meters per jump. You have to figure out a way to get both kangaroos at
 * the same location at the same time as part of the show. If it is possible,
 * return YES, otherwise return NO.
 * 
 * Example x1 = 2, v1 = 2, x2=1 and v2=2
 * 
 * After one jump, they are both at x=3 i.e, (x1+v1 (2=1)=3 , x2+v2 (1+2)=3), so
 * the answer is YES.
 * 
 * @author Gautham Bhonsle
 * 
 *         https://www.hackerrank.com/challenges/kangaroo/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
 *
 */

public class Kangaroo {

	static String kangarooJump(int x1, int v1, int x2, int v2) {

		String meet = "NO";
		int n = 10000;
		int i = 0;
		while (i < n) {
			x1 += v1;
			x2 += v2;
			if (x1 == x2) {
				meet = "YES";
				break;
			}
			i++;
		}
		System.out.println("n is" + i);
		return meet;

	}
}
