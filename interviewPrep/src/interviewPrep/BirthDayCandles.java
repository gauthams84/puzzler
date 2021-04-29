package interviewPrep;

import java.util.List;

/**
 * ou are in charge of the cake for a child's birthday. You have decided the
 * cake will have one candle for each year of their total age. They will only be
 * able to blow out the tallest of the candles. Count how many candles are
 * tallest.
 * 
 * Example
 * 
 * candles = [4,4,1,3] The maximum height candles are 4 units high. There are of
 * 2 them, so return 2 .
 * 
 * @author Gautham Bhonsle
 *
 */
public class BirthDayCandles {
	public static int birthdayCakeCandles(List<Integer> candles) {

		int max = (int) candles.stream().mapToInt(i -> i).max().getAsInt();
		return (int) candles.stream().filter(i -> i == max).count();
	}
}
