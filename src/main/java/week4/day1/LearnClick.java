package week4.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnClick {
public static void main(String[] args) {
	// Set up a path to the driver
		System.setProperty("webdriver.chrome.driver", "/Users/umesh-zt395/eclipse-workspace/LearnSeleniumAutomation/drivers/chromedriver");
		// Open a chrome browser
		ChromeDriver driver = new ChromeDriver();
		// To Load an URL into the automated browser window
		driver.get("https://devlabs-860f0.web.app/button");
		// To Maximize the window view
		driver.manage().window().maximize();
		
		WebElement button = driver.findElementById("button1");
		button.click();
		
		
		
		
		
		
		
		
		
		
}
}
