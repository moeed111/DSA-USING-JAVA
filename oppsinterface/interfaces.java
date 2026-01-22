package oppsinterface;

public class interfaces {
    public static void main(String args[]){
    Bear b1 = new Bear();
     b1.eatgrass();
    b1.eatmeat();
   
    }
}

interface Herbivore {
    void eatgrass();
    }
interface Carnivore {
    void eatmeat();
    }

class Bear implements  Herbivore,Carnivore{
    public void eatgrass(){
        System.out.println("Bear eat grass");
    }
    public void eatmeat(){
        System.out.println("Bear eat meat also.");
    }
}

