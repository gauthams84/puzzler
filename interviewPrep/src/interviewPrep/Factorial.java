package interviewPrep;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * n mathematics, the factorial of integer n is written as n!. It is equal to
 * the product of n and every integer preceding it. For example: 5! = 1 x 2 x 3
 * x 4 x 5 = 120
 * 
 * Your mission is simple: write a function that takes an integer n and returns
 * the value of n!.
 * 
 * You are guaranteed an integer argument. For any values outside the
 * non-negative range, return null, nil or None (return an empty string "" in C
 * and C++). For non-negative numbers a full length number is expected for
 * example, return 25! = "15511210043330985984000000" as a string.
 * 
 * For more on factorials, see http://en.wikipedia.org/wiki/Factorial
 * 
 * NOTES:
 * 
 * The use of BigInteger or BigNumber functions has been disabled, this requires
 * a complex solution
 * 
 * @author KAUSHAL PC
 *
 */
public class Factorial {
	public static String factorial(int n) {

		BigInteger sum = fetchFact(n);
		System.out.println("factorial of " + n + "is " + sum);
		return String.valueOf(sum);
	}

	private static BigInteger fetchFact(int n) {
		BigInteger factorial = BigInteger.ONE;
		for (int i = n; i > 0; i--) {
			factorial = factorial.multiply(BigInteger.valueOf(i));
		}
		return factorial;
	}

//	Read more:https:// javarevisited.blogspot.com/2015/08/how-to-calculate-large-factorials-using-BigInteger-Java-Example.html#ixzz6mp2dpBdc

}
