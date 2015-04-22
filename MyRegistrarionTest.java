package com.bayamp.tests;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyRegistrarionTest {

	private By searchFieldLocator = By.id("twotabsearchtextbox");
	private By searchButtonLocator = By.xpath("//input[@type='submit']");
	private By selectItemLocator = By.xpath("/html/body/div[1]/div[1]/div[4]/div[2]/div/div[4]/div[1]/div/ul/li[5]/div/div[1]/div/div/a/img");
	private By selectAddtoCartLocator = By.id("add-to-cart-button");
	private By selectNoCoverageLocator = By.id("siNoCoverage-announce");
	private By selectProceedToCheckOutLocator = By.id("hlb-ptc-btn-native");
	private By typeUserNameLocator = By.id("ap_email");
	private By typeUserPasswordLocator = By.id("ap_password");
	private By selectSignInLocator = By.id("signInSubmit-input");

	private String userName = "user";
	private String userPassword = "pass";
	private String product = "tv";

	@Test
	public void shoppingCart() throws InterruptedException{

		//open amazon.com
		//which browser
		//search for product
		//add product to shopping cart

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.amazon.com");


		//Type tv text
		WebElement searchField = driver.findElement(searchFieldLocator);
		searchField.sendKeys(product);

		//Click on search image
		WebElement searchButton = driver.findElement(searchButtonLocator);
		searchButton.click();

		//Click on first item
		WebElement selectItem = driver.findElement(selectItemLocator);
		selectItem.click();

		//Click on first item
		WebElement addToCart = driver.findElement(selectAddtoCartLocator);
		addToCart.click();

		//Click on first item
		WebElement selectNoCoverage = driver.findElement(selectNoCoverageLocator);
		selectNoCoverage.click();

		//Click on first item
		WebElement selectProceedToCheckOut = driver.findElement(selectProceedToCheckOutLocator);
		selectProceedToCheckOut.click();

		//Type UserName
		WebElement userNameField = driver.findElement(typeUserNameLocator);
		userNameField.sendKeys(userName);

		//Type UserPassword
		WebElement userPasswordField = driver.findElement(typeUserPasswordLocator);
		userPasswordField.sendKeys(userPassword);

		//Click on sign in
		WebElement clickSignIn = driver.findElement(selectSignInLocator);
		clickSignIn.click();

		//Synchronization(hard)
		Thread.sleep(1000);


		//Close the browser
		driver.quit();

	}
}
