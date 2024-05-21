// it is a approach to find max sub-array sum in  array ,assume first number a max then add every other element and check max between them and store
// maximum and then check greatest between previous and current maximum
// Time complexity is O(n)
public class KadaneMaxSubArray {
    public static void main(String[] args) {
        int [] arr={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(subArray(arr));
    }
    static int subArray(int [] arr){
        int maximum=arr[0];
        int maxTillNow=arr[0];
        for (int i = 1; i < arr.length ; i++) {
            maximum=Math.max(arr[i],maximum+arr[i]);
            maxTillNow=Math.max(maxTillNow,maximum);
        }
        return maxTillNow;
    }

}
