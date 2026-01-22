public class Backtracking {

    public static void changeArr(int arr[],int i,int val){
        //base case
        if(i==arr.length){
            printArr(arr);
            return;
        }
        //recursion
        arr[i]=val;
        changeArr(arr, i+1, val+1); //fxn call step
        arr[i]=arr[i]-2; // backtracking step
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
             
        }
        System.out.println();
    }

    //find subsets

    public static void findSubsets(String str,String ans, int i){
        //base case 
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
            return;
        }

        //Yes choice 
        findSubsets(str, ans+str.charAt(i), i+1);

        //No choice
        findSubsets(str, ans, i+1);
    }

    //find permutations

    public static void findpermutation(String str,String ans){
        //base case
        if(str.length()==0){
            System.out.println(ans);
            return;
        }

        //recursion - 0(n*n!)
        for(int i=0;i<str.length();i++){
            char curr = str.charAt(i);
            String Newstr =str.substring(0, i)+ str.substring(i+1);
            findpermutation(Newstr,ans+curr);
        }
    }

    //Grid ways
    public static int gridways(int i,int j,int n,int m){ //O(2^m+n)
        if(i==n-1 && j==m-1){//base case
            return 1;
        }
        else if(i==n || j==m){ // boundary case condn
            return 0;
        }
        int w1 = gridways(i+1, j, n,m);
        int w2= gridways(i, j+1, n,m);
        return w1+w2;
    }

    //grid ways math trick for linear time

    //Sudoko(yes or no )(one solution)

    public static boolean isSafe(int sudoko[][],int row,int col,int digit){
        //column
        for(int i=0;i<=8;i++){
            if(sudoko[i][col]==digit){
                return false;
            }
        }
        //row
        for(int j=0;j<=8;j++){
            if(sudoko[row][j]==digit){
                return false;
            }
        }
        //grid
        int sr =(row/3)*3;
        int sc = (col/3)*3;
        //3x3grid
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(sudoko[i][j]==digit){
                    return false;
                }
            }
        }
        return true;

    }
    public static boolean sudokoSolver(int sudoko[][],int row,int col){
        //base case
        if(row==9  && col==0){
            return true;
        }
        //recursion
        int nextRow=row,nextCol=col+1;
        if(col+1==9){
            nextRow=row+1;
            nextCol=0;
        }
        if(sudoko[row][col]!=0){
            return sudokoSolver(sudoko, nextRow, nextCol);
        }

        for(int digit=1;digit<=9;digit++){
           if(isSafe(sudoko,row,col,digit)){
            sudoko[row][col]=digit;
            if(sudokoSolver(sudoko, nextRow, nextCol)){
                return true;
            }
            sudoko[row][col]=0;
           }
        }
        return false;
    }

public static void printSudoko(int sudoko[][]){
    for(int i=0;i<9;i++){
        for(int j=0;j<9;j++){
            System.out.print(sudoko[i][j]+" ");
        }
        System.out.println();
    }
}
    public static void main(String args[]){
          //int arr[]=new int[5];
          //changeArr(arr, 0, 1);
          //printArr(arr);
          //String str = "abc";
        //   findSubsets(str, "", 0);
        //findpermutation(str, "");

        // int n=3,m=3;
        // System.out.println(gridways(0, 0, n, m));

        int sudoko[][]={
            {0,0,8,0,0,0,0,0,0},
            {4,9,0,1,5,7,0,0,2},
            {0,0,3,0,0,4,1,9,0},
            {1,8,5,0,6,0,0,2,0},
            {0,0,0,0,2,0,0,6,0},
            {9,6,0,4,0,5,3,0,0},
            {0,3,0,0,7,2,0,0,4},
            {0,4,9,0,3,0,0,5,7},
            {8,2,7,0,0,9,0,1,3}
        };

        if(sudokoSolver(sudoko, 0, 0)){
            System.out.println("Solution exist");
            printSudoko(sudoko);
        }else{
            System.out.println("Solution doesn't exist");
        }
    }
}
