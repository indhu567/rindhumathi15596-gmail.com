package com.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class DemoAutomation {

public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\leovo\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://demo.automationtesting.in/Register.html");

WebElement txtfirstname = driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]"));
txtfirstname.sendKeys("indhu");
WebElement txtlastname = driver.findElement(By.xpath("//input[@placeholder=\"LastName\"]"));
txtlastname.sendKeys("mathi");
WebElement txtaddress = driver.findElement(By.xpath("//input[@textarea[@rows\"3\"]"));
txtaddress.sendKeys("karaikudi");
WebElement txtemail = driver.findElement(By.xpath("//input[@ng-model=\"EmailAdress\"]"));
txtemail.sendKeys("indhu73@gmail.com");
WebElement txtphone = driver.findElement(By.xpath("//input[@ng-model=\"Phone\"]"));
txtphone.sendKeys("3246577681");
WebElement txtgender = driver.findElement(By.xpath("//input[@value=\"FeMale\"]"));
txtgender.click();
WebElement txtcricket = driver.findElement(By.xpath("//input[@value=\"Cricket\"]"));
txtcricket.click();
WebElement txtmovies = driver.findElement(By.xpath("//input[@value=\"Movies\"]"));
txtmovies.click();
WebElement txthockey = driver.findElement(By.xpath("//input[@value=\"Hockey\"]"));
txthockey.click();
WebElement txtlaunguage = driver.findElement(By.xpath("//input[@id=\"msdd\"]"));
txtlaunguage.sendKeys("3246577681");
WebElement txtpassword = driver.findElement(By.xpath("//input[@ng-model=\"Password\"]"));
txtpassword.sendKeys("3246577681");



}
}