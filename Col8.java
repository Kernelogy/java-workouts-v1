import java.util.*;
public class Col8 {
    public static void main(String[] args) {
        //Map<key,value>
        Map<Integer, String> map = new TreeMap<Integer, String>();
        map.put(3, "Grape");
        map.put(5, "Apple");
        map.put(1, "Orange");
        System.out.println(map);
        System.out.println(map.get(1));
        System.out.println(map.keySet());
        for (Integer key : map.keySet()) {
            System.out.println(map.get(key));
        }
        map.clear();
        System.out.println(map);
    }
}
