package com.capg.appsNA.assignments;

public class PyramidByChar {
	public static void main(String[] args) {
		int n =5;
		char c = 'A';
		
		for(int i=1;i<=n;i++) {
			for(int j=n-1;j>=i;j--) {
				System.out.print(" "); 
			}
			for(int k=1;k<=(2*i)-1;k++) {
				System.out.print(c);
				c++;
			}
			System.out.println();
		}
	}
}
