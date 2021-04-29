package interviewPrep;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * In this kata you have to correctly return who is the "survivor", ie: the last
 * element of a Josephus permutation.
 * 
 * Basically you have to assume that n people are put into a circle and that
 * they are eliminated in steps of k elements, like this:
 * 
 * josephus_survivor(7,3) => means 7 people in a circle; one every 3 is
 * eliminated until one remains [1,2,3,4,5,6,7] - initial sequence [1,2,4,5,6,7]
 * => 3 is counted out [1,2,4,5,7] => 6 is counted out [1,4,5,7] => 2 is counted
 * out [1,4,5] => 7 is counted out [1,4] => 5 is counted out [4] => 1 counted
 * out, 4 is the last element - the survivor!
 * 
 * @author Gautham Bhonsle
 *
 */

public class JosephusSurvivor {

	public static int josephusSurvivor(final int n, final int k) {
		if(k==1) {
			return n;
		}
		List<Integer> myList = IntStream.rangeClosed(1, n).boxed().collect(Collectors.toList());

		// Queue<Integer> q = new LinkedList<Integer>();
		int count = 0;
		while (myList.size() > 1) {
			Iterator it = myList.iterator();

			while (it.hasNext()) {
				it.next();
				count++;
				if (count % k == 0) {
					// System.out.println(it.next());
					it.remove();
					// System.out.println("cout is " + count + "after removing" +
					// myList.toString());
				}

			}
		}

		/*
		 * if(myList.isEmpty()) { return 0; }
		 */
		return myList.get(0);

	}

}
