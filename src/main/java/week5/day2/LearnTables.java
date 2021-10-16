package week5.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnTables {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://devlabs-860f0.web.app/table");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	//1. Find the table
	WebElement elementTable = driver.findElement(By.id("table"));
	
	//2. Find the rows and its count
	List<WebElement> listofRows = elementTable.findElements(By.tagName("tr"));
	System.out.println("No. of Rows in the table: "+listofRows.size());
	
	//3. Iterate over the rows and get each row out
	for (int i = 1; i < listofRows.size(); i++) {
		WebElement eachRow = listofRows.get(i);
		
		//4. Find the data in each row
		List<WebElement> allRowData = eachRow.findElements(By.tagName("td"));
		
		//5. Iterate over the data and get it
		for (int j = 0; j < allRowData.size(); j++) {
			String data = allRowData.get(j).getText();
			System.out.println(data);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
