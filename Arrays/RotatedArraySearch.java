public class RotatedArraySearch {
    public static void main(String[] args) {
        int arr[]={4, 5, 6, 7, 0, 1, 2};
        int key = 0;
        int pivot = minSearch(arr);
        int idx=-1;
        if(arr[pivot] <= key && arr[arr.length-1] >= key){
            idx = binarySearch(arr, key, pivot, arr.length-1);
        }else{
            idx = binarySearch(arr, key, 0, pivot);
        }
        System.err.println("The key is at : "+ idx);
    }
    public static int minSearch(int arr[]){
        int st=0, end=arr.length-1;
        while(st<end){
            int mid = st+(end-st)/2;
            if(mid > 0 && arr[mid-1] > arr[mid]){
                return mid;
            }else if(arr[st] <= arr[mid] && arr[st] > arr[end]){
                st = mid+1;
            }else{
                end = mid-1;
            }
        }
        return st;
    }
    public static int binarySearch(int arr[], int key, int st, int end){
        while(st<=end){
            int mid = st+(end-st)/2;
            if(arr[mid] == key){
                return mid;
            }else if(arr[mid] > key){
                end = mid-1;
            }else{
                st = mid+1 ;
            }
        }
        return -1;
    }
}
