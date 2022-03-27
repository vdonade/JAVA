package com.simplilearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AmazonLoginTest {

  @Test
  public void mainTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Phase-5\\Selenium\\chromedriver.exe");

	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.amazon.in/ap/signin?openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fref%3Dgw_sgn_ib%3F_encoding%3DUTF8%26pf_rd_p%3D4c6bba00-e278-444e-bafb-ede91078c7b2%26pd_rd_wg%3DouOTo%26pf_rd_r%3DXTWFQFFN7GEGRP2F2C5P%26pd_rd_w%3DFBGTi%26pd_rd_r%3D70f3d71e-3b5e-4065-925c-1e573cb43d16&openid.assoc_handle=inflex&openid.pape.max_auth_age=0&pf_rd_r=XTWFQFFN7GEGRP2F2C5P&pf_rd_p=4c6bba00-e278-444e-bafb-ede91078c7b2&pd_rd_r=70f3d71e-3b5e-4065-925c-1e573cb43d16&pd_rd_w=FBGTi&pd_rd_wg=ouOTo&ref_=pd_gw_unk");
		
	    WebElement email=driver.findElement(By.id("ap_email"));
	    email.sendKeys("vdonade@gmail.com");
	    
	    WebElement button= driver.findElement(By.id("continue"));
		button.submit();
		
		 WebElement password=driver.findElement(By.id("ap_password"));
		 password.sendKeys("Gargigaikwad@1");
		 
		 WebElement button1= driver.findElement(By.id("signInSubmit"));
		 button1.submit();
		 
  }
}
