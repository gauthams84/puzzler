/**
 * #Find the missing letter

Write a method that takes an array of consecutive (increasing) letters as input and that returns the missing letter in the array.

You will always get an valid array. And it will be always exactly one letter be missing. The length of the array will always be at least 2.
The array will always contain letters in only one case.

Example:

['a','b','c','d','f'] -> 'e' ['O','Q','R','S'] -> 'P'
 */

package interviewPrep;

public class FindMissingLetter {
	
	public static char findMissingLetter(char[] array)
	  {
		char outlierChar = ' ';
		
		for(int i=0;i<array.length-1;i++) {
			if(array[i+1]- array[i] !=1) {
				int outlier =  array[i]+1;
				outlierChar = (char) outlier;
			}
		}
	    return outlierChar;
	  }

}
