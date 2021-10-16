package week6.day1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSnapShots {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://devlabs-860f0.web.app/frame");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	// Taking a snap shot and saving it as file type - Pressing Print screen button
	File snap = driver.getScreenshotAs(OutputType.FILE);
	// Creating a dummy jpg file to post the image from the clipboard
	File image = new File("./snapshot/IMG001.jpg");
	// Merge the screen shot with the dummy file to make a reusable jpg image
	FileUtils.copyFile(snap, image);
	
	
	
	
}
}
