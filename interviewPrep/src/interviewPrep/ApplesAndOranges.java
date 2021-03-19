package interviewPrep;

import java.util.Arrays;

/**
 * https://www.hackerrank.com/challenges/apple-and-orange/problem?h_r=next-challenge&h_v=zen
 * 
 * @author Gautham Bhonsle
 * 
 *         Function Description
 * 
 *         Complete the countApplesAndOranges function in the editor below. It
 *         should print the number of apples and oranges that land on Sam's
 *         house, each on a separate line.
 * 
 *         countApplesAndOranges has the following parameter(s):
 * 
 *         s: integer, starting point of Sam's house location. t: integer,
 *         ending location of Sam's house location. a: integer, location of the
 *         Apple tree. b: integer, location of the Orange tree. apples: integer
 *         array, distances at which each apple falls from the tree. oranges:
 *         integer array, distances at which each orange falls from the tree.
 *
 */

/**
 * Answer is 1,1
 * The first apple falls at position 5-2=3. The second apple falls at position 5+2=7 . The
 * third apple falls at position 5+1=6 . The first orange falls at position 15+5=20 . The
 * second orange falls at position 15-6=9. Only one fruit (the second apple) falls
 * within the region between 7 and 11 , so we print as our first line of output. Only
 * the second orange falls within the region between 7 and 11, so we print as our
 * second line of output.
 * 
 * @author Gautham Bhonsle
 *
 */

public class ApplesAndOranges {
	// Complete the countApplesAndOranges function below.
	static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {

		int[] applesRange = Arrays.stream(apples).map(i -> i + a).toArray();
		int[] orangesRange = Arrays.stream(oranges).map(i -> i + b).toArray();

		int appleCount = (int) Arrays.stream(applesRange).filter(i -> (i >= s && i <= t)).count();

		int orangeCount = (int) Arrays.stream(orangesRange).filter(i -> (i >= s && i <= t)).count();

		Arrays.asList(appleCount, orangeCount).forEach(System.out::println);
	}

}
