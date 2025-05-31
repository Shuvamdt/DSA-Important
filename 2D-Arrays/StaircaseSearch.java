import java.util.Arrays;
import java.util.List;

public class StaircaseSearch {
    public static void main(String[] args) {
        int matrix[][]={{1,  2,  3,  4,  5 },
                        {6,  7,  8,  9,  10},
                        {11, 12, 13, 14, 15},
                        {16, 17, 18, 19, 20},
                        {21, 22, 23, 24, 25}};
        int key = 18;
        System.out.println("The key is at: "+staircaseSearch(matrix, key));
    }
    public static List<Integer> staircaseSearch(int mat[][], int key){
        int row=0, col=mat[0].length-1;
        while(row<mat.length && col >= 0){
            if(mat[row][col]==key){
                return Arrays.asList(row, col);
            }
            else if(mat[row][col] < key){
                row++;
            }else{
                col--;
            }
        }
        return Arrays.asList(-1, -1);
    }
}
