package week1.day2;

public class PractiseIf_2 {
public static void main(String[] args) {
	int a = 12, b = 34, c = 9;
	if(a > b) {
		if(a > c) {
			System.out.println("A is greater");
		}
	}
	else if(b > a) {
		if(b > c) {
			System.out.println("B is greater");
		}
	}
	else {
		System.out.println("C is greater");
	}
}
}
