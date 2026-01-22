import java.util.*;
public class arrays {
// //     // public static void update(int marks[]){
// //     //     for(int i=0;i<marks.length;i++){
// //     //         marks[i] = marks[i] +1;
// //     //     }
// //     // }

// //     // public static int linearSearch(int numbers[],int key){
// //     //     for(int i=0;i<numbers.length;i++){
// //     //         if(numbers[i]==key){
// //     //             return i;
// //     //         }
// //     //     }
// //     //     return -1;
// //     // }

// //     // Menu Problem

// //     // public static int menuSearch(String menu[], String item){
// //     //     for(int i=0;i<menu.length;i++){
// //     //         if(menu[i]==item){
// //     //             return i;
// //     //         }
// //     //     }
// //     //     return -1;
// //     // }

// //     // public static int largest(int numbers[]){
// //     //     int largest = Integer.MIN_VALUE; // -infinity
// //     //     int smallest = Integer.MAX_VALUE; // +infinty
// //     //     for(int i=0;i<numbers.length;i++){
// //     //         if(numbers[i]>largest){
// //     //             largest = numbers[i];
                
// //     //         }
// //     //         if(numbers[i]<smallest){
// //     //             smallest = numbers[i];
// //     //         }
// //     //     }
// //     //     System.out.println("Smallest number is:"+smallest);
// //     //     return largest;
        
// //     // }


// //     //Binary search 

// //     // public static int binarySearch(int numbers[]){
// //     //     int n = numbers.length;
// //     //     int key =10;
// //     //     int start=0,end =n-1;
// //     //     while(start<=end){
// //     //         int mid = (start+end)/2;
// //     //         if(numbers[mid]==key){//found
// //     //             return mid;
// //     //         }
// //     //         else if(numbers[mid]<key){//right
// //     //             start = mid+1;
// //     //          }
// //     //          else{//left
// //     //             end = mid-1;
// //     //          }
// //     //     }
// //     //     return -1;
// //     // }
// //     //reverse array

// //     // public static void reverse(int numbers[]){
// //     //    int  last= numbers.length-1;
// //     //     int start =0;
// //     //     while(start < last){
// //     //         int temp = numbers[last];
// //     //         numbers[last]=numbers[start];
// //     //         numbers[start]=temp;
// //     //         last--;
// //     //         start++;
            
// //     //     }
// //     //     for(int i =0;i<numbers.length;i++){
// //     //         System.out.println(numbers[i]);
// //     //     }
        
        
// //     // }

    //pairs in an array
    // public static void Pairs(int numbers[]){
    //     int tp=0;
    //     int n = numbers.length;
    //     for(int i=0;i<n;i++){
    //         for(int j=i+1;j<n;j++){
    //             System.out.print("("+numbers[i]+","+numbers[j]+")");
    //             tp++;
    //         }
    //         System.out.println();
    //     }
    //     System.out.println("total no of pairs is:"+tp);
// //     // }

    // public static void subarrays(int numbers[]){
    //     int ts =0;
        
    //     for(int i=0;i<numbers.length;i++){
    //         for(int j=i;j<numbers.length;j++){
    //             for(int k=i;k<=j;k++){//print
    //                 System.out.print(numbers[k]+" ");///subarray
    //             }
                
    //             ts++;
    //             System.out.println();
    //      }
    //      System.out.println();
    //     }  
    //     System.out.println("Total number of subarrays are:"+ts);
        
    // }

// //      //max subarray sum

    // public static void subarrays(int numbers[]){
    //     int max_sum = Integer.MIN_VALUE;
    //     int current_sum=0;
        
    //     for(int i=0;i<numbers.length;i++){
    //         for(int j=i;j<numbers.length;j++){
    //             current_sum=0;
    //             for(int k=i;k<=j;k++){
    //                 current_sum +=numbers[k];
    //             }
    //             System.out.println("Current sum: "+current_sum);
    //             if(current_sum>max_sum){
    //                 max_sum=current_sum;
    //                 } 
    //             }
    //         } 
    //     System.out.println("maximum sum: " +max_sum); 
    // }

// //     //prefix sum approach for max subarray sum

    // public static void maxsubarraysum(int numbers[]){
    //     int currSum=0;
    //     int maxSum =Integer.MIN_VALUE;
    //     int prefix[]=new int[numbers.length];
    //     prefix[0]=numbers[0];
    //     //calculate prefix
    //     for(int i=1;i<prefix.length;i++){
    //         prefix[i]=prefix[i-1]+numbers[i];
    //     }
    //     for(int i=0;i<numbers.length;i++){
    //         for(int j=i;j<numbers.length;j++){
    //             currSum = i == 0? prefix[j] :prefix[j]-prefix[i-1];
    //             //System.out.println(currSum); 
    //             if(currSum>maxSum){
    //                 maxSum=currSum;
    //             }
    //         }
    //     }
    //     System.out.println("MAx sum is :"+maxSum);
    // }

// //     //kadanes

    // public static void kadanes(int numbers[]){
    //     int ms = Integer.MIN_VALUE;
    //     int cs = 0;
        
