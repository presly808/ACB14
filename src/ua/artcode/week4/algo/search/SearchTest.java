package ua.artcode.week4.algo.search;

/**
 * Created by serhii on 19.11.18.
 */
public class SearchTest {

	public static void main(String[] args) {
		// input data, expected result; invoke a methods by passing input data, method returns actual result, compare actual res with expected
		int size = 600_000_000;
		int[] mas = new int[size];
		for (int i = 0; i < size; i++) {
			mas[i] = i;
		}

		// positive test
		int target = size - 1;

		long start = System.currentTimeMillis();
		linearSearchTestPositive(mas, target, target);
		long end = System.currentTimeMillis();
		System.out.println(end - start);


		long start1 = System.currentTimeMillis();
		binarySearchTestPositive(mas, target, target);
		long end1 = System.currentTimeMillis();
		System.out.println(end1 - start1);
	}

	private static void linearSearchTestPositive(int[] arr, int target, int expectedResult) {

		int actualResult = linearSearch(arr, target);

		System.out.println(expectedResult == actualResult);
	}

	private static void binarySearchTestPositive(int[] arr, int target, int expectedResult) {

		int actualResult = binarySearch(arr, target);

		System.out.println(expectedResult == actualResult);
	}


	public static int linearSearch(int[] arr, int target){
		//
		for (int i = 0; i < arr.length; i++) {

			if(arr[i] == target){
				return i;
			}
		}

		return -1;
	}

	// arr must be sorted!!!
	public static int binarySearch(int[] arr, int target){
		int start = 0;
		int end = arr.length - 1;

		while (start <= end){
			int mid = (end + start) / 2;
			if(arr[mid] == target){
				return mid;
			} else if(target < arr[mid]){
				end = mid - 1;
			} else if(target > arr[mid]){
				start = mid + 1;
			}
		}

		return -1;
	}
}
