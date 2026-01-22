import java.util.*;
class reversenum{
    public int reverse(int num){
        int rev =0;
        while(num>0){
            int rem = num%10;
            rev = rev*10+rem;
            num /=10;
        }
        return rev;
    }
}
public class reversing{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        reversenum rev = new reversenum();
        System.out.println(rev.reverse(num));
    }
}
