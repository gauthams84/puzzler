package interviewPrep;

/**
 * The Fibonacci numbers are the numbers in the following integer sequence (Fn):
 * 
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, ...
 * 
 * productFib(714) # should return (21, 34, true), # since F(8) = 21, F(9) = 34
 * and 714 = 21 * 34
 * 
 * productFib(800) # should return (34, 55, false), # since F(8) = 21, F(9) =
 * 34, F(10) = 55 and 21 * 34 < 800 < 34 * 55
 * 
 * @author Gautham Bhonsle
 *
 */
public class ProdFib {

	public static long[] productFib(long prod) {
		long[] finalResult = new long[3];
		for (int i = 3; i <= prod / 2; i++) {
			int fib1 = findFibNumber(i);
			int fib2 = findFibNumber(i + 1);

			if (fib1 * fib2 == prod) {
				finalResult[0] = fib1;
				finalResult[1] = fib2;
				finalResult[2] = 1;
				break;

			} else if (findFibNumber(i) * findFibNumber(i + 1) > prod) {
				finalResult[0] = fib1;
				finalResult[1] = fib2;
				finalResult[2] = 0;
				break;

			}

		}

		// your code
		return finalResult;
	}

	private static int findFibNumber(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1 || n == 2) {
			return 1;
		}
		return findFibNumber(n - 1) + findFibNumber(n - 2);
	}

}
