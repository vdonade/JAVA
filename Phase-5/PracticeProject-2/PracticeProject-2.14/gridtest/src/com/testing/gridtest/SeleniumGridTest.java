package com.testing.gridtest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGridTest {

	public static void main(String[] args) {
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		
		try {
			//hub url to send request to hub for script execution
			URL url= new URL("http://192.168.43.116:4444/wd/hub");
			WebDriver driver=new RemoteWebDriver(url,cap);
			
			driver.get("https://www.google.com");
			System.out.println("Title: "+driver.getTitle());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
}