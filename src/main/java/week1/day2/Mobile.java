package week1.day2;

public class Mobile {
public int mobileNumber = 987654321;
public long imeiNumber = 11223344556677889L;
public String mobileBrand = "OnePlus 7";
public char version = 'T';
public boolean isMobileCharged = true;
public float andriodVersion = 10.102F;

public void sendSMS(String message) {
	System.out.println("Message Sending as "+message);
}

public boolean isFlashOn() {
	return false;
}

public void takePhoto() {
	System.out.println("Photo taken successfully");
}

public String getColor() {
	return "Grey";
}

public static void main(String[] args) {
	// You can access the members of a class using object
	// ClassName object = new ClassName();
	Mobile myMobile = new Mobile();
	// To access a variable in a class
	int mobileNum = myMobile.mobileNumber;
	System.out.println(mobileNum);
	String brand = myMobile.mobileBrand;
	System.out.println(brand);
	
	myMobile.sendSMS("Hello! How you are doing?");
	String color = myMobile.getColor();
	System.out.println(color);
	
}
















}
