

public class Exceptionhandling {
    public static void main(String args[]){
        // int a[]= {11,2,14};
        // int b[]={2,0,5};
        // for(int i=0;i<=a.length;i++){
        //     try{
        //         System.out.print(a[i]/b[i]+"\n");
        //     }catch(Exception e){
        //         System.out.println(e);
        //     }
            
        // }
        // System.out.println("Good job");
        System.out.println(divide(5, 0));
    }
    public static int divide(int a, int b){
        try{
            return a/b;
        }catch(Exception e){
            System.out.println(e);
            return -1;
        }finally{
            System.out.println("Bye");
        }
    }
}
