public class TrappingRainwater {
    public static void main(String[] args) {
        int arr[]={4, 2, 0, 6, 3, 2, 5};
        int leftMax[]= new int[arr.length];
        int rightMax[]= new int[arr.length];
        int trappedWater = 0, width = 1;
        leftMax[0]=arr[0];
        rightMax[arr.length-1]=arr[arr.length-1];
        for(int i=1; i<arr.length ; i++){
            leftMax[i]= leftMax[i-1] > arr[i] ? leftMax[i-1] : arr[i];
        }
        for(int j=arr.length-2 ; j>=0 ; j--){
            rightMax[j]= rightMax[j+1] > arr[j] ? rightMax[j+1] : arr[j];
        }
        for(int i=0 ; i<arr.length ; i++){
            int height = Math.min(leftMax[i], rightMax[i])-arr[i];
            if(height > 0 ){
                trappedWater+= height*width;
            }
        }
        System.out.println("Trapped rain water = "+ trappedWater);
    }
}
