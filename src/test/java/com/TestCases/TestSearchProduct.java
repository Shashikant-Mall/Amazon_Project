package com.TestCases;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import com.Base.BaseTest;
import com.PageObject.HomePage;

public class TestSearchProduct extends BaseTest {
	
  @Test
  public void searchProduct() {
	  
	  HomePage hp = new HomePage(driver);
	  
	  hp.searchProduct("iPhone 16");	  
	  
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	  wait.until(ExpectedConditions.titleContains("iPhone"));
	  
	  String pageTitle = driver.getTitle();
	  
	  Assert.assertTrue(pageTitle.contains("iPhone"));
	  System.out.println("Test passed");
  }
  
}
