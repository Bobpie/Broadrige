package week7.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC001_AlertHandle extends ProjectSpecificMethods{

	@Test public void runTC001() {
		driver.findElementByXPath("//span[text()='Alert']").click();
		WebElement element = driver.findElementByName("qawse");
		element.click();
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		alert.accept();
		throw new RuntimeException();

	}

}
