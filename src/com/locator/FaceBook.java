package com.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {

	public static void main(String[] args) {
   System.setProperty("webdriver.chrome.driver", "C:\\Users\\leovo\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement txtUserName = driver.findElement(By.id("email"));
	 txtUserName.sendKeys("jack7@gmail.com");
	 
	WebElement txtPassword = driver.findElement(By.id("pass"));
	txtPassword.sendKeys("12345");
	
	
	
	
	
	
	}


}
