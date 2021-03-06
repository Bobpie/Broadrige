package week8.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC002 extends ProjectBase {
	@BeforeTest
	public void setExcelData() {
		excelFilePath = "./testdata/TC002.xlsx";
	}
	
	@Test(dataProvider = "Excel Data Provider")
	public void runTC002(String username, String password, String caller, String description) {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.id("user_name")).sendKeys(username);
		driver.findElement(By.id("user_password")).sendKeys(password);
		driver.findElement(By.id("sysverb_login")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("filter")))).sendKeys("Incident");
		driver.findElement(By.xpath("(//span[text()='Incident']/following::div[text()='Create New'])[1]")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.id("sys_display.incident.caller_id")).sendKeys(caller, Keys.TAB);
		driver.findElement(By.id("incident.short_description")).sendKeys(description);
		driver.findElement(By.xpath("(//button[text()='Submit'])[1]")).click();
	}
}
