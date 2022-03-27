package com.simplilearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AmazonSearchTest {

  @Test
  public void mainTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Phase-5\\Selenium\\chromedriver.exe");

	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.amazon.in/");
		
	    WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
	    search.sendKeys("maggie");
	    
	    WebElement button= driver.findElement(By.id("nav-iss-attach"));
		button.submit();
  }
}
