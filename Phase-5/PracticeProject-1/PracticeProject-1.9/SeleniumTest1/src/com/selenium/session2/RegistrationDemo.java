package com.selenium.session2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class RegistrationDemo {
	public static void main(String[] args) {
		// set the driver property
		System.setProperty("webdriver.chrome.driver", "D:\\Phase-5\\Selenium\\chromedriver.exe");

    WebDriver driver = new ChromeDriver();
    
    driver.get("https://www.shine.com/registration/parser/");
    
    WebElement name= driver.findElement(By.cssSelector("#id_name"));
    name.sendKeys("Sonam Soni");
    
    
    WebElement email= driver.findElement(By.cssSelector("#id_email"));
    name.sendKeys("Sonam@gmail.com");
    
    WebElement phone= driver.findElement(By.cssSelector("#id_cell_phone"));
    name.sendKeys("");
    
    
    WebElement pass= driver.findElement(By.cssSelector("#id_password"));
    name.sendKeys("");
    
    
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
