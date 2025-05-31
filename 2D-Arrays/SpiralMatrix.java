public class SpiralMatrix {
    public static void main(String[] args) {
        int matrix[][]={{1,  2,  3,  4,  5 },
                        {6,  7,  8,  9,  10},
                        {11, 12, 13, 14, 15},
                        {16, 17, 18, 19, 20},
                        {21, 22, 23, 24, 25}};
        printSpiralMatrix(matrix);
    }
    public static void printSpiralMatrix(int mat[][]){
        int stRow=0, stCol=0, endRow=mat.length-1, endCol=mat[0].length-1;
        while(stCol<=endCol && stRow <= endRow){
            for(int i=stCol ; i<=endCol; i++){
                System.out.print(mat[stRow][i]+" ");
            }
            stRow++;
            for(int i=stRow; i<=endRow; i++ ){
                System.out.print(mat[i][endCol]+" ");
            }
            endCol--;
            for(int i=endCol; i>=stCol; i--){
                System.out.print(mat[endRow][i]+" ");
            }
            endRow--;
            for(int i=endRow; i>=stRow; i--){
                System.out.print(mat[i][stCol]+" ");
            }
            stCol++;
        }
    }
}
