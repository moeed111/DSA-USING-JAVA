import java.util.*;
import java.util.Collections;
public class prac{
    // public static int subarrayssum(int numbers[]){
    //     int sum=0;
    //     for(int i=0;i<numbers.length;i++){
    //         for(int j=i;j<numbers.length;j++){
    //             for(int k=i;k<=j;k++){
    //                 sum+=numbers[k];
    //             } 
    //     }
    //      }  
    //     return sum;
        
    // }

    // public static int subarrayssum(int numbers[]){
    //     int sum=0;
    //     for(int i=0;i<numbers.length;i++){
    //         sum +=3*(i+1)*(numbers.length-i);
    //         }
          
    //     return sum;
        
    // }

    // public static boolean diagonalmat(int arr[][]){
        
    //     for(int i=0;i<arr.length;i++){
    //         for(int j=0;j<arr[i].length;j++){
    //             if(i>j && i<j ){
    //                 arr[i][j]=0;
    //             }
    //             if(i==j){
                    
    //             }
    //         }
    //     }
    // }

//    public static int consective(int arr[]){
    
//    }
public static int power(int x,int y){
    int ans=1;
    int i=1;
    while(i<=y){
        
        ans =ans * (x);
        i++;
    }
    return ans;
}

public static int powerrec(int x,int y){
    if(y==0){
        return 1;
    }
    return x* powerrec(x,y-1);
}

public static int mulusingadd(int a,int b){
    int sum=a;
    for(int i=1;i<b;i++){
        sum+=2;
    }
    return sum;
}
// public static int mulusingaddrec(int a,int b){
    
    
//     return ;
// }
public static int minimumBoxes(int arr1[],int arr2[]){
    Arrays.sort(arr2);
    int j = arr2.length-1;
    int count=0;
    int sum=0;
    for(int i=0;i<arr1.length;i++){
       sum+=arr1[i];
        
    }
    int bsum =0;
    for(int i=j;i>=0;i--){
        
        bsum+=arr2[i];
        count++;
        if(bsum>=sum)
            break;
    }
    return count;
}

public static int conTmaxWater(int arr[]){
    int max=0;
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            int len= j-i;
            int height = Math.min(arr[i],arr[j]);
            int area = len * height;
            max = Math.max(area,max);

        }

    }
    return max;
}

public static int contMaxWater(ArrayList<Integer> list){
    int max=0;
    for(int i=0;i<list.size();i++){
        for(int j=i+1;j<list.size();j++){
            int len = j-i;
            int hei = Math.min(list.get(i),list.get(j));
            int area = len*hei;
            max= Math.max(area,max);
        }
    }
    return max;
}
public static void printArr(int arr[]){
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]+" ");
    }
}
public static void merge(int arr[],int si, int mid, int ei){
    int temp[]= new int[ei-si+1];
    

}

public static void mergesort(int arr[],int si,int ei){
    int mid = si + (ei-si)/2;
    if(si>=ei){
        return;
}
mergesort(arr,si,mid);
mergesort(arr, mid+1,ei);
merge(arr,si,mid,ei);

}

    public static void main(String args[]){
        // int arr[]={1,2,3,4,5};
        // System.out.println(subarrayssum(arr));
        // Scanner sc = new Scanner(System.in);
        // int arr[][]=new int[5][5];
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j< arr[i].length;j++){
        //         arr[i][j]=sc.nextInt();
        //     }
        // }
        // System.out.println(diagonalmat(arr))
        // int arr[]={1,1,0,0,0,1,1,1};
        // System.out.println(consective(arr));

        // int x=3,y=3;
        // System.out.print(power(x,y));
        // System.out.println();
        // System.out.print(powerrec(x,y));
        // System.err.println();
        // System.out.println(mulusingadd(2, 3));
        // ArrayList<Integer> list = new ArrayList<>();
        // for(int i=1;i<6;i++){
        //     list.add(i);
        // }

        // for( int i=list.size()-1;i>=0;i--){
        //     System.out.print(list.get(i)+" ");
        // }

        // int temp = list.get(1);
        // list.set(1,list.get(3));
        // list.set(3,temp);

        // for( int i=list.size()-1;i>=0;i--){
        //     System.out.print(list.get(i)+" ");
        // }

        // int arr1[]= {5,5,5};
        // int arr2[]={2,4,2,7};
        // //Arrays.sort(arr2,Collections.reverseOrder());
        // System.out.print(minimumBoxes(arr1,arr2));
        //int arr[]={1,8,6,2,5,4,8,3,7};
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        System.out.print(contMaxWater(list));
        int arr[]= { 6,3,9,5,2,8};
        mergesort(arr,0,arr.length-1);
        printArr(arr);



    }
}