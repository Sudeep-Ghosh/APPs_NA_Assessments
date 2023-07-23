package com.capg.appsNA.assignments;

public class GivenSumOfArray {
	public static void main(String[] args) {
		int[] arr = {1,5,3,7,9,4};
		int num = 8,n = arr.length;
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]+arr[j]==num) {
					System.out.println(arr[i]+"\n"+arr[j]);
					break;
				}
			}
		}
		
	}
}
