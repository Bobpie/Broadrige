package week1.day2;

public class LearnSwitch {
public static void main(String[] args) {
	String requirement = "Third Class";
	switch (requirement) {
	
	case "Balcony":
		System.out.println("Purchase Balcony Ticket for Rs. 250");
		break;
	
	case "First Class":
		System.out.println("Purchase First Class Ticket for Rs. 200");
		break;
	
	case "Second Class":
		System.out.println("Purchase Second Class Ticket for Rs. 150");
		break;

	default:
		System.out.println("This option is not available");
		break;
	}
}
}
