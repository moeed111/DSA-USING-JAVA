import java.util.*;
public class function {
    //Function/methods
    // public static void printHelloWorld(){
    //     System.out.println("Hello World");
    //     System.out.println("Hello World");
    //     System.out.println("Hello World");
    //     return;
    // }
    // public static void main(String args[]){
       
    //     printHelloWorld(); //function call
    
    // public static int calculatesum(int num1, int num2){ //parameters or formal parameters
        
    //     int sum = num1 + num2;
    //     return sum;
     
    // public static void swap(int a, int b){
    //     //swap  
    //     int temp = a;
    //     a =b;
    //     b = temp;
    //     System.out.println("a =" + a);
    //     System.out.println("b =" + b);
    // }

    // }
    // public static int  product(int a,int b){
    //     int product = a*b;
    //     return product;
    // }
    // public static int factorial(int n){
    //     int fact =1;
    //     for(int i =n;i>=1;i--){
    //         fact = fact*i;
    //     }
    //     return fact; // factorial of n 
    // }
    
    // public static int bino_coeff(int n , int r){
    //     int n_fact = factorial(n);
    //     int r_fact = factorial(r);
    //     int nmr_fact = factorial(n-r);
    //     int binocoeff = n_fact/(r_fact*nmr_fact);
    //     return binocoeff;
    // }

    //function overloading using paramters
    //function to calculate sum of two numbers

    // public static int sum(int a,int b){
    //     return a+b;
    // }
    // //function to calc sum of 3 numbers

    // public static int sum(int a,int b,int c){
    //     return a+b+c;
    // }

    //function overloading using data types

    // public static int sum(int a,int b){
    //     return a+b;
    // }
    // public static float sum(float a,float b){
    //     return a+b;
    // }

    //Que1. Check if a number is Prime or Not
    //only for n>=2
//     public static boolean isPrime(int n){
//     //corner cases
//     if(n==2){
//         return true;
//     }
//     //boolean isPrime = true;
//     for(int i=2;i<=n-1;i++){ //optimized condition i<=Math.sqrt(n)
//         if(n%i==0){
//             //isPrime =false;
//             // break;
//             return false;
//         }
//     }
//     return true;
// }

// Que2. Print all Primes in a Range
// public static void primesinrange(int n){
//     for(int i=2;i<=n;i++){
//         if(isPrime(i)){
//             System.out.print(i+" ");
//         }
//     }
//     System.out.println();
// }

//Que2. Convert from Binary to Decimal

    // public static void bintodec(int binnum){
    //     int pow=0;
    //     int dec =0;
    //     int bin = binnum;
    //     while(binnum>0){
    //         int lastdigit = binnum%10;
    //         dec = dec + (lastdigit * (int)Math.pow(2,pow));
    //         pow++;
    //         binnum /=10;
    //     }
    //     System.out.println("decimal of " + bin + " =" + dec);
    // }

    //Que3. Decimal to binary

    // public static void dectobin(int n){
    //     int decNum=n;
    //     int bin =0;
    //     int pow =0;
    //     while(n>0){
    //         int rem = n%2;
    //         bin = bin + rem * (int)Math.pow(10,pow);
    //         pow++;
    //         n /=2;  
    //     } 
    //     System.out.println("binary form of "+ decNum + " is "+bin);
    // }
        
    

    //Syntax with Parameters
    public static void main(String args[]){
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = calculatesum(a,b); //arguments or actual parameters
        // System.out.println(sum);

        //swap - values exchange
        // int a =5;
        // int b =10;
        // swap(a,b);

        //Que1. Find product of a & b 
        // int a =3,b=5;
        // int prod  = product(a,b);
        // System.out.println(prod);

     //Que2. Binomial Coefficient

    //  System.out.println(bino_coeff(5,2));

    // System.out.println(sum(3,5));
    // System.out.println(sum(3,5,6));

    // System.out.println(sum(5,6));
    // System.out.println(sum(7.4f,8.5f));
 
    // System.out.println(isPrime(2));

//    primesinrange(50);

    // bintodec(101);
   
    //dectobin(9);


}
}
