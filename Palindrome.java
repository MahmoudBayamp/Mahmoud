package com.bayamp.utils;

public class Palindrome {

	public static boolean checkPalindrome(String str){
		
		if(str == null)
			return false;

		StringBuffer myString = new StringBuffer(str);
		myString.reverse();

		return str.equalsIgnoreCase(myString.toString());	
	}

	public static boolean checkPalindrome(char c){

		StringBuffer myString = new StringBuffer(c);
		myString.reverse();

		return myString.equals(c);

	}

}
