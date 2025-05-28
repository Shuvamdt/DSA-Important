public class PrefixSum{
    public static void main(String[] args) {
        int arr[]={-2, -3, 4, -1, -2, 1, 5, -3};
        int prefix[]= new int[arr.length];
        int maxSum = Integer.MIN_VALUE;
        prefix[0]=arr[0];
        for(int i=1 ; i<arr.length ; i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=0 ; i<arr.length ; i++){
            int start = i;
            for(int j=i+1; j<arr.length ; j++){
                int end = j;
                int sum= start == 0 ? prefix[start] : prefix[end]-prefix[start-1];
                maxSum=Math.max(maxSum, sum);
            }
        }
        System.out.println("The max subarray sum : "+ maxSum);
    }
}