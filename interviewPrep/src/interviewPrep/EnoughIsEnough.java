package interviewPrep;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Enough is enough! Alice and Bob were on a holiday. Both of them took many
 * pictures of the places they've been, and now they want to show Charlie their
 * entire collection. However, Charlie doesn't like these sessions, since the
 * motive usually repeats. He isn't fond of seeing the Eiffel tower 40 times. He
 * tells them that he will only sit during the session if they show the same
 * motive at most N times. Luckily, Alice and Bob are able to encode the motive
 * as a number. Can you help them to remove numbers such that their list
 * contains each number only up to N times, without changing the order?
 * 
 * Task Given a list lst and a number N, create a new list that contains each
 * number of lst at most N times without reordering. For example if N = 2, and
 * the input is [1,2,3,1,2,1,2,3], you take [1,2,3,1,2], drop the next [1,2]
 * since this would lead to 1 and 2 being in the result 3 times, and then take
 * 3, which leads to [1,2,3,1,2,3].
 * 
 * @author KAUSHAL PC
 *
 *
 *         Example EnoughIsEnough.deleteNth(new int[] {20,37,20,21}, 1) //
 *         return [20,37,21] EnoughIsEnough.deleteNth(new int[]
 *         {1,1,3,3,7,2,2,2,2}, 3) // return [1, 1, 3, 3, 7, 2, 2, 2]
 */

public class EnoughIsEnough {

	public static int[] deleteNth(int[] elements, int maxOccurrences) {
		
		if(elements.length==0) {
			return elements;
		}

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		boolean limitReached;
		List<Integer> newEl = new ArrayList<Integer>();
		for (int i : elements) {
			int count = 0;
			limitReached = false;
			if (map.containsKey(i)) {
				count = map.get(i);
				if (count == maxOccurrences) {
					limitReached = true;

				} else {
					count++;
				}
			} else {
				count++;
			}

			if (!limitReached) {

				map.put(i, count);

				newEl.add(i);
			}
		}

		int[] result = newEl.stream().mapToInt(i -> i).toArray();
		return result;
	}

}
