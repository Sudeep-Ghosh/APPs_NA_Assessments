package com.capg.appsNA.assignments;

public class GreatestPairArray {
	public static void main(String[] args) {
		
		int[] arr = {12,45,10,35,23};
		int max = 0,n=arr.length;
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				int sum = arr[i]+arr[j];
				if(sum>max) {
					max=sum;
				}
			}
		}
		
		System.out.println(max);
		
		
	}
}
