
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTesting {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\leovo\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   driver.get("http://demo.automationtesting.in/Alerts.html");
	   driver.manage().window().maximize();
	   WebElement btnclick = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
	   btnclick.click();
	   WebElement btnclick1 = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
	   btnclick1.click();
	   Alert al = driver.switchTo().alert();
	   al.sendKeys("indhu");
	   al.accept();
	   WebElement text = driver.findElement(By.xpath("//p[contains(text(),'Hello')]"));
	   String text1 = text.getText();
	   System.out.println(text1);
}
}