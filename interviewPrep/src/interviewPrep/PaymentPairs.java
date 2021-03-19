package interviewPrep;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

/**
 * Return distinct pairs of tuples when thier sum is =100,
 * 
 * @author Gautham Bhonsle
 *
 */

public class PaymentPairs {
	public static long distinctPaymentPairs(List<Integer> payments) {
		int sum = 100;
		int count = 0;

		Map<Integer, Integer> pairs = new HashMap<Integer, Integer>();
		for (int i : payments) {
			if (pairs.containsKey(i)) {
				if (pairs.get(i) != null) {
					count++;
				}
				pairs.put(sum - i, null);
			} else if (!pairs.containsValue(i)) {
				pairs.put(sum - i, i);
			}
		}
		// return count;

		Map<Integer, Integer> pairsss = new HashMap();
		List<Integer> intList = new ArrayList<>();
		IntStream.range(0, payments.size()).forEach(i -> {
			if (pairsss.containsKey(payments.get(i))) {
				if (pairsss.get(payments.get(i)) != null) {
					intList.add(1);
					// count++;
				}
				pairsss.put(sum - payments.get(i), null);
			} else if (!pairsss.containsValue(payments.get(i))) {
				pairsss.put(sum - payments.get(i), payments.get(i));
			}
		});
		return intList.size();

	}

	public static long paymentPairs(List<Integer> nums) {
		int sum = 100;
		List<Integer> intList = new ArrayList<>();
		nums.forEach(i -> {
			System.out.println("i" + i + "index" + nums.indexOf(i));
			IntStream.rangeClosed(nums.indexOf(i) + 1, nums.size() - 1).forEach(e -> {
				System.out.println("e is" + nums.get(e));
				int j = nums.get(e);

				// (1,8,4,2,10,3,2);
				// check if the array number is on the losing streak.
				if (i + j == sum) {
					System.out.println("countincrease");
					intList.add(i);
				}
			});
		});
		return intList.size();
	}

	public static long imperatvePairs(List<Integer> nums) {
		int count = 0;
		int sum = 200;
		for (int i = 0; i < nums.size(); i++) {
			for (int j = i + 1; j < nums.size(); j++) {
				if (nums.get(i) + nums.get(j) == sum) {
					count++;
				}
			}
		}
		return count;

	}

}
