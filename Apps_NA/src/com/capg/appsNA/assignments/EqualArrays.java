package com.capg.appsNA.assignments;

import java.util.Arrays;

public class EqualArrays {
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4};
		int[] arr2 = {1,2,3,4};
		
		if(Arrays.equals(arr1, arr2)) {
			System.out.println("Equal");
		}
		else
			System.out.println("Not Equal");
	}
}
