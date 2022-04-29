package com.locator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdactinHotelapp {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\leovo\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		
		WebElement txtusername = driver.findElement(By.id("username"));
		txtusername.sendKeys("indhu");

		WebElement txtpassword = driver.findElement(By.id("password"));
		txtpassword.sendKeys("1234");
}
}