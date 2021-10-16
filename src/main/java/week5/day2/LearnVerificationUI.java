package week5.day2;

import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnVerificationUI {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
String attribute = driver.findElementById("getMe").getAttribute("value");
	
	boolean enabled = driver.findElementById("noEdit").isEnabled();
	
	boolean selected = driver.findElementById("chkSelectDateOnly").isSelected();
	
	boolean displayed = driver.findElementById("chkSelectDateOnly").isDisplayed();
	
	Point location = driver.findElementById("chkSelectDateOnly").getLocation();
	
	int x = location.getX();
	int y = location.getY();
	
	Rectangle rect = driver.findElementById("chkSelectDateOnly").getRect();
	rect.getHeight();
}
}
