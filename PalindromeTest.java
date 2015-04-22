package com.bayamp.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.bayamp.utils.Palindrome;



public class PalindromeTest {

	@Test(priority=1)
	public static void positiveTestPalindrome1(){
		String checkWord = "malayalam";
		boolean expectedResult = true;
		boolean actualResult = Palindrome.checkPalindrome(checkWord);
		Assert.assertEquals(actualResult, expectedResult);
	}

	@Test(priority=2)
	public static void positiveTestPalindrome2() {
		String checkWord = "Golu";
		boolean expectedResult = false;
		boolean actualResult = Palindrome.checkPalindrome(checkWord);
		Assert.assertEquals(actualResult,expectedResult);
	}

	@Test(priority=3)
	public static void positiveTestPalindrome3() {
		String checkWord = "MAlayaLam";//mixed cased letters
		boolean expectedResult = true;
		boolean actualResult = Palindrome.checkPalindrome(checkWord);
		Assert.assertEquals(actualResult,expectedResult);
	}

	@Test(priority=4)
	public static void negativeTestPalindrome1() {
		String checkWord = "MA layaLam";//space in between
		boolean expectedResult = false;
		boolean actualResult = Palindrome.checkPalindrome(checkWord);
		Assert.assertEquals(actualResult,expectedResult);
	}

	@Test(priority=5)
	public static void negativeTestPalindrome2() {
		String checkWord = " MAlayaLam";//space in front of word
		boolean expectedResult = false;
		boolean actualResult = Palindrome.checkPalindrome(checkWord);
		Assert.assertEquals(actualResult,expectedResult);
	}

	@Test(priority=6)
	public static void negativeTestPalindrome3() {
		String checkWord = "so1mam1os";//alphanumeric
		boolean expectedResult = true;
		boolean actualResult = Palindrome.checkPalindrome(checkWord);
		Assert.assertEquals(actualResult,expectedResult);
	}

	@Test(priority=7)
	public static void negativeTestPalindrome4() {
		String checkWord = "%A$n.n$A%";//special characters and letters
		boolean expectedResult = true;
		boolean actualResult = Palindrome.checkPalindrome(checkWord);
		Assert.assertEquals(actualResult,expectedResult);
	}

	@Test(priority=8)
	public static void positiveTestPalindrome5() {
		//if we ignore space its a palindrome
		String checkWord = "race car";
		boolean expectedResult = true;
		boolean actualResult = Palindrome.checkPalindrome(checkWord);
		Assert.assertEquals(actualResult,expectedResult);
	}

	@Test(priority=9)
	public static void negativeTestPalindrome6() {
		String checkWord = null;
		boolean expectedResult = false;
		boolean actualResult = Palindrome.checkPalindrome(checkWord);
		Assert.assertEquals(actualResult,expectedResult);
	}

	@Test(priority=10)
	public static void negativeTestPalindrome7() {
		String checkWord = " ";
		boolean expectedResult = false;
		boolean actualResult = Palindrome.checkPalindrome(checkWord);
		Assert.assertEquals(actualResult,expectedResult);
	}

	@Test(priority=11)
	public static void negativeTestPalindrome8() {
		//if we ignore space its a palindrome
		char checkWord = ' ';
		boolean expectedResult = false;
		boolean actualResult = Palindrome.checkPalindrome(checkWord);
		Assert.assertEquals(actualResult,expectedResult);
	}
}