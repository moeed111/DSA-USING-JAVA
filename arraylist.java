
import java.nio.channels.Pipe.SourceChannel;
import java.util.*;
public class arraylist {
    public static void printReverse(ArrayList<Integer> list){ //O(n)
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
    //swap
    public static void swap(ArrayList<Integer> list,int idx1,int idx2){
        int temp=list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
        
    }


    //Container with most water 
    //Brute force - pair wise iteration one by one (O(n^2))
    
    public static int containsMaxWater(ArrayList<Integer> height){
        int maxwater = 0;
        for(int i=0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
                int height1= Math.min(height.get(i),height.get(j));
                int width =j-i;
                int water=height1*width;
                // if(water>maxwater){
                //     maxwater=water;
                // }
                maxwater=Math.max(water,maxwater);
            }
        }
        return maxwater;
    }

    //2 pointer approach //0(n)
      public static int containsMaxWateropt(ArrayList<Integer> height){
        int maxwater = 0;
        int lp=0,rp=height.size()-1;
        while(lp<rp){
        //calculate water area
         int ht=Math.min(height.get(lp),height.get(rp));
         int width=rp-lp;
         int currwater=ht*width;
         maxwater=Math.max(maxwater,currwater);
         //update ptr
                if(height.get(lp)>height.get(rp)){
                    rp--;
                }else{
                    lp++;
                }
            
        
            }
        return maxwater;
    }

    //Pair sum-1
    //Brute force - O(n^2)

    public static boolean painSum1(ArrayList<Integer> list,int target){
    for(int i=0;i<list.size();i++){
        for(int j=i+1;j<list.size();j++){
            if(list.get(i)+list.get(j)==target){
                return true;
            }
        }
    }
    return false;
    }

    //2 pointer approach -0(n)

    public static boolean painSum1opt(ArrayList<Integer> list,int target){
    int lp=0,rp=list.size()-1;
    while(lp<rp){
       if(list.get(lp)+list.get(rp)==target){
        return true;
       }else if(list.get(lp)+list.get(rp)< target){
        lp++;
       }else{
        rp--;
       }
    }
    return false;
    }

    //pair sum 2 
    //2pointer approach - o(n  )
    public static boolean painSum2(ArrayList<Integer> list,int target){
        int bp = -1;
        int n = list.size();
        for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){//breaking point
                bp=i;
                break;
            }
        }

        int lp=bp+1;//smallest
        int rp=bp;//larest

        while(lp!=rp){
            //case1
       if(list.get(lp)+list.get(rp)==target){
        return true;
       }
       //case2
       if(list.get(lp)+list.get(rp)< target){
        lp=(lp+1)%n;
       }else{
        //case 3
        rp=(n+rp-1)%n;
       }
    }
    return false;
    }
    
    public static void main(String args[]){
        //Java Collection Framework
        //Boolean | String | Float 
        //ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<String> list2 = new ArrayList<>();
        // ArrayList<Boolean> list3 = new ArrayList<>();

        // list.add(1);//O(1)
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(4,5);
        // System.out.println(list);

        // //get operation //o(1)
        // System.out.println(list.get(1));

        //delete operative //O(n)

        // list.remove(2);
        // System.out.println(list);

        //Set Element at index //O(n)

        // list.set(2,10);
        // System.out.println(list);

        //contains element O(n)

        // System.out.println(list.contains(1));
        // System.out.println(list.contains(11));

        // System.out.println(list.size());

        // //print the arraylist

        // for(int i=0;i<list.size();i++){
        //     System.out.print(list.get(i)+" ");
        // }
        // System.out.println();
        // printReverse(list);

        //find max O(n)
        // int max=Integer.MIN_VALUE;
        // for(int i=0;i<list.size();i++){
        //     // if(list.get(i)>max){
        //     //     max=list.get(i);
        //     // } 
        //     max = Math.max(max,list.get(i));
        // }
        // System.out.println("MAx element ="+max);
        // list.add(2);//O(1)
        // list.add(5);
        // list.add(9);
        // list.add(3);
        // list.add(6);

        //System.out.println(list);

        // int idx1=1,idx2=3;
        // swap(list,idx1,idx2);
        //System.out.println(list);

        // Collections.sort(list); //sort list ascending

        // //descending
        // Collections.sort(list,Collections.reverseOrder());
        // System.out.println(list);

        //Container with water

        // ArrayList<Integer> height = new ArrayList<>();
        // height.add(1);
        // height.add(8);
        // height.add(6);
        // height.add(2);
        // height.add(5);
        // height.add(4);
        // height.add(8);
        // height.add(3);
        // height.add(7);
        
        //System.out.println(containsMaxWater(height));
        // System.out.println(containsMaxWateropt(height));
        ArrayList<Integer> list = new ArrayList<>();
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);
        // list.add(6);
        // int target=5;
        //System.out.println(painSum1(list, target));
        //System.out.println(painSum1opt(list, target));
        //sorted and rotated
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target=16;
        System.out.println(painSum2(list,target));

    }
}
