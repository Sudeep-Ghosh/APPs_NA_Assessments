package com.capg.appsNA.assignments;

public class SpecificCharacterString {
	public static void main(String[] args) {
		String str = "aaacting";
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a') {
				count++;
			}
		}
		System.out.println(count);
	}
}
