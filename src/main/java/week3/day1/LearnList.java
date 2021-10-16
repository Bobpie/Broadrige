package week3.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {
public static void main(String[] args) {
//	String[] names = new String[10];
	List<String> list = new ArrayList<>();
	// Create/add value to the list
	list.add("Chakra");
	list.add("Rishab");
	list.add("Chandra");
	list.add("Deepika");
	list.add("Anjali");
	list.add("Chakra");
	list.add(0, "Vinay");
	// Update value to the list
	list.set(4, "Aditi");
	// Read value from the list
	System.out.println(list.get(4));
	// Delete value from the list
	list.remove(1);
	
	if(list.contains("Aditi")) {
		System.out.println("True");
	}
	else {
		System.out.println("False");
	}
	
	//Collections.sort(list);
	Collections.reverse(list);
	
	
	
	
	for (int i = 0; i < list.size(); i++) {
		System.out.println(list.get(i));
	}
	list.clear();
	list.isEmpty();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
