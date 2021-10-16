package week6.day1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://devlabs-860f0.web.app/alert");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	WebElement element = driver.findElementByName("qawse");
	File snap = element.getScreenshotAs(OutputType.FILE);
	// Creating a dummy jpg file to post the image from the clipboard
	File image = new File("./snapshot/IMG002.jpg");
	// Merge the screen shot with the dummy file to make a reusable jpg image
	FileUtils.copyFile(snap, image);
	element.click();
	Alert alert = driver.switchTo().alert();
	String text = alert.getText();
	System.out.println(text);
	driver.findElementById("zxcvbnm").click();
	alert.accept();
	driver.switchTo().frame("iframeResult");
}
}
