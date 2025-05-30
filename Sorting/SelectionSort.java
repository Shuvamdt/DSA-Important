public class SelectionSort {
    public static void printArray(int arr[]){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+", ");
        }
        System.out.println();
    }
    public static void selectionSort(int arr[]){
        for(int i=0 ; i<arr.length-1 ; i++){
            int minIdx= i;
            for(int j=i+1; j<arr.length ; j++){
                if(arr[j]<arr[minIdx]){
                    minIdx = j;
                }
            }
            if(minIdx != i){
                int temp=arr[i];
                arr[i]=arr[minIdx];
                arr[minIdx]=temp;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,4,2,3,8,0,9};
        System.out.println("Unsorted array:-");
        printArray(arr);
        selectionSort(arr);
        System.out.println("Sorted array:-");
        printArray(arr);
    }
}
