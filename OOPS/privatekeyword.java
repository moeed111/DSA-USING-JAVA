package OOPS;
class Students{
        String name; // string - default = null;
        private int rno; //0
        double cgpa; //0.0
        void print(){ //getter
            System.out.println(rno);
        }
        // void p(){
        //     print();
        // }
        int getRno(){ //getters
            return rno;
        }
        void setRno(int x){ //setters 
            rno = x;
        }
    }
public class privatekeyword {
    
    public static void main(String args[]){
        Students  s1 = new Students();
        //System.out.println(s1.cgpa);
        //s1.rno =12;
        s1.cgpa = 8.9;
        s1.name = "Moeed";
        //System.out.println(s1.rno);
        //s1.print();
        s1.setRno(120);
        System.out.println(s1.getRno());
    }
}

