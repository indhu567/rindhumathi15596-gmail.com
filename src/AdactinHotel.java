import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdactinHotel {
public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\leovo\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
   WebDriver driver = new ChromeDriver();
   driver.get("https://adactinhotelapp.com/");
 
   driver.manage().window().maximize();
   Robot robot = new Robot();
   //TAB
   robot.keyPress(KeyEvent.VK_TAB);
   robot.keyRelease(KeyEvent.VK_TAB);
   robot.keyPress(KeyEvent.VK_TAB);
   robot.keyRelease(KeyEvent.VK_TAB);
   robot.keyPress(KeyEvent.VK_TAB);
   robot.keyRelease(KeyEvent.VK_TAB);
   //in
   robot.keyPress(KeyEvent.VK_I);
   robot.keyRelease((KeyEvent.VK_I));
   robot.keyPress(KeyEvent.VK_N);
   robot.keyRelease((KeyEvent.VK_N));
   
   //TAB
   robot.keyPress(KeyEvent.VK_TAB);
   robot.keyRelease(KeyEvent.VK_TAB);
   //12
   robot.keyPress(KeyEvent.VK_1);
   robot.keyRelease((KeyEvent.VK_1));
   robot.keyPress(KeyEvent.VK_2);
   robot.keyRelease((KeyEvent.VK_2));
   //TAB
   robot.keyPress(KeyEvent.VK_TAB);
   robot.keyRelease(KeyEvent.VK_TAB);
   robot.keyPress(KeyEvent.VK_TAB);
   robot.keyRelease(KeyEvent.VK_TAB);
   
   //enter
   robot.keyPress(KeyEvent.VK_ENTER);
   robot.keyRelease(KeyEvent.VK_ENTER);
   
   
   
   
   

   
   
}
}
