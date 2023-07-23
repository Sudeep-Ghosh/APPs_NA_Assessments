package com.capg.appsNA.assignments;

public class NegativePower {
	public static void main(String[] args) {
		float x=2,y=-2,res=1;
		y=Math.abs(y);
		for(int i=1;i<=y;i++) {
			res*=x;
		}
		res=1/res;
		System.out.println(res);
	}
}
