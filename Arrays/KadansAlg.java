public class KadansAlg {
    public static void main(String[] args) {
        int arr[]={-2, -3, 4, -1, -2, 1, 5, -3};
        int currSum=0;
        int maxSum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0 ; i<arr.length ; i++){
            currSum +=arr[i];
            if(currSum < 0 ){
                currSum=0;
            }
            max=Math.max(max, arr[i]);
            maxSum = Math.max(currSum, maxSum);
        }
        if(maxSum == 0 && max < 0){
            maxSum = max;
        }
        System.out.println("The max subarray sum : "+ maxSum);
    }
}
