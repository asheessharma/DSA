package cyclicSort_Questions;

public interface CyclicSort_287 {
    public static void main(String[] args) {
        int [] number = {3,1,3,4,2};
        System.out.println(findDuplicate(number));
    }
    public static int findDuplicate(int[] nums) {
        int i=0;
        while(i < nums.length){
            int index= nums[i]-1;
            if(nums[index]!=nums[i]){
                swap(nums,index,i);
            }
            else{
                i++;
            }
        }
        for(int j=0;j< nums.length;j++){
            if(nums[j]!= j+1){
                return nums[j];
            }
        }
        return -1;

    }
    public static  void swap(int [] arr, int first , int second){
        int temp= arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
