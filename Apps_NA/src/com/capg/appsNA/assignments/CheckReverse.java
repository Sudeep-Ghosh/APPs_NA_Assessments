package com.capg.appsNA.assignments;

public class CheckReverse {
	public static void main(String[] args) {
		String s1 = "task", s2 = "ksat", res ="";
		
		if(s1.length()!=s2.length()) {
			System.out.println("false");
			return;
		}
		
		for(int i=s1.length()-1;i>=0;i--) {
			res+=s1.charAt(i);
		}
		if(res.equals(s2)) {
			System.out.println("true");
		}else System.out.println("false");
		
	}
}
