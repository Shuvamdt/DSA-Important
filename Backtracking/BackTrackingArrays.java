public class BackTrackingArrays {
    public static void changeArray(int arr[], int idx, int val){
        if(idx == arr.length-1){
            return;
        }
        changeArray(arr, idx+1, val);
        arr[idx]-=val;
    }
    public static void printArray(int arr[]){
        for(int i=0 ; i<arr.length; i++){
            System.out.print(arr[i]+",");
        }
        System.err.println();
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        printArray(arr);
        changeArray(arr, 0, 2);
        printArray(arr);
    }
}
