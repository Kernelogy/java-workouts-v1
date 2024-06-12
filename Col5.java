import java.util.*;


public class Col5 {
    public static void main(String[] args) {
        //Natural Ordering/Sorting
        Queue<String> queue = new PriorityQueue<String>();
        queue.add("Mukil");        
        queue.add("Anbu");
        queue.add("Manu");
        System.out.println(queue);
        String data = queue.poll(); //returns the first item and
                                    //removes from the list
        System.out.println(queue);
        data = queue.peek();//returns the next data for polling
        System.out.println(data);
        System.out.println(queue);

    }
}
/*
 First In First Out
 Last In Last Out
 */
