import java.util.*;
import java.util.LinkedList;
public class queueJCF {
    
    public static void main(String args[]){
        
        //Queue<Integer> q = new LinkedList<>(); // with LL
        Queue<Character> q = new ArrayDeque<>(); // with ArrayDeque

        q.add('a');
        q.add('a');
        q.add('b');
        q.add('c');
        q.add('c');
        q.add('x');
        q.add('b');

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
