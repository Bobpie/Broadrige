package week7.day1;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class LearnAttributes {
	// (enabled = false) switch on/off the test case, default value: true
	// (description = "This test case login to the application and verify login successful") provides a glimpse about the test case
	// (expectedExceptions = NoSuchElementException.class)
	// (invocationCount = 10) To run same test case multiple no of times
	// (invocationCount = 5,invocationTimeOut = 5000)
	// (invocationCount = 5,threadPoolSize = 2)
	// (priority = -1)
	@Test(dependsOnMethods = "week7.day1.LearnAttributes.test3",alwaysRun = true)
	public void test0() {
		System.out.println("Test 0");
	}
	@Ignore
	@Test
	public void test2() {
		System.out.println("Test 2");
	}

	@Test
	public void test3() {
		System.out.println("Test 3");
		throw new RuntimeException();
	}

	@Test
	public void test1() {
		System.out.println("Test 1");
	}
}
