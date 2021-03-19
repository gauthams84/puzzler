package interviewPrep;

import java.util.ArrayList;
import java.util.List;

/**
 * Divisors of 42 are : 1, 2, 3, 6, 7, 14, 21, 42. These divisors squared are:
 * 1, 4, 9, 36, 49, 196, 441, 1764. The sum of the squared divisors is 2500
 * which is 50 * 50, a square!
 * 
 * Given two integers m, n (1 <= m <= n) we want to find all integers between m
 * and n whose sum of squared divisors is itself a square. 42 is such a number.
 * 
 * The result will be an array of arrays or of tuples (in C an array of Pair) or
 * a string, each subarray having two elements, first the number whose squared
 * divisors is a square and then the sum of the squared divisors.
 * 
 * Examples: list_squared(1, 250) --> [[1, 1], [42, 2500], [246, 84100]]
 * list_squared(42, 250) --> [[42, 2500], [246, 84100]]
 * 
 * @author KAUSHAL PC
 *
 */
public class SumSquaredDivisors {

	public static String listSquared(long m, long n) {
		System.out.println(m);
		System.out.println(n);
		StringBuffer resultArray = new StringBuffer("[");
		StringBuffer resultAr = new StringBuffer();
		for (int i = (int) m; i < n; i++) {
			 resultAr = printDivisors(i);
			if (resultAr.length()!=0) {
				resultArray.append(resultAr).append(", ");
			}
		}
		if(resultArray.lastIndexOf(",")!=-1) {
		resultArray.deleteCharAt(resultArray.lastIndexOf(","));
		}
		if(resultArray.lastIndexOf(" ")!=-1) {
		resultArray.deleteCharAt(resultArray.lastIndexOf(" "));
		}
		resultArray.append("]");
		return resultArray.toString();
		
	}

	static StringBuffer printDivisors(int n) {
		List<Integer> squared = new ArrayList<>();
		// int[] res = null;
		StringBuffer str = new StringBuffer();
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				squared.add(i * i);
		}

		int sum = squared.stream().mapToInt(i -> i).sum();
		if (Math.sqrt(sum) % 1 == 0) {
			str.append("[").append(String.valueOf(n)).append(", ").append(String.valueOf(sum)).append("]");
			/*
			 * res = new int[2]; res[0] = n; res[1] = sum;
			 */
		}

		return str;
	}
	
	/**
	 * Better code
	 * public static String listSquared(long m, long n) {
        // your code
        String result = "[";
        for(long i=m; i<=n; i++) {
            if(Math.round(Math.sqrt(sumOfSquareDivisors(i))) == Math.sqrt(sumOfSquareDivisors(i))) {
                result+= "["+i +", "+sumOfSquareDivisors(i)+"], ";
            }
        }
        return result.length()>1 ? result.substring(0, result.length()-2)+"]" : "[]";
    }
    
    
    public static long sumOfSquareDivisors(long n) {
        return LongStream.range(1, n + 1)
                .filter(i -> n % i == 0)
                .map(i -> i * i)
                .sum();
    }
}
	 */

}
