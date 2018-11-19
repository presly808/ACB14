package ua.artcode.week4.algo.recursion;

import java.util.Arrays;

/**
 * Created by serhii on 19.11.18.
 */
public class TestRec {

	public static void main(String[] args) {
		int[] mas = {1,2,3,4,5,6,7,8};
		printRec(mas, 0);
	}


	public static void printRec(int[] arr, int start){

		if(start == arr.length){
			return;
		}

		System.out.print(arr[start] + " ");

		printRec(arr, start + 1);
	}

	private static int[] copyOfRange(int[] arr, int start) {
		int[] newArr = new int[arr.length - start];
		for (int i = 0; i < newArr.length; i++) {
			newArr[i] = arr[start];
			start++;
		}

		return newArr;
	}


	public static void hello(){
		System.out.println("Hello");
		hello();
	}



}
