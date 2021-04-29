package interviewPrep;

import java.text.DecimalFormat;
import java.util.Arrays;

/**
 * Given an array of integers, calculate the ratios of its elements that are
 * positive, negative, and zero. Print the decimal value of each fraction on a
 * new line with 6 places after the decimal.
 * 
 * Note: This challenge introduces precision problems. The test cases are scaled
 * to six decimal places, though answers with absolute error of up to 10-4 are
 * acceptable.
 * 
 * Example arr = [1,1,0,-1,-1]
 * 
 * There are n=5 elements, two positive, two negative and one zero. Their ratios
 * are 2/5=0.400000, 2/5 = 0.400000, 1/5=0.200000 , and . Results are printed
 * as:
 * 
 * @author Gautham Bhonsle
 *
 */
public class Fraction {

	static void plusMinus(int[] arr) {
		Double[] resultArr = new Double[3];
		int positiveCount = 0;
		int negetiveCount = 0;
		int zeroCount = 0;
		for (int i : arr) {
			if (Math.signum(i) == 1) {
				positiveCount++;
			} else if (Math.signum(i) == -1) { 
				negetiveCount++;
			} else {
				zeroCount++;
			}
		}
		resultArr[0] = round6(divide(positiveCount, arr.length));
		resultArr[1] =round6( divide(negetiveCount, arr.length));
		resultArr[2] =  round6( divide(zeroCount, arr.length)) ;
		System.out.println(Arrays.toString(resultArr));

	}
	
	 public static double round6(double input) {
	        DecimalFormat df = new DecimalFormat("#.000000");
	        return Double.parseDouble(df.format(input));
	    }

	private static double divide(int signCount, int arrySize) {
		return signCount / arrySize;
	}

}
