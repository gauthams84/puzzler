package algorithms.SortingAlgo;

/**
 * Combination of search and sort. Search for the smallest element, place and
 * swap position Complexity - o(n^2)
 * 
 * @author Gautham Bhonsle
 *
 */
public class SelectionSort {
	public static int[] selectionSort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int minIndex = i;

			for (int j = i + 1; j < arr.length; j++) {
				// finding smallest
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
					// swapping
					int temp = arr[minIndex];
					arr[minIndex] = arr[i];
					arr[i] = temp;

				}
			}
		}

		return arr;

	}

}
