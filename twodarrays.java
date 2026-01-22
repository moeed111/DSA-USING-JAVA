import java.util.*;
public class twodarrays {

    //search element in matrix
//     public static void search(int matrix[][]){
//         int largest = Integer.MIN_VALUE;
//         int smallest = Integer.MAX_VALUE;
//         for(int i=0;i<matrix.length;i++){
//             for(int j=0;j<matrix[0].length;j++){
//             //     if(matrix[i][j]==key){
//             //             System.out.println("Found at cell (" +i+","+j+")");
//             //             return true;
//             //         }
//             //     }
//             // }
//             // System.out.println("Key not found.");
//             // return false;
//         if(matrix[i][j]>largest){
//             largest=matrix[i][j];
//         }
//         if(matrix[i][j]<smallest){
//             smallest=matrix[i][j];
//         }
//         }
//     }
//     System.out.println("The largest value in matrix is: "+largest);
//     System.out.println("The smallest value in matrix is: "+smallest);
// }

//spiral matrix
// public static void printSpiral(int matrix[][]){
//     int startRow =0;
//     int startCol =0;
//     int endRow = matrix.length-1;
//     int endCol = matrix[0].length-1;

//     while(startRow <= endRow && startCol <= endCol){
//         //top
//         for(int j=startCol;j<=endCol;j++){
//             System.out.print(matrix[startRow][j]+" ");
//         }

//         //right
//         for(int i=startRow+1;i<=endRow;i++){
//             System.out.print(matrix[i][endCol]+" ");
//         }

//         //bottom
//         for(int j=endCol-1;j>=startCol;j--){
//             if(startRow == endRow){
//                 break;
//             }
//             System.out.print(matrix[endRow][j]+" ");
//         }

//         //left
//         for(int i=endRow-1;i>=startRow+1;i--){
//             if(startCol == endCol){
//                 break;
//             }
//             System.out.print(matrix[i][startCol]+" ");
//         }
//         startRow++;
//         startCol++;
//         endRow--;
//         endCol--;
        
//     }
//     System.out.println();
// }

// public static int diagonalsum(int matrix[][]){ //O(n^2)
//     int sum=0;
    // for(int i=0;i<matrix.length;i++){
        
    //     for(int j=0;j<matrix[0].length;j++){
    //         if(i==j){
    //             sum += matrix[i][j];
    //         }
    //         else if(i+j==matrix.length-1){
    //             sum += matrix[i][j];
    //         }
    //     }
        
    
    // }
    //best time complexity for diagonal sum //0(n)
    // for(int i=0;i<matrix.length;i++){
    //     //pd 
    //     sum +=matrix[i][i];
    //     //sd
    //     if(i != matrix.length-1-i){
    //         sum +=matrix[i][matrix.length-i-1];
    // }
    //     }
        

    // return sum;
    
    
//}

//Search in Sorted Matrix
//brute force approach =>  go through complete matrix and search for key element
//case 3: Staircase search

//from top right

// public static boolean staircaseSearch(int matrix[][],int key){
//     int row =0;int col=matrix[0].length-1;
//     while(row<matrix.length && col>=0){
//         if(key==matrix[row][col]){
//             System.out.println("Key found at ("+row+","+col+")");
//             return true;
//         }
//         else if(key < matrix[row][col]){
//             col--;
//         }
//         else{
//             row++;
//         }
//     }
//     System.out.println("Key not found!");
//     return false;
// }

//H.W. from bottom left

// public static boolean staircaseSearch(int matrix[][],int key){
//     int row=matrix.length-1, col = 0;
//     while(row>=0 && col<matrix.length){
//         if(key==matrix[row][col]){
//             System.out.println("Key found at ("+row+","+col+")");
//             return true;
//         }
//         else if(key < matrix[row][col]){
//             row--;
//         }
//         else{
//             col++;
//         }
//     }
//     System.out.println("Key not found!");
//     return false;

// }

    
    public static void main(String args[]){
        // int matrix[][]= new int[3][3];
        // //input
        // Scanner sc = new Scanner(System.in);
        // int n = matrix.length;//no of rows
        // int m = matrix[0].length;//no of columns
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         matrix[i][j]= sc.nextInt();
        //     }
        // }
        // //output
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         System.out.print(matrix[i][j]+ " ");
        //     }
        //     System.out.println();
        // }
        // //search(matrix,4);
        // search(matrix);

        //spiral matrix

        // int matrix[][]={{1,2,3,4},
        //                 {5,6,7,8},
        //                 {9,10,11,12},
        //                 {13,14,15,16}};
        // printSpiral(matrix);

        //DIAGONAL SUM

        // int matrix[][]={
        //     {1,2,3},
        //     {5,6,7},
        //     {9,10,11}};
        //     System.out.println(diagonalsum(matrix));

        //search sorted matrix

        // int matrix[][]={{10,20,30,40},
        //             {15,25,35,45},
        //             {27,29,37,38},
        //             {32,33,39,50}};
        // int key =33;
        // staircaseSearch(matrix, key);
        
            
        }
    }

