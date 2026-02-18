package com.TestCases;

import org.testng.Assert;
import org.testng.annotations.*;
import com.Base.BaseTest;
import com.PageObject.HomePage;

public class TestHomePageLogo extends BaseTest {
	 	
  @Test
  public void testLogo() {
	  HomePage hp = new HomePage(driver);
	  
	 boolean status = hp.isLogoDisplayed();
	 Assert.assertTrue(status,"Amazon logo is not displayed");
	 System.out.println("Test passed");
  }
  
}
