package week4.day1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
public static void main(String[] args) throws InterruptedException {
	// Set up a path to the driver
	System.setProperty("webdriver.chrome.driver", "/Users/umesh-zt395/eclipse-workspace/LearnSeleniumAutomation/drivers/chromedriver");
	// Open a chrome browser
	ChromeDriver driver = new ChromeDriver();
	// To Load an URL into the automated browser window
	driver.get("https://www.amazon.in/");
	// To Maximize the window view
	driver.manage().window().maximize();
	
	// To find an element from the webpage
	WebElement elementSearchBox = driver.findElementById("twotabsearchtextbox");
	
	elementSearchBox.sendKeys("Iphone 12",Keys.ENTER);
	
	
	Thread.sleep(3000);
	WebElement firstMobile = driver.findElementByTagName("h2");
	
	firstMobile.click();
	
	
	
	
	
	
	
   
	//<span id="logo-ext" class="nav-sprite nav-logo-ext nav-progressive-content"></span>
    
	
	//<span class="nav-logo-locale">  .in  </span>
	
	
	
	
	
	/*
	 * Attribute locators
	1. ID   2. Class    3. Name
	 * Link Based locators
	4. LinkText     5. Partial Linktext
	 * Tag Based Locators
	6. TagName
	 * Custom Locators
	7. Xpath   8. CSS
	*/
	
	
	
	
	
	
	
	
	
	
}
}
