package week5.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnAUI1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://jqueryui.com/draggable/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.switchTo().frame(0);
	
	WebElement elementTobeDragged = driver.findElementById("draggable");
	int x = elementTobeDragged.getLocation().getX();
	int y = elementTobeDragged.getLocation().getY();
	
	//1. Create an object for Actions class
	Actions builder = new Actions(driver);
	
	//2. Using actions class object, we need to perform the aui
	builder.dragAndDropBy(elementTobeDragged, x+200, y+300).perform();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
