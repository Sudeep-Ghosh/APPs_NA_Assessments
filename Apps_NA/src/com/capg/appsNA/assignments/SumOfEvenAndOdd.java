package com.capg.appsNA.assignments;

public class SumOfEvenAndOdd {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		int even=0,odd=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				even+=arr[i];
			}
			else
				odd+=arr[i];
		}
		System.out.println("Sum of Even: "+even+"\n"+"Sum of Odd: "+odd);
	}
}
