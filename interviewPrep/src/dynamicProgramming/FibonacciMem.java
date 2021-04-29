package dynamicProgramming;

import java.util.HashMap;
import java.util.Map;

public class FibonacciMem {

	/**
	 * Classic recursion
	 * 
	 * @param n
	 * @return
	 */
	public static long fib(int n) {
		/*
		 * if (n == 0) { return 0; }
		 */
		if (n == 1 || n == 2)
			return 1;
		return fib(n - 1) + fib(n - 2);

	}

	/**
	 * Memoize solution
	 */

	public static Long fibMem(Long n, Map<Long, Long> memo) {

		if (n == 0) {
			return 0L;
		}

		if (n == 1 || n == 2)
			return 1L;
		if (memo.containsKey(n)) {
			return memo.get(n);
		}
		long fibValue = (fibMem(n - 1, memo) + fibMem(n - 2, memo));
		memo.put(n, fibValue);
		return fibValue;

	}

}
