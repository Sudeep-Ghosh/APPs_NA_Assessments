package com.capg.appsNA.assignments;

public class Pattern53 {
	public static void main(String[] args) {
		int n =4;
		
		for(int i=1;i<=n;i++) {
			
			for(int j=i;j<=n-1;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=n;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
