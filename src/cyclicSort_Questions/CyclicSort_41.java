package cyclicSort_Questions;

public class CyclicSort_41 {
    public static void main(String[] args) {
        int [] arr={7,8,9,11,12};
        System.out.println(hardSolution41(arr));
    }
    static int hardSolution41(int [] nums){
        int i=0;
        while(i< nums.length){
            int index = nums[i]-1;
            if(nums[i]>0 && nums[i]<=nums.length && nums[i]!=nums[index]){
                swap(nums,index,i);
            }
            else {
                i++;
            }
        }
        for(int j=0;j< nums.length;j++){
            if(nums[j]!=j+1){
                return j+1;
            }
        }
        return nums.length+1;
    }
    public static void swap(int [] arr,int first , int second){
        int temp= arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
