package com.capg.appsNA.assignments;

public class StringLength {
	public static void main(String[] args) {
		String str = "Sudeep";
		int count = 0;
		char[] arr = str.toCharArray();
		for(char c : arr) {
			count++;
		}
		System.out.println(count);
	}
}
