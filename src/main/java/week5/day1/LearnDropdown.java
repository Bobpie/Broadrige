package week5.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropdown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://devlabs-860f0.web.app/dropdown");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		WebElement dropDownElement = driver.findElementById("Index");
		//dropDownElement.sendKeys("Mango");
		
		// 1. Create an object for select class
		// Pass the drop down element in the constructor of the class
		
		Select dd = new Select(dropDownElement);
		
		// 2. Selecting value from the drop down using index
		// dd.selectByIndex(3);
		
		// 3. Selecting value from the drop down using text
		// dd.selectByVisibleText("Apple");
		
		// 4. Selecting value from the drop down using value
		   dd.selectByValue("3");
		
		List<WebElement> options = dd.getOptions();
		// No of options available in the drop down
		System.out.println(options.size());
		
		// Retrieve all the options from the drop down
		for (WebElement eachOption : options) {
			System.out.println(eachOption.getText());
		}
		
		
	}

}
