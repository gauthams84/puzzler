package interviewPrep;

/**
 * Welcome. In this kata, you are asked to square every digit of a number and
 * concatenate them.
 * 
 * For example, if we run 9119 through the function, 811181 will come out,
 * because 92 is 81 and 12 is 1.
 * 
 * Note: The function accepts an integer and returns an integer
 * 
 * @author KAUSHAL PC
 *
 */
public class SquareDigit {

	public int squareDigits(int n) {
		String digits = String.valueOf(n);
		String finalStr = "";
		for (int i = 0; i < digits.length(); i++) {
			finalStr += square((digits.charAt(i)));
		}

		return Integer.valueOf(finalStr);

	}

	private String square(char c) {
		int val;
		int n = Character.getNumericValue(c);
		val = n * n;
		return String.valueOf(val);

	}
	


}

/**
 * Best Solution
 */

/**
 *   public int squareDigits(int n) {
    String result = ""; 
    
    while (n != 0) {
      int digit = n % 10 ;
      result = digit*digit + result ;
      n /= 10 ;
    }
    
    return Integer.parseInt(result) ;
  }
 */


