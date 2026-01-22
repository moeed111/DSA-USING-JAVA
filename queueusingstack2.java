import java.util.*;
//push 0(1) & pop 0(n)
public class queueusingstack2 {
    static class Queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty(){
            return s1.isEmpty();
        }

        //add
        public static void add(int data){
           
            s1.push(data);
           
            
        }

        //remove 
        public static void remove(){
            if(isEmpty()){
                System.out.println("Queue Empty");
                
            }
            while(!s1.isEmpty()){
                s2.push(s1.pop());
                //System.out.println(s2.pop());

            }
            while(!s2.isEmpty()){
                //s2.push(s1.pop());
                System.out.println(s2.pop());

            }
        }

        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue Empty");
                return -1;
            }
            return s1.peek();
        }

    }
    public static void main(String args[]){
        Queue q = new Queue();
        q.add(1); 
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            //System.out.println(q.peek());
            q.remove();
        }
    }
}
