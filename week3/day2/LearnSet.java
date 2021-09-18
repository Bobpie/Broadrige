package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
public static void main(String[] args) {
	// Set -> Interface
	// Set do not allow duplicates
	// Set may/may not maintain the insertion order (depends on the implementation class)
	
	// Implementation Class
	// HashSet - An output based on the hashing algorithm - Random
	// TreeSet - An output which is ASCII sorted - Sorted
	// LinkedHashSet - Maintains the insertion order - Unordered output
	
	TreeSet<E>
	Set<String> set = new HashSet<>();
	set.add("Zara");
	set.add("Anu");
	set.add("Malik");
	set.add("Rajan");
	set.add("Sandra");
	set.add("Anu");
	System.out.println(set);
	
	for (String eachName : set) {
		System.out.println(eachName);
	}
	List<String> list = new ArrayList<String>(set);
	//list.addAll(set);
	
	
	
	// Tree -> [Anu, Malik, Rajan, Sandra, Zara]
	// LHS ->  [Zara, Anu, Malik, Rajan, Sandra]
	// Hash -> [Malik, Anu, Rajan, Zara, Sandra]
	
	
	
	
	
	
	
	
	
	
	
	
}
}
