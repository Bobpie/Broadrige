package week7.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TC002_DropDown extends ProjectSpecificMethods{
	@Test
	public void runTC002(){
		driver.findElementByXPath("//span[text()='Dropdown']").click();
		WebElement dropDownElement = driver.findElementById("Index");
		Select dd = new Select(dropDownElement);
		dd.selectByValue("3");
	}
}
