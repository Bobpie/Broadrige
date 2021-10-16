package week8.day1;

import org.testng.annotations.Test;

public class LearnGroups {
@Test(groups = {"Smoke","Reg"})
public void test1() {
	System.out.println("Test 1");
}
@Test(groups = {"Reg"})
public void test2() {
	System.out.println("Test 2");
}
@Test(groups = {"Sanity"})
public void test3() {
	System.out.println("Test 3");
}
}
