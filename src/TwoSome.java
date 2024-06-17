import java.util.Arrays;
import java.util.HashMap;

public class TwoSome {
    public static void main(String[] args) {
        int [] arr = {2,9,1,7,4,6,5};
        System.out.println(Arrays.toString(usingNestedLoops(arr,8)));
        System.out.println(Arrays.toString(usingHashMaps(arr,10)));
        usingTwoPointer(arr,15);

    }
    private static int[] usingNestedLoops(int [] arr,int target){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]+arr[i] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

    private static void usingTwoPointer(int [] arr,int target){
        Arrays.sort(arr);
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            if(arr[i]+arr[j] < target){
                i++;
            }
            else if(arr[i]+arr[j]>target){
                j--;
            }
            else{
                System.out.println("["+i+", "+j +"]");
                break;
            }
        }
    }

    private static int[]  usingHashMaps(int [] arr, int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(target-arr[i])){
                return new int[]{i,map.get(target - arr[i])};

            }
            map.put(arr[i],i);
        }
        return new int[]{-1,-1};
    }

}
