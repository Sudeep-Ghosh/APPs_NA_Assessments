package com.capg.appsNA.assignments;

public class StringStartingContent {
	public static void main(String[] args) {
		String str1 = "Apps NA";
		String str2 = "Apps Europe";
		String[] arr = str1.split(" ");
		
		if(str1.startsWith(arr[0])) {
			System.out.println("true");
		}
		else
			System.out.println("false");
	}
}
