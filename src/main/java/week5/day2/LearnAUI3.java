package week5.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnAUI3 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://jqueryui.com/selectable/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.switchTo().frame(0);
	
	WebElement item1 = driver.findElementByXPath("//li[text()='Item 1']");
	WebElement item2 = driver.findElementByXPath("//li[text()='Item 2']");
	WebElement item3 = driver.findElementByXPath("//li[text()='Item 3']");
	WebElement item4 = driver.findElementByXPath("//li[text()='Item 4']");
	
	Actions builder = new Actions(driver);
	builder
	.keyDown(Keys.CONTROL)
	.click(item1)
	.click(item2)
	.click(item3)
	.click(item4)
	.keyUp(Keys.CONTROL)
	.perform();
	
	builder.
	
	
	
	
	
	
	
	
	
	
	
}
}
