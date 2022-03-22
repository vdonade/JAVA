package com.selenium.session2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class CheckboxDemo {
	public static void main(String[] args) {
		// set the driver property
		System.setProperty("webdriver.chrome.driver", "D:\\Phase-5\\Selenium\\chromedriver.exe");

    WebDriver driver = new ChromeDriver();
    
    driver.get("https://www.shine.com/registration/parser/");
    
    WebElement check= driver.findElement(By.cssSelector("#id_privacy"));
    
    System.out.println(check.isSelected());
    
    if(check.isSelected())
    {
        check.click();
        System.out.println("Check box deselected");
    }
    System.out.println(check.isSelected());
	}

}
