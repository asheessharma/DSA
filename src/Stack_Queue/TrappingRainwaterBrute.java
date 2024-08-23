package Stack_Queue;

public class TrappingRainwaterBrute {
    private static void UsingLoops(int [] arr){
        int len = arr.length;
        int [] leftMax = new int[len];
        int [] rightMax = new int[len];
        leftMax[0]=arr[0];
        for(int i = 1; i < len ; i++){
            leftMax[i] = Math.max(leftMax[i-1],arr[i]);
        }
        rightMax[len - 1] = arr[len - 1];
        for(int i = len - 2; i >= 0 ; i--){
            rightMax[i] = Math.max(rightMax[i+1],arr[i]);
        }
        int total = 0;
        for(int i = 0; i < len ; i++){
            int left = leftMax[i];
            int right = rightMax[i];
            if(arr[i] < left && arr[i] < right){
                total += Math.min(left,right) - arr[i];
            }
        }
        System.out.println("Total "+total+" units water trapped !!");
    }

    public static void main(String[] args) {
        UsingLoops(new int[]{1,0,2});
    }
}
