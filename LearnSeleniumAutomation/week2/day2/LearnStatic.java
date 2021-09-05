package week2.day2;

public class LearnStatic {
	int a = 5;
	static int b = 5;
	public void nonstatic() {
		
	}
	public static void staticMethod() {
		
	}
public static void main(String[] args) {
	LearnStatic obj = new LearnStatic();
	int a2 = obj.a;
	obj.nonstatic();
	int b2 = LearnStatic.b;
	LearnStatic.staticMethod();
}
}
