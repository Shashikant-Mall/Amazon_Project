package com.PageObject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
	private WebDriver driver;
	
	public HomePage(WebDriver d) {
		driver=d;
		
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@id='nav-logo-sprites']")
	WebElement logo;
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement searchBox;
	
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	WebElement searchBtn;
	

	public boolean isLogoDisplayed() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    return wait.until(ExpectedConditions.visibilityOf(logo)).isDisplayed();
	    
	}
	public void searchProduct(String productName) {
		searchBox.clear();
		searchBox.sendKeys(productName);
		searchBtn.click();
	}
	
	
}
