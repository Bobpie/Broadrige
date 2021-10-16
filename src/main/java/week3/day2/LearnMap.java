package week3.day2;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class LearnMap {
public static void main(String[] args) {
	Map<Integer, String> map = new LinkedHashMap<>();
	map.put(10001, "Andrea");
	map.put(10004, "Shiva");
	map.put(10006, "Aishwariya");
	map.put(10002, "Anirudh");
	map.put(10003, "Dhanush");
	map.put(10005, "Arun Raja");
	System.out.println(map);
	
	map.put(10006, "Amala");
	System.out.println(map);
	map.get(10001);
	
	Set<Integer> keySet = map.keySet();
	for (Integer eachKey : keySet) {
		System.out.println(eachKey +"->"+ map.get(eachKey));
	}
	
	
	Set<Entry<Integer, String>> entrySet = map.entrySet();
	for (Entry<Integer, String> eachEntry : entrySet) {
		System.out.println(eachEntry.getValue());
	}
	
	boolean containsKey = map.containsKey(10001);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
