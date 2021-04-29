package algorithms.SortingAlgo;

/**
 * Swap next element if it is greater
 * complexity is O(n) best case
 * complextit is O(n^2) worst case
 * 
 * @author Gautham Bhonsle
 *
 */
public class BubbleSort {

	public  static int[] sort(int[] arr) {
		int temp;
		boolean sorted = false;

		while (!sorted) {
			sorted = true;
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					sorted = false;
				}
			}
		}
		return arr;

	}
}
