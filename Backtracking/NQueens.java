public class NQueens {
    static int count =0;
    public static void printArray(char arr[][]){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean isSafe(char board[][], int row, int col){
        for(int i=row-1; i>=0; i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        for(int i=row-1, j=col-1; i>=0 && j>=0 ; i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        for(int i=row-1, j=col+1; i>=0 && j<board[0].length ; i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static boolean isPossibleNQueens(int n, char board[][], int row){
        if(row == n){
            return true;
        }
        for(int i=0; i<n ; i++){
            if(isSafe(board, row, i)){
                board[row][i]='Q';
                if(isPossibleNQueens(n, board, row+1)){
                    return true;
                }
                board[row][i]='X';
            }
        }
        return false;
    }
    public static void nQueens(int n, char board[][], int row){
        if(row == n){
            printArray(board);
            count++;
            System.out.println();
            return;
        }
        for(int i=0; i<n ; i++){
            if(isSafe(board, row, i)){
                board[row][i]='Q';
                nQueens(n, board, row+1);
                board[row][i]='X';
            }
        }
    }
    public static void main(String[] args) {
        int n = 5;
        char board[][]=new char[n][n];
        for(int i=0; i<n ; i++){
            for(int j=0; j<n; j++){
                board[i][j]='X';
            }
        }
        if(isPossibleNQueens(n, board, 0)){
            System.out.println("Solution is possible!");
        }else{
            System.out.println("Solution is not possible!");
        }
        nQueens(n, board, 0);
        System.out.println("The no of ways to place n queens:"+count);
    }
}
