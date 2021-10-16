package week7.day1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	@BeforeMethod
	  public void beforeMethod() {
		  System.out.println("@BeforeMethod Method");
	  }

	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("@AfterMethod Method");
	  }

	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("@BeforeClass Method");
	  }

	  @AfterClass
	  public void afterClass() {
		  System.out.println("@AfterClass Method");
	  }

	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("@BeforeTest Method");
	  }

	  @AfterTest
	  public void afterTest() {
		  System.out.println("@AfterTest Method");
	  }

	  @BeforeSuite
	  public void beforeSuite() {
		  System.out.println("@BeforeSuite Method");
	  }

	  @AfterSuite
	  public void afterSuite() {
		  System.out.println("@AfterSuite Method");
	  }
}
