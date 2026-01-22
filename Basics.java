//boilerplate code
import java.util.*;
public class Basics {
    public static void main(String args[]){
        // System.out.println("Hello World"); // ln gives a line space
        // System.out.println("Hello World"); // or we can use \n 
        // System.out.print("****\n***\n**\n*"); 
// VARIABLES AND LITERALS
// Memory
        // int a =10;
        // int b=5;
        // System.out.println(a);
        // System.out.println(b);
        // String name = "Moeed";
        // System.out.println(name);
        // a=50;
        // System.out.println(a);  

//Data type
// byte b=8; //till [-128 to 127] 256 numberscan store in byte // less used   
// System.out.println(b); 
// char ch ='a'; //single characters
// System.out.println(ch);
// boolean var =true; 
// int a=3;
// double price = 10.5;
// //long is used for big integer values
// //double is used for big floating values
// short n =  240; //less used

// practice problem for sum of two numbers

// int a =10;
// int b =5;
// int sum = a+b;
// System.out.println(sum);
  
//input in java

// Scanner sc = new Scanner(System.in); //instead of sc we can write anything
//System.out.print("Enter text:");
// String input =sc.next(); // next takes value till space
// System.out.println(input);

// String name = sc.nextLine();
// System.out.println(name);

// int number = sc.nextInt();
// System.out.println(number);

// float price = sc.nextFloat();
// System.out.println(price);

// short s = sc.nextShort();
// System.out.println(s);

// boolean var = sc.nextBoolean();
// System.out.println(var);

//sum of a and b using input

// Scanner sc = new Scanner(System.in);
// System.out.print("Enter number1:");
// int a = sc.nextInt();
// System.out.print("Enter number2:");
// int b = sc.nextInt();
// int sum = a+b;
// System.out.print("The sum is:");
// System.out.println(sum);

//product of a and b

// Scanner sc = new Scanner(System.in);
// System.out.print("Enter a:");
// int a = sc.nextInt();
// System.out.print("Enter b:");
// int b = sc.nextInt();
// int product = a*b;
// System.out.print("The product is :");
// System.out.println(product);

// area of circle

// Scanner sc = new Scanner(System.in);
// System.out.print("Enter the radius:");
// float radius = sc.nextFloat();
// float pie = 3.14f;
// float area = pie*radius*radius;
// System.out.print("The area is :");
// System.out.println(area);

// Type Conversion
// Type Casting(lossy conversion )
//  float a= 25.2f;
//  int b = (int)a;
//  System.out.println(b);

// character to numbers 

// char c ='a';
// int number= c;
// System.out.println(number);

//Type promotion in Java
 
// char a = 'a';
// char b = 'b';
// //char c = a-b; // throws error as int is changing into char
// System.out.println((int)(a));
// System.out.println((int)(b));
// System.out.println(a);
// System.out.println(b-a);

//Practice problems
//Que 1. Avg of three numbers

// Scanner sc = new Scanner(System.in);
// System.out.print("Enter the three numbers: ");
// float a = sc.nextFloat();
// float b = sc.nextFloat();
// float c = sc.nextFloat();
// float avg = (a+b+c)/3;
// System.out.println(avg);

//Que 2. Area of square

// Scanner sc = new Scanner(System.in);
// System.out.print("Enter the side of the square: ");
// int side = sc.nextInt();
// int area = side * side ;
// System.out.print("The area of the square is:");
// System.out.println(area);

//Que 3. 
Scanner sc = new Scanner(System.in);
System.out.print("Enter pencil price: ");
float pencil_price = sc.nextFloat();
System.out.print("Enter pen price: ");
float pen_price = sc.nextFloat();
System.out.print("Enter eraser price: ");
float eraser_price = sc.nextFloat();
float final_price = (pencil_price + pen_price + eraser_price) ;
float gst = (0.18f)*(final_price);
float bill = final_price + gst;
System.out.print("Your final bill is of:");
System.out.print(bill);

    }
}