    //     for(int i=0;i<numbers.length;i++){
            
    //         cs = cs + numbers[i];
    //         if(cs<0){
    //             cs=0;
    //         }
    //         ms = Math.max(cs, ms);
    //     }
        
    //     System.out.println("max subarray sum is :"+ms );
    // }
// //     //kadanes(if all elements are negative)

    // public static void kadanes1(int numbers[]){
    //     int ms = Integer.MIN_VALUE;
    //     int cs = 0;
    //     int j=0;
    //     while(numbers[j]<0 && j!=numbers.length-1){
    //         j++;
    //     }
    //     if(j==numbers.length-1){
    //         Arrays.sort(numbers);
    //         System.out.println(numbers[numbers.length-1]);
    //     }
    //     for(int i=0;i<numbers.length;i++){
            
    //         cs = cs + numbers[i];
    //         if(cs<0){
    //             cs=0;
    //         }
    //         ms = Math.max(cs, ms);
    //     }
        
    //     System.out.println("max subarray sum is :"+ms );
    // }
 
   
    //Trapping Rainwater 

    public static int trappedRainwater(int height[]){
        int n = height.length;
        //calculate left max boundary - array
        int leftMax[] = new int[n];
        leftMax[0]= height[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }
        

        //calculate right max boundary -array

        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i] =Math.max(height[i],rightMax[i+1]);
        }
        int trappedWater =0;
        //loop
        for(int i=0;i<n;i++){
            //waterLevel = min(leftmax bound , rightmax bound )
            int waterLevel = Math.min(leftMax[i],rightMax[i]);

            //trapped water = waterLevel - height[i]
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;


         
     }

// //     // sell and buy stocks

// // // public static int buyAndSellStocks(int prices[]){
// // //     int buyPrice = Integer.MAX_VALUE;
// // //     int maxProfit =0;
// // //     for(int i=0; i<prices.length;i++){
// // //         if(buyPrice < prices[i]){ //profit
// // //             int profit = prices[i] - buyPrice ; // today's profit
// // //             maxProfit = Math.max(maxProfit , profit);
// // //         }else {
// // //             buyPrice = prices[i];
// // //         }
// // //     }
// // //     return maxProfit;
// // // }
        
//}  

   public static void main(String args[]){

// //     //creating an array     
// //        //int marks[]=new int[100]; // by defining the size
// //        //int numbers[] ={1,2,3}; // by directly adding the elements
    
// //     //input/output

// //     //Scanner sc = new Scanner(System.in);
    
// //     //find the length of an array

// //    // System.out.println("The length of array is "+ marks.length);
    
// //     // marks[0] = sc.nextInt();
// //     // marks[1] = sc.nextInt();
// //     // marks[2] = sc.nextInt();

// //     // //output
// //     // System.out.println("phy : " + marks[0] +  " chem: " + marks[1] + " math: " + marks[2]);
// //     // //update
// //     // marks[2] =100;
// //     // System.out.println("Math: "+marks[2]);

// //     //int marks[] = {99,98,97};
// //     // update(marks);
    
// //     // // print our marks
// //     // for(int i=0;i<marks.length;i++){
// //     //     System.out.print(marks[i]+" ");
// //     // }
// //     // System.out.println();

// //     //Linear Search

// //     // int numbers[]= {2,4,6,8,10,12,14,16};
// //     // int key =14;

// //     // int index = linearSearch(numbers,key);
// //     // if(index==-1){
// //     //     System.out.println("Not found");
// //     // }
// //     // else{
// //     //     System.out.println("Key is at index :"+index);
// //     // }
    
// //     //Menu Problem

// //     // String menu[] = {"Samosa", "jalebi","pakoda","kau katli"};
// //     // String item = "jalebi";
// //     // System.out.println(menuSearch(menu , item));

    
// // // int numbers[] = {1,2,6,3,5};
// // // int number = largest(numbers);

// // //     System.out.println("largest number is: "+number);

// // //Binary search 

// // // int numbers[]={2,4,6,8,10,12,14};

// // // System.out.println("Index for key is : "+ binarySearch(numbers));

// // //Reverse an array 
// // // int numbers[] ={2,4,6,8,10};
// // // reverse(numbers);

// // //pairs in an array

// int numbers[] ={2,4,6,8,10};
// Pairs(numbers);

// //print subarrays 
// int numbers[]={2,4,6,8,10};
// subarrays(numbers);

// // max subarray sum

// int numbers[]={2,4,6,8,10};
// subarrays(numbers);

// // prefix sum approach for max subarray sum

// int numbers[]={1,-2,6,-1,3};
// maxsubarraysum(numbers);

// // kadanes max subarray sum

// int numbers[]={-2,-3,-4,-1};
// int numbers[]={-2,-3,4,-1,-2,1,5,-3};
//kadanes(numbers); 
//kadanes1(numbers); 

// // // TRAPPING RAINWATER 

int height[]={4,2,0,6,3,2,5};
System.out.println(trappedRainwater(height));

// // // int prices[] = {7,1,5,3,6,4};
// // // System.out.println(buyAndSellStocks(prices));
}

 }

