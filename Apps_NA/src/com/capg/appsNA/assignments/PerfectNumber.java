package com.capg.appsNA.assignments;

public class PerfectNumber {
	public static void main(String[] args) {
		int n=6,rem=0,sum=0;
		
		for(int i=1;i<n;i++) {
			rem=n%i;
			if(rem==0) {
				sum+=i;
			}
		}
		if(sum==n) {
			System.out.println("Perfect Number");
		}
		else
			System.out.println("Not");
	}
}
