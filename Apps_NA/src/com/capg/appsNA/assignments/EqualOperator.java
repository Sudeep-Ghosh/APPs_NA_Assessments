package com.capg.appsNA.assignments;

public class EqualOperator {
	public static void main(String[] args) {
		String str1 = "Sudeep";
		String str2 = new String("Sudeep");
		String str3 = new String("sudeep");
		String str4 = "Sudeep";
		if(str1 == str4) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
		if(str2.equals(str3)) {
			System.out.println("True");
		}
		else
			System.out.println("false");
	}
}
