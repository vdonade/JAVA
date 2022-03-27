package com.simplilearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AmazonAddToCartTest {

  @Test
  public void mainTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Phase-5\\Selenium\\chromedriver.exe");

	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.amazon.in/Maggi-2-Minute-Special-Instant-Noodles/dp/B07JQNB7QG/ref=sr_1_1_sspa?crid=1XOXW7Y2JM1Q2&keywords=maggie&qid=1648389685&sprefix=maggie%2Caps%2C487&sr=8-1-spons&psc=1&spLa=ZW5jcnlwdGVkUXVhbGlmaWVyPUExQzJYODFQTE5UUFdDJmVuY3J5cHRlZElkPUEwNTM3MzkxMUVBNTNOTTQ3WlFWRyZlbmNyeXB0ZWRBZElkPUEwMDk0MzA4MzMyTFdWVVkxSFBWTSZ3aWRnZXROYW1lPXNwX2F0ZiZhY3Rpb249Y2xpY2tSZWRpcmVjdCZkb05vdExvZ0NsaWNrPXRydWU=");
	    
	    WebElement button= driver.findElement(By.id("add-to-cart-button"));
		button.submit();
  }
}
