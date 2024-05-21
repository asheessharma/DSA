import  java.util.*;
public class Rough {
    public static void main(String[] args) {
//        int [] arr = {1,2,3,4};int k = 2;
//        missingNumbers(arr,k);
//        int [] nums={0,4,3,0,4};
//        System.out.println(specialArray(nums));
//        System.out.println(xorOperation(4,3));
//        System.out.println(singleEle(new int []{1,1,2,2,3,3,4,4,8,8,9}));
//        int [] num={1,1,2,3,3,4,4,8,8};
//        System.out.println(singleNonDuplicate(num));
//        cyclic(num);


//        System.out.println(noofbits(10));
        permutation("","abc");
    }
//    static void missingNumbers(int [] arr,int k){
//        int [] missing=new int[k];
//        int index=0;
//        int j=0;
//        for(int i=1;i<= arr[arr.length-1];i++){
//            if(j<k){
//                if(arr[index]!=i){
//                    missing[j]=i;
//                    j++;
//                }
//                else{
//                    index++;
//                }
//            }
//
//        }
//        int last=arr[arr.length-1];
//        int count=1;
//        for(int temp=j;temp<k;temp++){
//            missing[temp]=last+count;
//            ++count;
//        }
//        System.out.println(Arrays.toString(missing));
//    }
//public static int specialArray(int[] nums) {
//    int n=nums.length;
//    int max=-1;
//
//    for(int i=1;i<=n;i++){
//        int count=0;
//        for(int j=0;j<n;j++){
//            if(nums[j]>=i){
//                count++;
//            }
//        }
//        if(count==i && count>max){
//            max = count;
//        }
//    }
//    return max;
//}
//public static  int xorOperation(int n, int start) {
//    //int [] arr=new int[n];
//    int sum=0;
//    for(int i=0;i<n;i++){
//        int temp=start+2*i;
//        sum=sum^temp;
//    }
//    return sum;
//}
//    public static  int singleEle(int [] arr) {
//
//        int sum=0;
//        for(int i=0;i<arr.length;i++){
//            sum=sum^arr[i];
//        }
//        return sum;
//    }
//    public static  void cyclic(int [] arr){
//        int n=arr.length;
//        for(int i=0;i<n;i++){
//            int index=arr[i]-1;
//            if(arr[index]!=arr[i]){
//                swap(arr,index,i);
//            }
//
//        }
//        printArray(arr);
//    }
//
//    private static void swap(int[] arr, int index, int i) {
//        int temp=arr[index];
//        arr[index]=arr[i];
//        arr[i]=temp;
//    }
//    private  static void printArray(int [] arr){
//        System.out.println(Arrays.toString(arr));
//    }
public static int singleNonDuplicate(int[] nums) {
    int left = 0;
    int right = nums.length - 1;

    while (left < right) {
        int mid = left + (right - left) / 2;


        if (mid % 2 == 1) {
            mid--;
        }


        if (nums[mid] == nums[mid + 1]) {
            left = mid + 2;
        } else {

            right = mid;
        }
    }

    return nums[left];
}
    private static int noofbits(int n){
        int counter=0;
        while(n!=0){
            if((n&1)==1){
                counter++;
            }
            n=n>>1;
        }
        return counter;
    }
    private static void permutation(String p, String up){
        if(up.length()==0){
            System.out.print(p+" ");
            return;
        }
        permutation(p+up.charAt(0),up.substring(1));
        permutation(p,up.substring(1));
    }


}
