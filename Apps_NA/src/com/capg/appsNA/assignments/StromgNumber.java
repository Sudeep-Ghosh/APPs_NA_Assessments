package com.capg.appsNA.assignments;
//Strong number =  145 1!+4!+5! =145 itself
public class StromgNumber {
	
	public static int factorial(int n) {
		int fact =1;
		for(int i=1;i<=n;i++) {
			fact*=i;
		}
		return fact;
	}
	
	public static void main(String[] args) {
		int n=145;
		int sum=0,temp=n,res=0;
		
		while(temp!=0) {
			res=temp%10;
			int fact = factorial(res);
			temp=temp/10;
			sum+=fact;
		}
		if(sum==n) {
			System.out.println("Strong Number");
		}
		else
			System.out.println("Not");
		
	}
}
