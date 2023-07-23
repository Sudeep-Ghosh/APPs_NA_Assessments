package com.capg.appsNA.assignments;

public class ArrayLeftRotation {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		int  size =arr.length,n=2;
		
		int pos=1;
		while(pos<=n) {
			int last = arr[0];
			for(int i=0;i<size-1;i++) {
				arr[i] = arr[i+1];
				
			}
			arr[size-1]=last;
			pos++;
		}
		for(int a : arr) {
			System.out.println(a);
		}
	}
}
