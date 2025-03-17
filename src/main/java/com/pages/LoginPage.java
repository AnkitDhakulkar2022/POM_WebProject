package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	private WebDriver driver;

	// Below code are by using pageobject module with using page factory

	// Locators

	@FindBy(id = "user-name")
	WebElement emailid;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(id = "login-button")
	WebElement loginButton;

	// Constructor of page class
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Page actions

	public void enterUserName(String Username) {
		emailid.sendKeys(Username);
	}

	public void password(String Password) {
		password.sendKeys(Password);
	}

	public void LoginButton() {
		loginButton.click();
	}

//Below code are by using pageobject module without page factory

//	//Locators
//	private By emailid= By.id("user-name");
//	private By password = By.id("password");
//	private By loginButton = By.id("login-button");
//	
//	//Constructor of page class
//	
//	public LoginPage(WebDriver driver) {
//		this.driver=driver;
//	}
//	
//	//Page actions
//	
//	public void enterUserName(String Username) {
//		driver.findElement(emailid).sendKeys(Username);
//	}
//
//	public void password(String Password) {
//		driver.findElement(password).sendKeys(Password);
//	}
//		
//	public void LoginButton() {
//		driver.findElement(loginButton).click();
//		
//	}
}
