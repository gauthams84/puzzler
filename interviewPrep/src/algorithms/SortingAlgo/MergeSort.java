package algorithms.SortingAlgo;

import java.util.Arrays;

/**
 * Split the array into 2, check if greater, then merge back
 * 
 * @author Gautham Bhonsle
 *
 */
public class MergeSort {

	private int[] tempArr;
	private int[] array;

	public void mergeSort(int[] arr) {
		this.tempArr = new int[arr.length];
		this.array = arr;
		doMergerSort(0, arr.length - 1);
		System.out.println(Arrays.toString(arr));

	}

	private void doMergerSort(int lowerIndex, int higherIndex) {
		if (lowerIndex < higherIndex) {
			// find middle
			int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
			// split the array -> recursively
			doMergerSort(lowerIndex, middle); // sort left side
			doMergerSort(middle + 1, higherIndex); // sort rigth side

			// merge the sort
			mergeSides(lowerIndex, middle, higherIndex);

		}

	}

	private void mergeSides(int lowerIndex, int middle, int higherIndex) {
		for (int i = lowerIndex; i <= higherIndex; i++) {
			tempArr[i] = array[i];
		}

		int i = lowerIndex;
		int j = higherIndex;
		int k = lowerIndex;
		while (i <= middle && j <= higherIndex) {
			if (tempArr[i] <= tempArr[j]) {
				array[k] = tempArr[i];
				i++;
			} else {
				array[k] = tempArr[j];
				j++;
			}
			k++;
		}
		while (i <= middle) {
			array[k] = tempArr[i];
			k++;
			i++;
		}

	}

}
