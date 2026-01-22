public class bitmanipulation {
//1 . odd or even 
public static void oddorEven(int n){
    int bitmask =1;
    if((n&bitmask) ==1){
        System.out.println("Odd");
    }else{
        System.out.println("even");
    }
}

//2. get ith bit
public static int getitbit(int n , int i){
    int bitmask = 1<<i;
    if((n&bitmask)==0){
        return 0;
    }else{
        return 1;
    }
    
}
//3. set ith bit
public static int setithBit(int n,int i){
    int bitmask = 1<<i;
     return n|bitmask;
     

}

//4. Clear ith bit 
public static int clearithBit(int n,int i){
    int bitmask = ~(1<<i);
     return n&bitmask;
     

}

//5. rotation of the array 

    public static void main(String agrs[]){
        //oddorEven(5);
        System.out.println(clearithBit(10, 1));
    }
}