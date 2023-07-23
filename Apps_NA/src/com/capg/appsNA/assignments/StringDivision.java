package com.capg.appsNA.assignments;

public class StringDivision {
	public static void main(String[] args) {
		String str = "abcabcabc";
		int size = str.length();
		int div = 3,index=0;
		
		String res[] = new String[div];
		
		for(int i=0;i<size;i=i+(size/div)) {
			String ans = str.substring(i,i+(size/div));
			res[index] = ans;
			index++;
		}
		
		for(String s : res) {
			System.out.println(s);
		}
	}
}
