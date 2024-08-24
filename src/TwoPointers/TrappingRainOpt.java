package TwoPointers;

public class TrappingRainOpt {
    private static void UsingTwoPointers(int [] arr){
        int n = arr.length;
        int leftMax = 0, rightMax = 0, l = 0, r = n-1;
        int total = 0;
        while (l < r){
            if(arr[l] <=  arr[r]){
                if(arr[l] < leftMax){
                    total += leftMax - arr[l];
                }else{
                    leftMax = arr[l];
                }
                l++;
            }
            else{
                if(arr[r] < rightMax){
                    total += rightMax - arr[r];
                }else{
                    rightMax = arr[r];
                }
                r--;
            }
        }
        System.out.println("Total trapped water : " + total);
    }

    public static void main(String[] args) {
        UsingTwoPointers(new int []{1,0,2,1,3});
    }

}
