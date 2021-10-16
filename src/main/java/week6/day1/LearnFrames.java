package week6.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://devlabs-860f0.web.app/frame");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	//driver.switchTo().frame(0);
//	driver.switchTo().frame("loginFrame");
	WebElement frameElement = driver.findElementByName("loginFrame");
	//driver.switchTo().frame(frameElement);
	driver.switchTo().frame(0);
	driver.findElementById("username").sendKeys("Test User");
	driver.switchTo().defaultContent();
	driver.switchTo().parentFrame();
	
	
}
}
