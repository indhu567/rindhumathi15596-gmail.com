import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mobile {
	
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\leovo\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.t-mobile.com/?src=spr&rdpage/");
	driver.manage().window().maximize();

    WebElement btnclose = driver.findElement(By.xpath("//button[@class=\"tntOverlayCloseBtn\"]"));
    btnclose.click();

    //Thread.sleep(1000);
	//WebElement btnclose1 = driver.findElement(By.xpath(""));
    //btnclose1.click();
	
    

	  

}
}


//WebElement btnclick = driver.findElement(By.xpath("//body[@class=\"page basicpage\"]"));
//Actions actions = new Actions(driver);
//actions.moveToElement(btnclick).build().perform();