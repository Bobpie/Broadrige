package week3.day2;

import java.util.LinkedHashMap;
import java.util.Map;

public class PractiseProgram {
public static void main(String[] args) {
	String str = "Macbook Pro";
	Map<Character, Integer> map = new LinkedHashMap<>();
	for (int i = 0; i < str.length(); i++) {
		char eachCharacter = str.charAt(i);
		if (map.containsKey(eachCharacter)) {
			Integer value = map.get(eachCharacter);
			map.put(eachCharacter, value+1);
		} else {
			map.put(eachCharacter, 1);
		}
		
	}
	System.out.println(map);
}
}
