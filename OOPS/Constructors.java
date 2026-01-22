package OOPS;

public class Constructors {
    public static class Car{
        int price;
        String name;
        //double length;
        Car(){//default constructor

        }

        // Car(int x,String s, double d){
        //     seats=x;
        //     name=s;
        //     length=d;
        // }
        Car(int price, String name){
            this.price = price;
            this.name = name;
        }
        void print(){
            System.out.println(price+" "+name+" ");
        }
    }
    public static void main(String[] args) {
        // Car c1 = new Car(5, " Kia Sonet",3.99);
        // //System.out.println(c1.name);
        // c1.print();
        // Car c2 = new Car(4, " Lord Alto",3.75);
        // c2.print();

        // Car c3 = new Car();
        // c3.name = "Honda Amaze";

        Car c1 = new Car(1250000, "Kia Sonet");
        c1.print();
    }
}
