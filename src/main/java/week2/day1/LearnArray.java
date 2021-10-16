package week2.day1;

import java.util.Arrays;

public class LearnArray {
public static void main(String[] args) {
/*		  |0|1|
	0|Rishab|EMP001|
	1|Chakravarthy|EMP002|
	2|Anjali|EMP003|
	3|Lavanya|EMP004|
	4|Subbu|EMP005| */
	
	String[][] data = {{"Rishab","Emp001"},
					   {"Chakravarthy","EMP002"},
					   {"Anjali","EMP003"},
					   {"Lavanya","EMP004"},
					   {"Subbu","EMP005"}};
	// Iteration of tables -> rows
	for (int i = 0; i < data.length; i++) {
		//Iteration of rows -> individual data
		for (int j = 0; j < data[i].length; j++) {
			System.out.print(data[i][j]+" ");
		}
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
//	String[] names = {"Rishab","Chakravarthy","Anjali","Lavanya","Subbu"};   
//	int size = names.length;
//	//System.out.println(size);
//	
//	//System.out.println(names[10]);
//	
//	
//	
//	for(int i = size-1; i >= 0; i--) {
//	System.out.println(names[i]);
//	}
//	System.out.println("==========================");
//	Arrays.sort(names);
//	// foreach loop
//	for(String eachName:names) {
//		System.out.println(eachName);
//	}
//	
	
	
	
	
	
	
	
	
}
}
