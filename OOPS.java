public class OOPS{
    public static void main(String args[]){
        // Pen p1 = new Pen(); // created pen object called p1
        // p1.setColor("Blue");
        // System.out.println(p1.getColor());
        // p1.setTip(5);
        // System.out.println(p1.getTip());
        // p1.setColor("yellow");
        // System.out.println(p1.getColor());

        //BankAccount myAcc = new BankAccount();
        // myAcc.username = "moeed123";
        // // myAcc.password = "afadasdasdasd"; wrong
        // myAcc.setPassword("abacdedf"); // as it is private it can only be changed not accesees

        // Student s1= new Student(); 
        
        // s1.name="Moeed";
        // s1.rollNo=123;
        // s1.password="abcd";
        // s1.marks[0]=100;
        // s1.marks[1]=150;
        // s1.marks[2]=50;

        // Student s2= new Student(s1);
        // s2.password="xyz";

        // for(int i=0;i<3;i++){
        //     System.out.println(s2.marks[i]);
        // }

        // Shark s1 = new Shark();
        // s1.eat();

    }
}

// class BankAccount{
//     public String username;
//     private String password;

//     public void setPassword(String pwd){
//         password = pwd;
//     }
// }
//     class Pen{
//         String color; // property
//         int tip;      // property
    
//     String getColor(){
//         return this.color;
//     }
//     int getTip(){
//         return this.tip;
//     }
//     void setColor(String newColor){ 
//         this.color=newColor;
//     }

//     void setTip(int newTip){
//         this.tip  = newTip;
//     }
// }


// class Student{
    
//     String name;
//     int rollNo;
//     String password;
//     int marks[];

//     Student(){
//         marks=new int[3];
//         System.out.println("Constructor");
//     }

// //     //copy constructor
// //     Student(Student s1){
// //         marks=new int[3];
// //         this.name=s1.name;
// //         this.rollNo=s1.rollNo;
// //         this.marks=s1.marks;
// //     }
    
// //} 

// class Animal {
//     String color;
//     void eat(){
//         System.out.println("eats");
//     }

//     void breathe(){
//         System.out.println("breathes");
//     }


// }
// class Fish extends Animal {
//     int fins;
//     void swim(){
//         System.out.println("Sswins");
//     }
// }
// class Tuna extends Fish {
    
//     void depth(){
//         System.out.println("Lives in depth");
//     }
// }
// class Shark extends Fish {
    
//     void size(){
//         System.out.println("Very big and fast");
//     }
// }

// class Bird extends Animal {
//     void fly(){
//         System.out.println("FLies");
//     }
// }
// class Peacock extends Bird {
//     void Dance(){
//         System.out.println("Dance");
//     }
// }
// class Mammal extends Animal {
//     void walk(){
//         System.out.println("walks");
//     }
// }
// class Dog extends Mammal {
//     void bark(){
//         System.out.println("barks");
//     }
// }
// class Cat extends Mammal {
//     void meow(){
//         System.out.println("meows");
//     }
// }
// class Human extends Mammal {
//     void Cooks(){
//         System.out.println("Cooks");
//     }
// }