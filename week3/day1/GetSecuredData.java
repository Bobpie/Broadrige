package week3.day1;

public class GetSecuredData {
public static void main(String[] args) {
	//System.out.println(SecuredClass.a);
	System.out.println(SecuredClass.getter());
	SecuredClass.setter(7);
	System.out.println(SecuredClass.getter());
}
}
