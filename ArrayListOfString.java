package task7;

import java.util.ArrayList;
import java.util.List;

public class ArrayListOfString {

	public static void main(String[] args) {
		List<String> list = new ArrayList();
		
		list.add("Apple");
		list.add("Orange");
		list.add("Grape");
		list.add("Banana");
		
		System.out.println(list.toString());
		list.removeAll(list);
		System.out.println(list.toString());
		

	}

}

