package com.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstaGram {

public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\leovo\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.instagram.com/accounts/login/?hl=en");

WebElement txtusername = driver.findElement(By.name("username"));
txtusername.sendKeys("indhu");

WebElement txtpassword = driver.findElement(By.name("password"));
txtpassword.sendKeys("1234");
}
}
