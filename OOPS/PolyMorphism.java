package OOPS;

public class PolyMorphism { //ek naam anek kaam
    public static class Dog {
        void speak(){
            System.out.println("Bhau Bhau");
        }
    }
    public static class Cat {
        void speak(){
            System.out.println("Meow Meow");
        }
    }
    public static class Lion {
        void speak(){
            System.out.println("GRRRR");
        }
    }
    public static class Pikachu {
        void speak(){
            System.out.println("Pika pika");
        }
    }
    public static class Human {
        void speak(){
            System.out.println("pta nahi");
        }
    }
    public static void main(String args[]){
        Dog d = new Dog();
        Human h = new Human();
        Pikachu p = new Pikachu();
        Cat c = new Cat();
        Lion l = new Lion();

        d.speak();
        h.speak();
        p.speak();
        c.speak();
        l.speak();
    }
}
