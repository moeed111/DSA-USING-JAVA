import java.util.*;
import java.util.LinkedList;
public class deque {
    public static void main(String args[]){
        Deque<Integer> dq = new LinkedList<>();
        dq.addFirst(1);
        dq.addFirst(2);
        dq.addLast(3);
        dq.addLast(4);
        System.out.println(dq);
        // dq.removeFirst();
        // dq.removeLast();
        System.out.println("first el = "+dq.getFirst());
        System.out.println("lst el ="+ dq.getLast());


    }
}
