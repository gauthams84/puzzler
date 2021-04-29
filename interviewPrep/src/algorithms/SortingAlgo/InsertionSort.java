package algorithms.SortingAlgo;

/**
 * always start with index 1 not index 0
 * Take an element, check against preious, swap, check again n the same
 * iteration, if lesser swap. Complexity - o(n) best case Complexity o(n^2)
 * worst case
 * 
 * @author Gautham Bhonsle
 *
 */

public class InsertionSort {

	public static int[] insertSort(int[] arr) {
		int temp;
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j] < arr[j - 1]) {
					temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}

		}

		return arr;

	}

}
