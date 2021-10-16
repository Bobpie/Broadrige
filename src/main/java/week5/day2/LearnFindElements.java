package week5.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFindElements {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.findElementById("twotabsearchtextbox").sendKeys("Iphone", Keys.ENTER);
	
	// find the multiple elements on a single locator
		/*
		 * WebElement mobileElement = driver.
		 * findElementByXPath("//span[@class='a-size-medium a-color-base a-text-normal']"
		 * ); System.out.println(mobileElement.getText());
		 */
	
	List<WebElement> listofElements = driver.findElementsByXPath("//span[@class='a-size-medium a-color-base a-text-normal']");
	for (WebElement eachWebelement : listofElements) {
		System.out.println(eachWebelement.getText());
	}











}
}
