import java.util.*;

public class Col1 {
    public static void main(String[] args) {
        String[] lst = new String[3];

        List<String> list = new ArrayList<String>();
        list.add("Apple");
        list.add("Grapes");
        list.add("Mongo");
        for (String fruit : list) {
            System.out.println(fruit);
        } 
        List<Integer> nList = new ArrayList<Integer>();  
        nList.add(100);
        nList.add(200);
        nList.add(300); 
        for (Integer i : nList) {
            System.out.println(i);
        }
    }
}
/*
 <> => Diamond Operator for handling generic
 All the clases in the java collection are generic classes
 Primitive Types are not supported with Collections
 Insted wrapper classes can be used
 */
