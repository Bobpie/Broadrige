package week2.day2;

public class Family {
public static void main(String[] args) {
	Grandfather gf = new Grandfather();
	int a = gf.a;
	//gf.anscestoralHouse();
	
	Father fa = new Father();
	String value1 = fa.value;
	fa.audiCar();
	int a2 = fa.a;
	//fa.anscestoralHouse();
	
	ChildClass cc = new ChildClass();
	cc.bicycle();
	boolean working = cc.working;
	String value2 = cc.value; // From father
	//cc.audiCar(); // From Father
	//cc.anscestoralHouse(); // From grandfather
	int a3 = cc.a; // From grandfather
	
	
	
	
	
	
	
	
	
	
}
}
