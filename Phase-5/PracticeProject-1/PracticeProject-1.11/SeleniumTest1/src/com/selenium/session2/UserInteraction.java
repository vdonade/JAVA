package com.selenium.session2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class UserInteraction {

	public static void main(String[] args) {
		//set the driver property
				System.setProperty("webdriver.chrome.driver", "D:\\Phase-5\\Selenium\\chromedriver.exe");
				
				WebDriver driver= new ChromeDriver();
				//for firefox users
				//WebDriver driver=new FirefoxDriver();
				driver.get("https://www.google.co.in/");
				
				 WebElement query= driver.findElement(By.name("q"));
			        
			        Actions builder= new Actions(driver);
			        
			        Action myAction= builder.moveToElement(query)
			                .click()
			                .keyDown(query,Keys.SHIFT)
			                .sendKeys(query,"sonam")
			                .keyUp(query,Keys.SHIFT)
			                .doubleClick()
			                .contextClick()
			                .build();
			        myAction.perform();
			        
			        driver.close();

	}

}
