package week8.day1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utility.ReadExcelData;

public class ProjectBase {
	public RemoteWebDriver driver;
	public String excelFilePath;
	
	@DataProvider(name = "Excel Data Provider")
	public String[][] sendTestData() throws IOException {
		String[][] data = ReadExcelData.getData(excelFilePath);
		return data;
	}
	
	@Parameters({"URL","Browser Name"})
	@BeforeMethod
	public void openBrowser(String url,String browserName) {
		if(browserName.equals("CHROME")) {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equals("EDGE")){
			System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
			driver = new EdgeDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
	
	
}
