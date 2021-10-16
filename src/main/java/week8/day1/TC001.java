package week8.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC001 extends ProjectBase{
	@BeforeTest
	public void setExcelData() {
		excelFilePath = "./testdata/TC001.xlsx";
	}
	
	@Test(dataProvider = "Excel Data Provider")
	public void runTC001(String username, String password) {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.id("user_name")).sendKeys(username);
		driver.findElement(By.id("user_password")).sendKeys(password);
		driver.findElement(By.id("sysverb_login")).click();
		driver.findElement(By.id("user_info_dropdown")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.linkText("Logout")))).click();
	}

}
