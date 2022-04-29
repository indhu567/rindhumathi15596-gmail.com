package com.locator;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	public class IciciBank {
 public static void main(String[] args) {
 System.setProperty("webdriver.chrome.driver", "C:\\Users\\leovo\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
 WebDriver driver = new ChromeDriver();
 driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
 
 WebElement txtuserid = driver.findElement(By.id("AuthenticationFG.USER_PRINCIPAL"));
 txtuserid.sendKeys("Indhu mathi");
 
 WebElement txtpassword = driver.findElement(By.id("AuthenticationFG.ACCESS_CODE"));
 txtpassword.sendKeys("12345");
 }
}
