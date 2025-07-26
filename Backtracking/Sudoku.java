public class Sudoku {
    public static boolean isSafe(int mat[][], int row, int col, int digit){
        for(int i=0; i<9; i++){
            if(mat[row][i] == digit){
                return false;
            }
        }
        for(int i=0; i<9; i++){
            if(mat[i][col] == digit){
                return false;
            }
        }
        int stRow = (row/3)*3;
        int stCol = (col/3)*3;
        for(int i=stRow ; i<stRow+3; i++){
            for(int j=stCol; j<stCol+3; j++){
                if(mat[i][j] == digit){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean sudokuSolver(int mat[][], int row, int col){
        if(row == 9){
            return true;
        }
        int newRow = row, newCol = col+1;
        if(newCol == 9){
            newRow = row+1;
            newCol = 0;
        }
        if(mat[row][col] != 0){
            return sudokuSolver(mat, newRow, newCol);
        }
        for(int i=1; i<=9 ; i++){
            if(isSafe(mat, row, col, i)){
                mat[row][col]=i;
                if(sudokuSolver(mat, newRow, newCol)){
                    return true;
                }
                mat[row][col] = 0;
            }
        }
        return false;
    }
    public static void printMatrix(int mat[][]){
        for(int i=0; i< mat.length ; i++){
            for(int j= 0; j<mat[0].length; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] sudoku = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
        if(sudokuSolver(sudoku, 0, 0)){
            System.out.println("Solution exists");
            printMatrix(sudoku);
        }else{
            System.out.println("Solution does not exists");
        }
    }
}
