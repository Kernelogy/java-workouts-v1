import java.util.*;

public class Col2 {
    public static void main(String[] args) {
        String[] lst = new String[3];

        TreeSet<String> list = new TreeSet<String>();
        list.add("Grape");
        list.add("Banana");
        list.add("Apple");
        for (String fruit : list) {
            System.out.println(fruit);
        } 
        TreeSet<Integer> nList = new TreeSet<Integer>();  
        nList.add(300);
        nList.add(100);
        nList.add(200); 
        for (Integer i : nList) {
            System.out.println(i);
        }
    }
}