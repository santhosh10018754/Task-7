package task7;

import java.util.Collection;
import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {
		
		TreeMap<Integer, String> treeMap = new TreeMap();
		
		treeMap.put(101, "Jai");
		treeMap.put(102, "Santhosh");
		treeMap.put(103, "Aravind");
		treeMap.put(104, "Sounder");
		
		Collection<String> emp = treeMap.values();
		emp.stream().sorted().forEach(System.out::println);
		
		
	
	
	}
}

