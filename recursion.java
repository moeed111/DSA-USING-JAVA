public class recursion {
    // 1.Print number from n to 1 in decreasing order  
    // public static void DecNumber(int n){
    //     if(n==1){
    //         System.out.println(n);
    //         return ;
    //     }
    //     else{
    //         System.out.print(n+ " ");
    //         DecNumber(n-1); 
    //     }
        
         
    // }

    //2.Print numbers from 1 to n increasing order
    // public static void IncNumber(int n){
    //     if(n==1){
    //         System.out.print(n );
    //         return;
    //     }
    //     else{
    //         IncNumber(n-1);
    //         System.out.print(n+" ");
    //     }
    // }

    //3.Print factorial of a number n.
    // public static int fact(int n){
    //     if(n==0){
    //         return 1;
    //     }
    //     else{
    //         return n * fact(n-1);
    //     }
    // }

    //4.Print sum of first n natural numbers
    // public static int Sum(int n){
    //     if(n==1){
    //         return 1;
    //     }
    //     else{
    //         return n+Sum(n-1);
    //     }
    // } 

    //5. Print Nth fibonacci number
    // public static int fibonacci(int n){
    //     // if(n==0){
    //     //     return 0;
    //     // }
    //     // else if(n==1){
    //     //     return 1;
    //     if(n==0 || n==1){
    //         return n;
    //     }
        
    //     else{
    //         return fibonacci(n-1)+fibonacci(n-2);
    //     }
    // }

    //6. Check if given array is sorted or not.
    // public static boolean Sorted(int arr[], int i){
    //     if(i==arr.length-1){
    //         return true;
    //     }
    //     if(arr[i]>arr[i+1]){
    //         return false; 
    //     }
    //     return Sorted(arr,i+1);
        
    // }

    //7.WAF to find the first occurence of an element in an array
    // public static int firstOcc(int arr[],int key,int i){
    //     if(i==arr.length){
    //         return -1;
    //     }
    //     if(key==arr[i]){
    //         return i;
    //     }
    //     return firstOcc(arr, key, i+1);
    // }
    //8.WAF to find the last occurence of an element in an array
    // public static int lastOcc(int arr[],int key,int i){
    //     if(i==arr.length){
    //         return -1;
    //     }
    //     int isFound = lastOcc(arr, key, i+1);
    //     if(isFound == -1 && arr[i]==key){
    //         return i;
    //     }
    //     return isFound;
    // }

    //or

    // public static int lastOcc(int arr[],int key,int i){
    //     if(i==-1){
    //         return -1;
    //     }
    //     if(arr[i]==key){
    //         return i;
    //     }
    //     return lastOcc(arr,key,i-1);
    // }

    //9.Print x^n
    // public static int power(int x,int n){
    //    if(n==0){
    //     return 1;
    //    }  
    //    return x * power(x,n-1);
    // }

    //10.print x^n(optimized)(O logn)
    // public static int optimizedPower(int a,int n){
    //     if(n==0){
    //         return 1;
    //     }
    //     int halfPower = optimizedPower(a, n/2);
    //     //int halfPowerSq = optimizedPower(a, n/2) * optimizedPower(a, n/2);
    //     int halfPowerSq = halfPower * halfPower;

    // //n is odd
    // if(n%2!=0){
    //     halfPowerSq = a * halfPowerSq;
    // }
    // return halfPowerSq;
    // }

    //11. Tiling Problem 
    // public static int TilingProblem(int n){//2xn (floor size)
    //     //base case
    //     if(n == 0 || n==1){
    //         return 1;
    //     }
    //     //kaam
    //     //vertical choice
    //     // int fnm1 = TilingProblem(n-1);
    //     // //horizontal choice
    //     // int fnm2 = TilingProblem(n-2);

    //     // int totways = fnm1 + fnm2;
    //     // return totways;
     // or in single line 

    //     return TilingProblem(n-1) + TilingProblem(n-2);
    // }

    //12. Remove duplicates in a String 
    // public static void removeDuplicates(String str, int idx , StringBuilder newStr, boolean map[]){
    //     if(idx == str.length()){
    //         System.out.println(newStr);
    //         return; 
    //     }

    //     //kaam
    //     char currChar = str.charAt(idx);
    //     if(map[currChar-'a'] == true){
    //         //duplicate
    //         removeDuplicates(str, idx+1, newStr, map);
    //     } else{
    //         map[currChar-'a'] = true;
    //         removeDuplicates(str, idx+1, newStr.append(currChar), map);
    //     }
    // }

    //13. Friends Pairing Problem

    // public static int friendsPairing(int n){
    //     if(n ==1 || n==2){
    //         return n;
    //     }
    //     // //choice
    //     // //single
    //     // int fnm1 = friendsPairing(n-1);

    //     // //pair
    //     // int fnm2 = friendsPairing(n-2);
    //     // int pairways = (n-1) * fnm2;

    //     // //totalways
    //     // int totWays = fnm1 + pairways;
    //     // return totWays;

    //     //or in single line 

    //     return friendsPairing(n-1) + (n-1) * friendsPairing(n-2);
    // }

    //14 . Binary String Problem
    public static void printBinStrings(int n, int lastPlace, String str){
        if(n ==0){
            System.out.println(str);
            return;
        }
        //kaam
        // if(lastPlace ==0){
        //     //sit 0 on chair n
        //     printBinStrings(n-1, 0, str.append("0"));
        //     printBinStrings(n-1, 1, str.append("1"));
        // } else{
        //     printBinStrings(n-1, 0, str.append("0"));

        // }
        printBinStrings(n-1, 0, str+"0");
        if(lastPlace ==0){
            printBinStrings(n-1, 1, str+"1");
        }
    }
     public static void main(String args[]){
        printBinStrings(3, 0, "");
        //System.out.println((friendsPairing(3)));

        // String str = "appnnacollege";
        // removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
        //System.out.println(TilingProblem(3));
        // int a =2;
        // int n=5;
        // System.out.println(optimizedPower(a, n));
        //System.out.println(power(2,10));
        //int n=5;
        // int arr[]={8,3,6,9,5,10,2,5,3};
        // System.out.println(Sorted(arr,0 )); 
        //System.out.println(lastOcc(arr,5,arr.length-1));
        //System.out.println(fibonacci(n));
        //IncNumber(n);
        //DecNumber(n); 
        
    } 
}