package com.capg.appsNA.assignments;

import java.util.Random;

public class ShuffleArray {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8};
		int n = arr.length;
		
		Random rd = new Random();
		
		for(int i=n-1;i>0;i--) {
			int j = rd.nextInt(i);
			
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		for(int a : arr) {
			System.out.println(a);
		}
	}
}
