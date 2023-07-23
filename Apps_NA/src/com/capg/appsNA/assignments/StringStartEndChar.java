package com.capg.appsNA.assignments;

public class StringStartEndChar {
	public static void main(String[] args) {
		String str = "Madama",s1="",s2="";
		
		int n = str.length();
		s1=str.substring(0,2);
		s2=str.substring(n-2,n);
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("true");
		}
		else
			System.out.println("false");
		
	}
}
