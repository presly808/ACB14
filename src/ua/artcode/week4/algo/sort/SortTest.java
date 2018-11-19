package ua.artcode.week4.algo.sort;

import java.util.Arrays;

/**
 * Created by serhii on 19.11.18.
 */
public class SortTest {

	public static void main(String[] args) {
		int[] arr = {55,2,54,7,88,3,-5};
		int[] expected = {-5,2,3,7,54,55,88};

		int[] sorted = selectionSort(arr);

		System.out.println(Arrays.equals(expected, sorted));

		System.out.println(Arrays.toString(sorted));

	}


	public static int[] selectionSort(int[] arr){
		int[] copy = Arrays.copyOf(arr, arr.length);
		for (int pivot = 0; pivot < arr.length; pivot++) {

			int minI = pivot;

			for(int i = pivot + 1; i < arr.length; i++){
				if(copy[i] < copy[minI]){
					minI = i;
				}
			}

			int temp = copy[pivot];
			copy[pivot] = copy[minI];
			copy[minI] = temp;

		}

		return copy;
	}

}
