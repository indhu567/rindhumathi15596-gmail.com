import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Guru99 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\leovo\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		WebElement bank = driver.findElement(By.xpath("//li[@id='credit2']"));
		WebElement account = driver.findElement(By.xpath("//ol[@id='bank']"));
		Actions actions = new Actions(driver);
		actions.dragAndDrop(bank, account).perform();
		
		WebElement rate = driver.findElement(By.xpath("//li[@id='fourth'][1]"));
		WebElement amount = driver.findElement(By.xpath("//ol[@id='amt7']"));
		Actions actions1 = new Actions(driver);
		actions1.dragAndDrop(rate,amount).perform();
		
		WebElement  sales= driver.findElement(By.xpath("//li[@id='credit1']"));
		WebElement account1 = driver.findElement(By.xpath("//ol[@id='loan']"));
		Actions actions2 = new Actions(driver);
		actions2.dragAndDrop(sales,account1).perform();
		
		WebElement rate1  = driver.findElement(By.xpath("//li[@id='fourth'][1]"));
		WebElement amount2 = driver.findElement(By.xpath("//ol[@id='amt8']"));
		Actions actions3 = new Actions(driver);
		actions3.dragAndDrop(rate1,amount2).perform();
		

		
		
		
		
	}

}
