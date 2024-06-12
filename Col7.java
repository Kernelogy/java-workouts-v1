import java.util.*;
public class Col7 {
    public static void main(String[] args) {
        //Map<key,value>
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Grape");
        map.put(2, "Apple");
        map.put(3, "Orange");
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
