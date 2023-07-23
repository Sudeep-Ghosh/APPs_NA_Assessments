package com.capg.appsNA.assignments;

public class VowelsConstants {
	public static void main(String[] args) {
		String str = "aeiouhgjkla";
		int n = str.length();
		int vowel=0, cons=0;
		
		for(int i=0;i<n;i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)== 'o' || str.charAt(i)=='u') {
				vowel++;
			}
			else cons++;
		}
		
		System.out.println("Vowels: "+vowel+" Constant: "+cons);
		
	}
}
