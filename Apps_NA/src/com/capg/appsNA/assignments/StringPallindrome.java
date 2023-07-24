package com.capg.appsNA.assignments;

public class StringPallindrome {
	public static void main(String[] args) {
        // TODO Auto-generated method stub
        String str = "MADAM";

        String rev = "";
        char ch;

        for(int i=0; i<str.length();i++) {
            ch = str.charAt(i);
            rev = ch + rev;
        }

        if(rev.equals(str)) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }

 

    }
}
