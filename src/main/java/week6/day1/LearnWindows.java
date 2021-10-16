package week6.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnWindows {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(ops);

		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByXPath("//button[text()='OK']").click();
		driver.findElementByXPath("//a[text()=' FLIGHTS ']").click();

		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		Set<String> setReference = driver.getWindowHandles();
		List<String> listReference = new ArrayList<>(setReference);
		String secondWindowReference = listReference.get(1);
		driver.switchTo().window(secondWindowReference);
		driver.findElementById("stationFrom").sendKeys("TRZ");
		Thread.sleep(2000);
		driver.findElementById("stationFrom").sendKeys(Keys.TAB);

	}
}
