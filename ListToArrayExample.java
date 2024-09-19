package task7;

import java.util.ArrayList;
import java.util.List;


public class ListToArrayExample {
    public static void main(String[] args) {
  
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        String[] array = list.toArray(new String[0]);
        

        for (String s : array) {
            System.out.println(s);
        }
    }
}
