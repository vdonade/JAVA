package com.automateoracle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Phase-5\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		 
		driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
		
		
		WebElement email=driver.findElement(By.id("sView1:r1:0:email::content"));
		email.sendKeys("vaishnavidonade73@gmail.com");
		

		WebElement Password =driver.findElement(By.id("sView1:r1:0:password::content"));
		Password.sendKeys("Thankyou@1");
		
		WebElement Retypepassword=driver.findElement(By.id("sView1:r1:0:retypePassword::content"));
		Retypepassword.sendKeys("Thankyou@1");
		
		WebElement fName=driver.findElement(By.id("sView1:r1:0:firstName::content"));
		fName.sendKeys("Vaishnavi");
		
		WebElement lName=driver.findElement(By.id("sView1:r1:0:lastName::content"));
		lName.sendKeys("Donade");
	
		WebElement job = driver.findElement(By.id("sView1:r1:0:jobTitle::content"));
		job.sendKeys("engg");
		
		WebElement WorkPhone=driver.findElement(By.id("sView1:r1:0:workPhone::content"));
		WorkPhone.sendKeys("9049552899");
		
		WebElement CompanyName=driver.findElement(By.id("sView1:r1:0:companyName::content"));
		CompanyName.sendKeys("qt");
		
		WebElement Address=driver.findElement(By.id("sView1:r1:0:address1::content"));
		Address.sendKeys("Hogwarts Street");
		
		WebElement City	 =driver.findElement(By.id("sView1:r1:0:city::content"));
		City.sendKeys("Nagpur");
			
		WebElement State =driver.findElement(By.id("sView1:r1:0:state::content"));
		State.sendKeys("Maharashtra");
		
		WebElement PostalCode =driver.findElement(By.id("sView1:r1:0:postalCode::content"));
		PostalCode.sendKeys("440019");
		
		
		WebElement button= driver.findElement(By.id("sView1:r1"));
		button.submit();
	//	driver.close();
	}

}
