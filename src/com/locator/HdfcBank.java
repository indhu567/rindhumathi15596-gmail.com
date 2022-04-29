package com.locator;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	public class HdfcBank {

 public static void main(String[] args) {
 System.setProperty("webdriver.chrome.driver", "C:\\Users\\leovo\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
 WebDriver driver = new ChromeDriver();
 driver.get("https://netbanking.hdfcbank.com/netbanking/");
 
 WebElement txtcustomerid = driver.findElement(By.id("fldLoginUserId"));
 txtcustomerid.sendKeys("123456");
 }
}
