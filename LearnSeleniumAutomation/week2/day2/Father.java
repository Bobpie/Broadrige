package week2.day2;

public class Father extends Grandfather {
public static String value = "$33330002";
public void audiCar() {
	// this = new Father();
	this.anscestoralHouse();
	super.anscestoralHouse();
}

@Override
public void anscestoralHouse() {
	System.out.println("New mordern house");
}
}
