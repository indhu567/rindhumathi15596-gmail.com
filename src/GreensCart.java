import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GreensCart {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\leovo\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   driver.get("http://greenscart.in/#/login?returnUrl=%2F");
	   driver.manage().window().maximize();
	   
	   Thread.sleep(3000);
	   WebElement textusername =driver.findElement(By.id("loginEmailId"));
	   textusername.sendKeys("rindhumathi15596@gmail.com");
	   
	   WebElement textpassword =driver.findElement(By.id("loginPassword"));
	   textpassword.sendKeys("Indhu@1696");
	   
	   Thread.sleep(5000);
	   WebElement btnlogin = driver.findElement(By.xpath("//input[@value='Login']"));
	   btnlogin.click();
	   
	   Thread.sleep(5000);
	   WebElement btnsearch =driver.findElement(By.xpath("//input[@id='typeahead-basic']"));
	   btnsearch.sendKeys("Apple iphone 12 pro max");
	   WebElement btnclick =driver.findElement(By.xpath("//button[@class='btn btn-outline-secondary']"));
	   btnclick.click();
	   WebElement btnimage =driver.findElement(By.xpath("//img[@class='card-img-top']"));
	   btnimage.click();
	   WebElement btnbuynow =driver.findElement(By.xpath("//button[@class='btn btn-warning btn-long buy buttonKart']"));
	   btnbuynow.click();
	   
	   Thread.sleep(5000);
	   Robot robot = new Robot();
	   robot.keyPress(KeyEvent.VK_DOWN);
	   robot.keyRelease(KeyEvent.VK_DOWN);
	   robot.keyPress(KeyEvent.VK_DOWN);
	   robot.keyRelease(KeyEvent.VK_DOWN);
	   robot.keyPress(KeyEvent.VK_DOWN);
	   robot.keyRelease(KeyEvent.VK_DOWN);
	   
	   Thread.sleep(4000);
	   WebElement btngift=driver.findElement(By.xpath("//button[text()='ADD GIFT CODE']"));
	   btngift.click();
	   robot.keyPress(KeyEvent.VK_DOWN);
	   robot.keyRelease(KeyEvent.VK_DOWN);
	   robot.keyPress(KeyEvent.VK_DOWN);
	   robot.keyRelease(KeyEvent.VK_DOWN);
	   
	   Actions actions = new Actions(driver);
	   WebElement btnpromo=driver.findElement(By.xpath("//span[text()='GRN10']"));
	   actions.doubleClick(btnpromo).perform();
	   robot.keyPress(KeyEvent.VK_DOWN);
	   robot.keyRelease(KeyEvent.VK_DOWN);
	   robot.keyPress(KeyEvent.VK_DOWN);
	   robot.keyRelease(KeyEvent.VK_DOWN);
	   
	   Thread.sleep(2000);
	   WebElement btnpromoremove=driver.findElement(By.xpath("//span[@class='px-1 close']"));
	   actions.contextClick(btnpromoremove).perform();
	  

	   
	  
	  
	  
	  
	  
	   
	   
	   
	 
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
}
}