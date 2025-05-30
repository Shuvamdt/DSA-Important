public class CountingSort {
    public static void printArray(int arr[]){
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i]+", ");
        }
        System.out.println();
    }
    public static int findMaximum(int arr[]){
        int maxVal=0;
        for(int i=0 ; i<arr.length ; i++){
            maxVal = Math.max(maxVal, arr[i]);
        }
        return maxVal;
    }
    public static void countingSort(int arr[]){
        int maxNum = findMaximum(arr);
        int freq[]=new int[maxNum+1];
        for(int i=0 ; i<arr.length ; i++){
            freq[arr[i]]++;
        }
        for(int i=0 , j=0; i<freq.length && j<arr.length ; i++){
            if(freq[i]!=0){
                while(freq[i]>0){
                    arr[j]=i;
                    j++;
                    freq[i]--;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,1,2,2,0,0,8,8,4,2,3,8,0,9};
        System.out.println("Unsorted array:-");
        printArray(arr);
        countingSort(arr);
        System.out.println("Sorted array:-");
        printArray(arr);
    }
}
