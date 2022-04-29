package com.locator;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

 public class RedBus {
 public static void main(String[] args) {
 System.setProperty("webdriver.chrome.driver", "C:\\Users\\leovo\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
 WebDriver driver = new ChromeDriver();
 driver.get("https://www.redbus.com/");
 WebElement txtFrom = driver.findElement(By.id("src"));
 txtFrom .sendKeys("Chenai");
 WebElement txtTo = driver.findElement(By.id("dest"));
 txtTo.sendKeys("Karaikudi");
}
 }
