package interviewPrep;

/**
 * Let us consider this example (array written in general format):

ls = [0, 1, 3, 6, 10]

Its following parts:

ls = [0, 1, 3, 6, 10]
ls = [1, 3, 6, 10]
ls = [3, 6, 10]
ls = [6, 10]
ls = [10]
ls = []
The corresponding sums are (put together in a list): [20, 20, 19, 16, 10, 0]
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumParts {

	public static int[] sumParts(int[] ls) {

		int index = 0;
		List<Integer> sum = new ArrayList<Integer>();
		for (int i = index; i < ls.length; i++) {
			int[] subset = Arrays.copyOfRange(ls, index, ls.length);
			sum.add(Arrays.stream(subset).parallel().boxed().mapToInt(e -> e).sum());
			index++;
		}
		sum.add(0);
		return sum.parallelStream().mapToInt(i -> i).toArray();

	}
}
