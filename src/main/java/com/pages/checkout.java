package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class checkout {

	private WebDriver driver;

//Below code are by using pageobject module with page factory

	@FindBy(id = "checkout")
	WebElement checkoutButton;

	@FindBy(id = "first-name")
	WebElement firstName;

	@FindBy(id = "last-name")
	WebElement lastName;

	@FindBy(id = "postal-code")
	WebElement zipcode;

	@FindBy(id = "continue")
	WebElement continueButton;

	@FindBy(id = "finish")
	WebElement finishButton;

	// Constructor of page class

	public checkout(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Page actions

	public void ckickcheckoutButton() {
		checkoutButton.click();
	}

	public void enterfirstName(String Firstname) {
		firstName.sendKeys(Firstname);
	}

	public void enterlastName(String LastName) {
		lastName.sendKeys(LastName);

	}

	public void enterzipcode(String ZipCode) {
		zipcode.sendKeys(ZipCode);

	}

	public void clickcontinueButton() {
		continueButton.click();
	}

	public void clickfinishButton() {
		finishButton.click();

	}

	// Below code are by using pageobject module without page factory

	// Locators

//	private By checkoutButton= By.id("checkout");
//	private By firstName = By.id("first-name");
//	private By lastName = By.id("last-name");
//	private By zipcode= By.id("postal-code");
//	private By continueButton= By.id("continue");
//	private By finishButton= By.id("finish");
//	
//	
//	//Constructor of page class
//	
//	public checkout(WebDriver driver) {
//		this.driver=driver;
//	}
//	
//	//Page actions
//	
//	public void ckickcheckoutButton() {
//		driver.findElement(checkoutButton).click();
//	}
//
//	public void enterfirstName(String Firstname) {
//		driver.findElement(firstName).sendKeys(Firstname);
//	}
//		
//	public void enterlastName(String LastName) {
//		driver.findElement(lastName).sendKeys(LastName);
//		
//	}
//
//	public void enterzipcode(String ZipCode) {
//		driver.findElement(zipcode).sendKeys(ZipCode);
//		
//	}
//	public void clickcontinueButton() {
//		driver.findElement(continueButton).click();
//	}
//		
//	public void clickfinishButton() {
//		driver.findElement(finishButton).click();
//		
//	}

}
