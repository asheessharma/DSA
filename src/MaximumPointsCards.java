public class MaximumPointsCards {
    public static void main(String[] args) {
        int [] arr = {6,2,3,4,7,2,1,7,1};
        usingTwoPointers(arr,4);
    }
    private static void usingTwoPointers(int [] arr, int k){
        int leftSum = 0;
        int rightSum = 0;
        int maxSum = 0;
        for(int i = 0 ; i <= k-1 ; i++){
            leftSum+=arr[i];
        }
        maxSum = leftSum;
        int rightIndex = arr.length - 1;
        for(int j = k-1 ; j >= 0 ; j--){
            leftSum-=arr[j];
            rightSum+=arr[rightIndex--];

            maxSum = Math.max(maxSum,leftSum+rightSum);
        }
        System.out.println("The maximum sum : " + maxSum);
    }
}
