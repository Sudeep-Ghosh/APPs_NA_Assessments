package com.capg.appsNA.assignments;

import java.util.Arrays;

public class SecondLargestElementArray {
	public static void main(String[] args) {
		int[] arr = {2,56,2,78,43,21,3};
		
		Arrays.sort(arr);
		System.out.println(arr[arr.length-2]);
	}
}
