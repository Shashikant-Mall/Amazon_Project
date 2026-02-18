package com.TestCases;

import org.testng.Assert;
import org.testng.annotations.*;
import com.Base.BaseTest;
import com.PageObject.HomePage;

public class TestSearchProduct extends BaseTest {
	
  @Test
  public void searchProduct() {
	  
	  HomePage hp = new HomePage(driver);
	  
	  hp.searchProduct("iPhone 16");
	  String pageTitle = driver.getTitle();
	  
	  Assert.assertTrue(pageTitle.contains("iPhone"));
	  System.out.println("Test passed");
  }
  
}
