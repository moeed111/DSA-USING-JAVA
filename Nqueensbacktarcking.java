public class Nqueensbacktarcking {
    public static void printBoard(char board[][]){
        System.out.println("-------------chess------------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(char board[][],int row,int col){
        //vertical up
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //diag right up
        for(int i=row-1,j=col-1;i>=0&& j>=0;i--,j--){
            if(board[i][j]=='Q')
                return false;
        }
        //     for(int i=row-1;i>=0;i--){
        //     for(int j=col-1;j>=0;j--){
        //         if(board[i][j]=='Q')
        //         return false;
        //     }
        // }

        //diag left up
        for(int i=row-1,j=col+1;i>=0&& j<board.length;i--,j++){
            if(board[i][j]=='Q')
                return false;
        }
        //  for(int i=row-1;i>=0;i--){
        //     for(int j=col+1;j<board.length;j++){
        //         if(board[i][j]=='Q')
        //         return false;
        //     }
        // }
        return true;

    }
    // public static void nQueens(char board[][],int row){
    //     //base
    //     if(row==board.length){
    //         //printBoard(board);
    //         count++;
    //         return;
    //     }
    //     //column loop
    //     for(int j=0;j<board.length;j++){
    //         if(isSafe(board,row,j)){
    //         board[row][j]='Q';
    //         nQueens(board, row+1);//fxn call
    //         board[row][j]='x';//backtracking step
    //         }
            
    //     }
    // }

    //for one solution 
    public static boolean nQueens(char board[][],int row){
        //base
        if(row==board.length){
            //printBoard(board);
            count++;
            return true;
        }
        //column loop
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
            board[row][j]='Q';
            if(nQueens(board, row+1)){
                return true;
            }
                //fxn call
            board[row][j]='x';//backtracking step
            }
            
        }
        return false;
    }
    

    static int count =0;
    public static void main(String args[]){
        int N=4;
        char board[][]= new char[N][N];
        //initialization
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                board[i][j]='x';
            }
        }
        if(nQueens(board,0)){
            System.out.println("Solution is possible");
            printBoard(board);
        }else{
            System.out.println("Solution is not possible");
        }
        //System.out.println("Total ways to solve n queens = "+count);
    }
}
