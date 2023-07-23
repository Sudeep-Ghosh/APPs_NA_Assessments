package com.capg.appsNA.assignments;

import java.util.Arrays;

public class DigitAsec {
	public static void main(String[] args) {
		int n=28156437,temp=n;
		
		String str = Integer.toString(n);
		int count = str.length();
		int[] res = new int[count];
		int index = count-1;
		
		while(temp!=0) {
			if(index<0) break;
			int lstDigit = temp%10;
			temp/=10;
			res[index]= lstDigit;
			index--;
		}
		Arrays.sort(res);
		for(int a : res) {
			System.out.print(a);
		}
		
	}
}
