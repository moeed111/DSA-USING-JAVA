import java.util.*;
public class strings {

    public static void printletters(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i)+" "); 
        }
    }

    public static void Palindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)==str.charAt(str.length()-1-i)){
                System.out.println("palinDrome");

            }
            else{
                System.out.println("Not palindorem");
            }
        }
    }

    public static double Shortpath(String str){
        double x=0,y=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='W'){
                x--;
            }
            else if(str.charAt(i)=='E'){
                x++;
            }
            else if(str.charAt(i)=='N'){
                y++;
            }else{
                y--;
            }
        }
        return Math.sqrt(x*x  + y*y);
    }

    public static String substring(String str,int si,int ei){
        String str1="";
        for(int i=si;i<ei;i++){
            str1+=str.charAt(i);
        }
        return str1;
    }

   public static String toUppercase(String str){
    StringBuilder sb = new StringBuilder("");
    char ch = Character.toUpperCase(str.charAt(0));
    sb.append(ch);
    for(int i=1;i<str.length();i++){
        if(str.charAt(i)==' ' && i<str.length()){
            sb.append(str.charAt(i));
            i++;
            sb.append(Character.toUpperCase(str.charAt(i)));
        }else{
            sb.append(str.charAt(i));
        }
    }
    return sb.toString();
    
   } 

   public static String compress(String str){
    String newStr = "";
    for(int i=0;i<str.length();i++){
        Integer count =1;
        while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
            count++;
            i++;
        }
        newStr += str.charAt(i);
        if(count>1){
            newStr += count.toString();
        }
    }
    return newStr;
   }

   //String builder implementation

   public static String compress1(String str){
    StringBuilder newStr =new StringBuilder("");
    for(int i=0;i<str.length();i++){
        Integer count =1;
        while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
            count++;
            i++;
        }
        newStr.append(str.charAt(i));
        if(count>1){
            newStr.append(count.toString());
        }
    }
    return newStr.toString();
   }
    
   // Question 1 : Count how many times lowercase vowels occurred in a String entered by the
// user.

//    public static int Count(String str){

//    }
    public static void main(String args[]){
        // char arr[]={'a','b','c'};
        // String  str ="abcd";
        // String str2 = new String("abcd");

        // // String are immutable
        // Scanner sc = new Scanner(System.in);
        // String name ;
        // name = sc.nextLine();
        // System.out.println(name);
        // String fullName = "Moeed Ahmad";
        // System.out.println(fullName.length());

        // String fullName = "Moeed Ahmad";
        // // System.out.println(fullName.charAt(0));
        // printletters(fullName);

        // String Str = "noon";
        // Palindrome(Str);

        // String str = "WNEENESENNN";
        // System.out.print(Shortpath(str));

        // String str = "Moeed Ahmad";
        // System.out.println(str.substring(0,5));
        // System.out.println(substring(str,0,5));

    //     String str[] = {"mango","apple","banana"};
    //     String largest=str[0];
    //     for(int i=0;i<str.length;i++){
    //         if(largest.compareTo(str[i])<0){
    //             largest=str[i];
    //         }
    //     }
    // System.out.println(largest);

    //  StringBuilder sb = new StringBuilder("");
    //  for(char ch='a';ch<='z';ch++){
    //     sb.append(ch);
    //  }
    //  System.out.println(sb); //O(26);
    
    // String str = "moeed ahmad";
    // System.out.println(toUppercase(str));

    String str = "aaabbcccdd";

    System.out.print(compress1(str));
    

}}
