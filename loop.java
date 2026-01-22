import java.util.*;
public class loop {
    public static void main(String args[]){
     // while loop
    // int counter =0;
    // while(counter<100){
    //     System.out.println("Hello World");
    //     counter ++;
    // }

    //Que1. Print numbere from 1 to 10
    // int num=1;
    // while(num<11){
    //     System.out.println(num);
    //     num++;
    // }

    //Que2. Print number from 1 to n
    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    // int i=1;
    // while(i<=n){
    //     System.out.print(i+ " ");
    //     i++;
    // }

    //Que3. Sum of n natural numbers

    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    // int sum=0,i=1;
    // while(i<=n){
    //     sum +=i;
    //     i++;
    // }
    // System.out.println(sum);

    // for loop

    // for(int i=0;i<5;i++){
    //     System.out.println(i);
    // }

    //Que1. Print square pattern

    // for(int i=1;i<=4;i++){
    //     System.out.println("* * * *"); 
    // }

    // same using while

    // int i =1;
    // while(i<=4){
    //     System.out.println("* * * *");
    //     i++;

    //}

    //Que2. print reverse of a number
    // for(int n=10899;n>0;n/=10){
    //     int rev = n%10;
    //     System.out.print(rev);
    // }
    
    //using while
    // int n=10899;
    // while(n>0){
    //     int rev = n%10;
    //     n/=10;
    //     System.out.print(rev);
    // }
    
    //Que3. Reverse the given number 

    // int n=10899;
    // int reverse = 0;
    // while(n>0){
    //     int last_digit = n%10;
    //     reverse = (reverse*10)+  last_digit;
    //     n/=10;
        
    // }
    // System.out.print(reverse);

    //do while loop
    // int i =1;
    // do{
    //     System.out.println("Hello world");
    //     i++;
    // }while(i<=10);

    //break statement
    // for(int i=1;i<=5;i++){
    //     if(i==3){
    //         break;
    //     }
    //     System.out.println(i);
    // }
    // System.out.println("Loop finished.");

    //Que1. Keep entering numbers till useer enters a multiple of 10
    
    // int i=0;
    // while(true){
    //     Scanner sc= new Scanner(System.in);
    //     int num = sc.nextInt();
    //     if(num%10==0){
    //         break;
    //     }
    //     System.out.println(num);
    //     i++;
    // }

    //continue 

    // for(int i =1;i<=5;i++){
    //     if(i==2){
    //         continue;
    //     }
    //     System.out.println(i);
    // }

    //Que1. Display all numbers entered by user expect multiples of 10

    // while(true){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter the number:");
    //     int num = sc.nextInt();
    //     if(num%10==0){
    //         continue;
    //     }
    //     System.out.println(num);
    // }

    //Que. Check if a number is prime or not
    //Method1.
// int i=1,n=10,count=0;
// while(i<=n){
//     if(n%i==0){
//         count++;
//     }
//     i++;
// }
// if(count==2){
//     System.out.println("This is a prime number.");
// }
// else{
//     System.out.println("Not a prime.");
// }

//Method2. 
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter the number:");
// int n = sc.nextInt();
// boolean isPrime = true;
// if(n==2){
//     System.out.println("This is prime number.");
// }
// else{
//     for(int i =2;i<=Math.sqrt(n);i++){
//         if(n%i==0){
//             isPrime = false;
//         }
//     }
//     if(isPrime== true){
//         System.out.println("This is prime number.");
//     }
//     else{
//         System.out.println("Not a prime number.");
//     }
// }

//Practice problems
//Que1. Write a program that reads a set of integers, and then prints the sum of the
//even and odd integers 

Scanner sc = new Scanner(System.in);
System.out.print("Enter the number till you want to calculate the sum:");
int n = sc.nextInt();
int i=1,sum_even=0,sum_odd=0;
while(i<=n){
    if(i%2==0){
        sum_even+=i;
    }
    else{
        sum_odd+=i;
    }
    i++;
}
System.out.println("The sum of odd numbers is:"+sum_odd);
System.out.println("The sum of even numbers is:"+sum_even);


//Que2.Write a program to find the factorial of any number entered by the user.

// Scanner sc = new Scanner(System.in);
// System.out.print("Enter the number:");
// int n = sc.nextInt();
// int fact =1;
// for(int i=n;i>=1;i--){
//     fact *=i;
// }
// System.out.println("The factorial is :"+fact);

//Que3. Write a program to print the multiplication table of a number N, entered by the
//user

// Scanner sc = new Scanner(System.in);
// System.out.print("Enter the number:");
// int n = sc.nextInt();
// int i=1;
// while(i<=10){
//     System.out.println(n+ "x" + i + "=" + n*i);
//     i++;
// }

//print STAR pattern 
// nested loops

//Que1.

// for(int i=1;i<=4;i++){
//     for(int j=1;j<=i;j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }

//Que2. Inverted Stars

// int n=7;
// for(int i=1;i<=n;i++){
//     for(int j=n;j>=i;j--){ // or for(int j=1;j<=(n-i+1);j++)
//         System.out.print("*");
//     }
//     System.out.println();
// }

//Que3. Half-Pyramid pattern
// int n=4;
// for(int i=1;i<=n;i++){
//     for(int j=1;j<=i;j++){
//         System.out.print(j);
//     }
//     System.out.println();
// }

//Que4. Print CHARACTER pattern

//  int n =4;
//  char ch ='A';
//  for(int i=1;i<=n;i++){
//     for(int j=1;j<=i;j++){
//         System.out.print(ch);
//         ch++;
//     }
//     System.out.println();
//  }

// for each loop read

// int numbers[] = {1,2,3,4,5};
// for(int num : numbers){
//     System.out.println("Number:"+num);
// }

}
}