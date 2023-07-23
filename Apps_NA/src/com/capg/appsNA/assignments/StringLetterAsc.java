package com.capg.appsNA.assignments;

import java.util.Arrays;

public class StringLetterAsc {
	public static void main(String[] args) {
		String str = "program";
		char[] arr = str.toCharArray();
		
		Arrays.sort(arr);
		for(char c : arr) {
			System.out.print(c);
		}
	}
}
