package week2.day2;

public class LearnExceptionhandling {
public static void main(String[] args)  {
	try {
	System.out.println(1/0);
		// throw new RuntimeException();
	}
	catch (ArithmeticException e) {
		System.err.println("The division of number with zero has occured. Please change the numbers");
		e.printStackTrace();
		
	}
	catch(Exception e) {
		System.err.println("Something went wrong");
	}
	finally {
		System.out.println("Execution Ended");
	}
System.out.println("Execution Continues");
	
	
	System.out.println("To be continued");
}
}
