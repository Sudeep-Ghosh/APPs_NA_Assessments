package com.capg.appsNA.assignments;

public class PowerWithoutMath {
	public static void main(String[] args) {
		int x = 2, y= 3, res=1;
		
		for(int i=1;i<=y;i++) {
			res*=x;
		}
		System.out.println(res);
	}
}
