package com.bayamp.tests;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RegistrationTests {

	private String userID = "Mike1";
	private String userPassword = "password";
	private String firstName = "Mike";
	private String lastName = "Philip";
	private String email = "mikephilip@yahoo.com";
	private String country = "US";
	private String zipCode = "94010";
	private String state = "California";
	private String city = "Burlingame";
	private String address = "1000 El camino Real";
	private String phone = "4151234567";
	private String fax = "415123456";


	@Test
	public void shoppingCart() throws InterruptedException{

		WebDriver driver = new FirefoxDriver();
		driver.get("sccas001:8080/cart");

		//click on Register link
		driver.findElement(By.linkText("Register / Sign Up")).click();

		//fill in the UserID field
		WebElement userField = driver.findElement(By.name("userid"));
		userField.sendKeys(userID);

		//fill in the Password field
		WebElement passwordField = driver.findElement(By.name("password"));
		passwordField.sendKeys(userPassword);

		//fill in the First Name field
		WebElement firstNameField = driver.findElement(By.name("firstname"));
		firstNameField.sendKeys(firstName);


		//fill in the Last Name field
		WebElement lastNameField = driver.findElement(By.name("lastname"));
		lastNameField.sendKeys(lastName);

		//fill in the Email field
		WebElement emailField = driver.findElement(By.name("email"));
		emailField.sendKeys(email);

		//fill in the Country field
		WebElement countryField = driver.findElement(By.name("country"));
		countryField.sendKeys(country);


		//fill in the ZipCode field
		WebElement zipField = driver.findElement(By.name("zip"));
		zipField.sendKeys(zipCode);


		//fill in the State field
		WebElement stateField = driver.findElement(By.name("state"));
		stateField.sendKeys(state);


		//fill in the City field
		WebElement cityField = driver.findElement(By.name("city"));
		cityField.sendKeys(city);


		//fill in the Address field
		WebElement addressField = driver.findElement(By.name("address"));
		addressField.sendKeys(address);

		//fill in the Phone field
		WebElement phoneField = driver.findElement(By.name("phone"));
		phoneField.sendKeys(phone);

		//fill in the Fax field
		WebElement faxField = driver.findElement(By.name("fax"));
		faxField.sendKeys(fax);

		//Click on Save button
		WebElement saveButton = driver.findElement(By.xpath("/html/body/div/center/table/tbody/tr/td[2]/table/tbody/tr/td/form/table/tbody/tr[14]/td/input"));
		saveButton.click();
		
		TableAddRowTest.testAddedRow(userID);

		//Synchronization(hard)
		Thread.sleep(10000);


		//Close the browser
		driver.quit();

	}
}
