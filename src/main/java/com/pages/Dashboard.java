package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Dashboard {

	private WebDriver driver;

	// Below code are by using pageobject module without page factory

	@FindBy(id = "add-to-cart-sauce-labs-backpack")
	WebElement product1;

	@FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
	WebElement product2;

	@FindBy(xpath = "//span[@class='shopping_cart_badge']")
	WebElement carticon;

	// Constructor of page class

	public Dashboard(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Page actions

	public void Selectproduct1() {
		product1.click();
	}

	public void Selectproduct2() {
		product2.click();
	}

	public void addtocart() {
		carticon.click();

	}

//	//Locators
//		private By product1= By.id("add-to-cart-sauce-labs-backpack");
//		private By product2 = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
//		private By carticon = By.xpath("//span[@class='shopping_cart_badge']");
//		
//		
//		//Constructor of page class
//		
//		public Dashboard(WebDriver driver) {
//			this.driver=driver;
//		}
//		
//		//Page actions
//		
//		public void Selectproduct1() {
//			driver.findElement(product1).click();
//		}
//
//		public void Selectproduct2() {
//			driver.findElement(product2).click();
//		}
//			
//		public void addtocart() {
//			driver.findElement(carticon).click();
//			
//		}

}
