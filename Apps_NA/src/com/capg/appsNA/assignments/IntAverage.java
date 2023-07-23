package com.capg.appsNA.assignments;

import java.util.Scanner;

public class IntAverage {
	public static void main(String[] args) {
		int[] arr = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 integers: ");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int res=0;
		for(int a : arr) {
			res = res+a;
		}
		System.out.println(res/arr.length);
	}
}
