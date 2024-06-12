import java.util.*;

public class Col6 {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<String>();
        deque.push("Mukil");
        deque.push("Manu");
        deque.push("Anbu");
        System.out.println(deque);
        deque.poll();
        System.out.println(deque);

    }
}
/*
Deque = > Stack
 Last in First Out
 First in Last Out
 */
