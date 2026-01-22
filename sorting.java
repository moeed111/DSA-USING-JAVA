import java.util.Arrays;
import java.util.Collections;

public class sorting {
    // bubble sort 

    // public static void bubbleSort(int arr[]){
    //     for(int turn=0;turn<arr.length-1;turn++){
    //         int swap=0;
    //         for(int j=0;j<arr.length-1-turn;j++){
    //             if(arr[j]>arr[j+1]){
    //                 //swap
    //                 int temp = arr[j];
    //                 arr[j]=arr[j+1];
    //                 arr[j+1]=temp;
    //                 swap++;
    //             }
                
    //         }
    //         System.out.print(swap+" ");
    //         if(swap==0){
    //             System.out.println();
    //             break;
    //         }
            
    //     }
        

    // }
    // public static void printarr(int arr[]){
    //     for(int i=0;i<arr.length;i++){
    //         System.out.print(arr[i]+" ");
    //     }
    //     System.out.println();
    // }

    // public static void selectionSort(int arr[]){
    //     for(int i=0;i<arr.length-1;i++){
    //         int minPos = i;
    //         for(int j =i+1;j<arr.length;j++){
    //             if(arr[minPos]>arr[j]){ // change this condition for decreasing order
    //                 minPos=j;
    //             }
    //         }
    //         //swap 
    //         int temp = arr[minPos];
    //         arr[minPos]=arr[i];
    //         arr[i]=temp;
    //     }
    // }
    // public static void printarr(int arr[]){
    //         for(int i=0;i<arr.length;i++){
    //             System.out.print(arr[i]+" ");
    //         }
    //         System.out.println();
    //}

    //Insertion Sort

//     public static void InsertionSort(int arr[]){
//         for(int i=1;i<arr.length;i++){
//            int curr = arr[i];
//            int prev = i-1;
//            //finding out the correct  to insert
//            while(prev >=0 && arr[prev]>curr){
//                arr[prev+1]=arr[prev];
//                prev--;
//            }
//            //insertion
//            arr[prev+1] =curr;
//         }
        
//    }
    // public static void PrintArr(Integer arr[]){
    //     for(int i=0;i<arr.length;i++){
    //         System.out.print(arr[i]);
    //     }
    //  }

    // COUNTING SORT    

    public static void countingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest = Math.max(largest,arr[i]);
        }

        int count[]= new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        //sorting
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    public static void PrintArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
     }


    public static void main(String args[]){
        //  int arr[] = {1,2,3,4,5};
        //  bubbleSort(arr);
        //  printarr(arr);

        // SELECTION SORT 
        // int arr[]={5,4,1,3,2};
        // selectionSort(arr);
        // printarr(arr);

        //Insertion sort
        // int arr[] ={5,4,1,3,2};
        // InsertionSort(arr);
        // PrintArr(arr);

        //inbuilt sorting
        //Integer arr[]={5,4,3,1,2};
        //Arrays.sort(arr);
        //Arrays.sort(arr,0,3);
        // Arrays.sort(arr, Collections.reverseOrder());
        // PrintArr(arr);

        //counting sort

        int arr[]={1,4,1,3,2,4,3,7};
        countingSort(arr);
        PrintArr(arr);
    }
}
