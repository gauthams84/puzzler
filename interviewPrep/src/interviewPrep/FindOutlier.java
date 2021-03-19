package interviewPrep;

import java.util.ArrayList;
import java.util.List;

/**
 * package interviewPrep; You are given an array (which will have a length of at
 * least 3, but could be very large) containing integers. The array is either
 * entirely comprised of odd integers or entirely comprised of even integers
 * except for a single integer N. Write a method that takes the array as an
 * argument and returns this "outlier" N.
 * 
 * Examples [2, 4, 0, 100, 4, 11, 2602, 36] Should return: 11 (the only odd
 * number)
 * 
 * [160, 3, 1719, 19, 11, 13, -21] Should return: 160 (the only even number)
 * 
 * @author KAUSHAL PC
 *
 */

public class FindOutlier {

	static int find(int[] integers) {
		List <Integer> odd = new ArrayList<Integer>();
		List <Integer> even = new ArrayList<Integer>();
		
		for (int i : integers) {
			// odd outlier
			if (i % 2 == 0) {
				even.add(i);
			}else {
				odd.add(i);
			}

		}

		if(odd.size()==1) {
			return odd.get(0);
		}else {
			return even.get(0);
		}
	}
	
	/**
	 * Best sol
	 *   static int find(int[] integers){
    int[] odd = Arrays.stream(integers).filter(n -> n % 2 != 0).toArray();
    int[] even = Arrays.stream(integers).filter(n -> n % 2 == 0).toArray();

    return odd.length == 1 ? odd[0] : even[0];
}
	 */

}
