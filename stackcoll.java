import java.util.*;
public class stackcoll {
    //ques 1
    public static void pushAtBottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    //ques 2
    public static void PrintReverse(String str){
        Stack<Character> s = new Stack<>();
        int idx=0;
        while(idx<str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result = new StringBuilder("");
        while(!s.isEmpty()){
            result.append(s.pop());

        }
        System.out.print(result.toString());
    }

    //ques 3

     public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top= s.pop();
        reverseStack(s);
        pushAtBottom(s, top);

    }
    public static void printStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }

    //que 4
    public static void stockSpan(int stocks[],int span[]){
        Stack<Integer> s = new Stack<>();
        span[0]=1;
        s.push(0);
        for(int i=1;i<stocks.length;i++){
            int currPrice = stocks[i];
            while(!s.isEmpty()&& currPrice>stocks[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                span[i]=i+1;

            }else{
                int prevHigh = s.peek();
                span[i]=i-prevHigh;
            }
            s.push(i);
        }
    }

    //valid paranthesis

    public static boolean validParanthesis(String s){
        Stack<Character> s1 = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='('||ch=='{'|| ch=='['){
                s1.push(ch);  
            }else{
                if(s1.isEmpty()){
                    return false;
                }
                if((s1.peek()=='(' && ch ==')')|| (s1.peek()=='{' && ch =='}')||(s1.peek()=='[' && ch ==']')){
                    s1.pop();
                }else{
                    return false;
                }
            }
        }
        if(s1.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String args[]){
        // Stack<Integer> s = new Stack<>();
        // s.push(1);
        // s.push(2);
        // s.push(3);

        // while(!s.isEmpty()){
        //     System.out.println(s.peek());
        //     s.pop();
        // }

        //ques 1 . Push at the bottom
        // pushAtBottom(s,4);
        // while(!s.isEmpty()){
        //     System.out.println(s.pop());
        // }

       //ques2. Reverse a string 
    //    String str = "abc";
    //    PrintReverse(str);

    //ques 3 . Reverse a stack

   
    // Stack<Integer> s = new Stack<>();
    //     s.push(1);
    //     s.push(2);
    //     s.push(3);

    //     reverseStack(s);
    //     printStack(s);

    //que 4
    // int stocks[]={100,80,60,70,60,85,100};
    // int span[]= new int[stocks.length];
    // stockSpan(stocks,span);

    // for(int i=0;i<span.length;i++){
    //     System.out.println(span[i]+" ");
    // }

    //valid paranthesis

    
    String s = "({[]}())";
    System.out.println(validParanthesis(s));



    }
}  
