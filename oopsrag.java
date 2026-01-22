import java.util.*;
public class oopsrag {
    // public static class Student { // khudka ek data type bana liya
    //     String name;
    //     int rno;
    //     double cgpa;
    // }
    public static class Car{
        int seats;
        String name;
        double length;
        String type;
        int torque;

        void print(){   // methods
            System.out.println(name+" "+seats+" ");
        }

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); // Scanner is class, sc is obejct
        // Student s1 = new Student(); // declaration  //s1 is object and class is blurprint
        // s1.name = "Moeed";
        // s1.rno = sc.nextInt();
        // s1.cgpa = 9.06;
        // Student s2 = new Student();  // declaration
        // s2.name = "Ahmad";
        // s2.rno = 121;
        // s2.cgpa = 9.0;
        // System.out.println(s1.name);
        // s2.cgpa = 9.8;
        // System.out.println(s2.cgpa);
        // System.out.println(s1.rno);
        Car c = new Car();
        c.length= 3.99;
        c.name = " Kia Sonet";
        c.seats = 5;
        c.torque = 178;
        c.type = "SUV";

        change(c);
        System.out.println(c.seats);
        c.print();

    }
    private static void change(Car c){
        c.seats=4;
    }

}
