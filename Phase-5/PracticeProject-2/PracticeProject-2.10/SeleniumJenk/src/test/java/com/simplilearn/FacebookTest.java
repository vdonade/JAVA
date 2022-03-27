package com.simplilearn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FacebookTest {
	
	WebDriver driver;
	SoftAssert soft;
	
	@BeforeMethod
	public void beforeMethod() {
		soft = new SoftAssert();
		
	}
	
	@AfterMethod
	public void afterMethod() {
		soft = null;
	}
	
  @Test
  public void launchFB() {
		System.setProperty("webdriver.chrome.driver", "D:\\Phase-5\\Selenium\\chromedriver.exe");

		 driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	  
  }
  
  @Test(dependsOnMethods= {"launchFB"})
  public void testTile() {
	  soft.assertEquals("Facebook – log in or sign up", driver.getTitle());
	 soft.assertAll(); 
	 driver.close();
  }
}
