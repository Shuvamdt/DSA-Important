public class TransposeMatrix {
    public static void printArray(int arr[][]){
        for(int i=0 ; i<arr.length ; i++){
            for(int j=0 ; j<arr[0].length ; j++){
                System.out.print(arr[i][j]+" ,");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static int [][] transpose(int mat[][]){
        int trp[][]=new int[mat[0].length][mat.length];
        for(int i=0 ; i<mat.length; i++){
            for(int j=0 ; j<mat[0].length; j++){
                trp[j][i]=mat[i][j];
            }
        }
        return trp;
    }
    public static void main(String[] args) {
        int matrix[][]={{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}};
        System.out.println("Initial Matrix :-");
        printArray(matrix);
        int transpose[][]=transpose(matrix);
        System.out.println("Transpose Matrix :-");
        printArray(transpose);
    }
}
