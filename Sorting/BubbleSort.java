public class BubbleSort{
    public static void printArray(int arr[]){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+", ");
        }
        System.out.println();
    }
    public static void bubbleSort(int arr[]){
        boolean swapped=false;
        for(int i=0 ; i<arr.length-1 ;  i++){
            for(int j=0; j<arr.length-i-1 ; j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
        }
        if(!swapped){
            return;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,4,2,3,8,0,9};
        System.out.println("Unsorted array:-");
        printArray(arr);
        bubbleSort(arr);
        System.out.println("Sorted array:-");
        printArray(arr);
    }
}