package week2.day1;

public class LearnObjects {
	public LearnObjects(){
		System.out.println("Hey User! Welcome to the class!");
	}
public String name = "Rishab";
public void printName(String name) {
	System.out.println("My name is "+name);
}
public static void main(String[] args) {
	LearnObjects object = new LearnObjects();
	System.out.println(object);
}
}
