package interviewPrep;

import java.util.Arrays;

/**
 * Write a function that takes an integer as input, and returns the number of
 * bits that are equal to one in the binary representation of that number. You
 * can guarantee that input is non-negative.
 * 
 * Example: The binary representation of 1234 is 10011010010, so the function
 * should return 5 in this case
 * 
 * @author KAUSHAL PC
 *
 */

public class BitCounting {
	public static int countBits(int n){
		
		String bin = Integer.toBinaryString(n);
		return Arrays.stream(bin.split("")).mapToInt(i -> Integer.parseInt(i)).sum();
	//	return n;
		// Show me the code!
	}
	
}
