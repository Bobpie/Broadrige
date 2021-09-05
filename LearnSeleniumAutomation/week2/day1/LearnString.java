package week2.day1;

public class LearnString {
public static void main(String[] args) {
	// String literal declation
	String name1 = "      Rishab Pant     ";
	// String Object declaration
	String name2 = new String("Rishab");
	
	System.out.println("Before Trim: "+name1);
	String trim = name1.trim();
	System.out.println("After Trim: "+trim);
	
	
	String lowerCase = name1.toLowerCase();
	System.out.println(lowerCase);
	
	String upperCase = name1.toUpperCase();
	System.out.println(upperCase);
	
	String text1 = "Rishab";
	String text2 = "Pant";
	// Exact comparison
	boolean equals = text1.equals(text2);
	System.out.println(equals);
	//Exact comparison, without case sensetive
	boolean equalsIgnoreCase = text1.equalsIgnoreCase(text2);
	System.out.println(equalsIgnoreCase);
	// Partial Comparison
	boolean contains = text1.contains(text2);
	System.out.println(contains);
	
	int length = text1.length();
	System.out.println(length);
	
	/*
	 * for (int i = 0; i < length; i++) { char charAt = text1.charAt(i);
	 * System.out.println(charAt); }
	 */
	
	/*
	 * char[] array = text1.toCharArray(); for (int i = 0; i < array.length; i++) {
	 * System.out.println(array[i]); }
	 */
	
	/*
	 * String[] split = text1.split(" "); for (int i = 0; i < split.length; i++) {
	 * System.out.println(split[i]); }
	 */
	
	String text = "Tea Break";
	String substring1 = text.substring(4);
	System.out.println(substring1);
	String substring = text.substring(0, 3);
	System.out.println(substring);
	
	// Concatination of string
	String concat = text1.concat(text2);
	System.out.println(concat);
	
	boolean startsWith = text.startsWith("t");
	System.out.println(startsWith);
	boolean endsWith = text.endsWith("eak");
	System.out.println(endsWith);
	
	String replace = text.replace('a', '@');
	System.out.println(replace);
	
	String brand = "Since 2010 in the industry and served more than 200000 customers";
	String replaceAll = brand.replaceAll("[^0-9]", "");
	System.out.println(replaceAll);
	
	String replace2 = brand.replaceAll("\\d", "");
	System.out.println(replace2);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
