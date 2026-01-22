import java.util.*;
public class conditionalstatements {
    public static void main(String args[]){
// if-else statements.
// int age =20;
// if (age>13 && age<18){
//     System.out.println("You are a teenager.");
// }
// else{
//     System.out.println("You are an adult.");
// }

//Que1. print the largest of 2

// int a =1,b=3;

// if(a>b){
//     System.out.println(a+" is the largest.");
// }
// else{
//     System.out.println(b+" is the largest.");
// }

//Que2. Print if a number is Odd or even

//  Scanner sc = new Scanner(System.in);
//  System.out.print("Enter the number: ");
//  int a = sc.nextInt();
//  if(a%2==0){
//     System.out.println("This is an even nnumber.");
//  }
//  else{
//     System.out.println("This is an odd number.");
//  }

// else if statements 
// Que . Income Tax Calculator
//  Scanner sc = new Scanner(System.in);
//  System.out.print("Enter the income: ");
//  int income = sc.nextInt();
//  float tax;
//  if(income<500000){
//    tax = 0f*income;
//     System.out.print("Your tax amount is: " + tax);
//  }
//  else if(income>=500000 && income<1000000){
//     tax = .2f*income;
//     System.out.print("Your tax amount is: " + tax);
//  }
//  else{
//     tax = .3f*income;
//     System.out.print("Your tax amount is: " + tax);
//  }

// Que. Print the largest of three numbers.
// int a =1,b=3,c=6;
// if(a>b && a>c){
//     System.out.println("A is the greatest.");
// }
// else if(b>a && b>c){
//     System.out.println("B is the greatest.");
// }
// else{
//     System.out.println("C is the greatest.");
// }

//Ternary operators

// int number =4;
// String type =(number)%2==0?"Even":"odd";
// System.out.println(type);

//Que. pass or fail 
// int marks = 45;
// String result = (marks>=33)? "Pass":"Fail";
// System.out.println(result);

//Switch statements.
// int number =3; // it can be a character also
// switch(number){
//     case 1: System.out.println("Samosa");
//     break;
//     case 2: System.out.println("Burger");
//     break;
//     case 3: System.out.println("Mango shake");
//     break;
//     default : System.out.println("We wake up.");
// }

//Que. Calculator.
//  Scanner sc = new Scanner(System.in);
//  int num1 = sc.nextInt();
//  String operator = sc.next(); // or we can write char operand = sc.next().charAt(0);
//  int num2 = sc.nextInt();
//  switch(operator){
//     case "+": System.out.println(num1+num2);
//     break;
//     case "-": System.out.println(num1-num2);
//     break;
//     case "*": System.out.println(num1*num2);
//     break;
//     case "/": System.out.println(num1/num2);
//     break;
//     case "%": System.out.println(num1%num2);
//     break;
//     default: System.out.println("Syntax Error");
    
    // }

    //QUE1. CHECK  +ve or -ve
    // Scanner sc = new Scanner(System.in);
    // int num = sc.nextInt();
    // if(num>0){
    //     System.out.println("Positive number.");
    // }
    // else if(num<0){
    //     System.out.println("Negative number.");
    // }
    // else{
    //     System.out.println("You entered zero.");
    // }

    //Que2. check fever if temperature is above 100
    // Scanner sc = new Scanner(System.in);
    // double temp = sc.nextDouble();
    // if(temp>100){
    //     System.out.println("You have a fever.");

    // }
    // else{
    //     System.out.println("You don't have fever,so chill.");
    // }

    //Que3. week number to day
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter day number(1-7):");
    int num = sc.nextInt();
    switch(num){
        case 1: System.out.println("Monday");
        break;
        case 2: System.out.println("Tuesday");
        break;
        case 3: System.out.println("Wednesday");
        break;
        case 4: System.out.println("Thrusday");
        break;
        case 5: System.out.println("Friday");
        break;
        case 6: System.out.println("Saturday");
        break;
        case 7: System.out.println("Sunday");
        break;
        default: System.out.println("Enter valid number.");
    }
    //Que4. Leap year problem

    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter year:");
    // int year = sc.nextInt();
    // if(year%4==0){
    //     if (year%100==0){
    //         if(year%400==0){
    //             System.out.println("This is a leap year.");
    //         }
    //         else{
    //             System.out.println("This is not a leap year.");
    //         }
    //     }
    //     else{
    //         System.out.println("This is a leap year.");
    //     }
    //     }
    //     else{
    //         System.out.println("This is not a leap year.");
    // }

    // another  method 
//     Scanner sc = new Scanner(System.in);
// System.out.print("Input the year: ");
// int year = sc.nextInt();
// boolean x = (year % 4) == 0;
// boolean y = (year % 100) != 0;
// boolean z = ((year % 100 == 0) && (year % 400 == 0));
// if (x && (y || z)) {
// System.out.println(year + " is a leap year");
// } else {
// System.out.println(year + " is not a leap year");
// }
    }
    }   

