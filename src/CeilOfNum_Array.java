public class CeilOfNum_Array {
    public static void main(String[] args) {
        int [] arr= {2,3,5,9,14,16,17,18};
        int target= 15;
        System.out.println("Ceil of Num: "+CeilNum(arr, target));
        System.out.println("Floor of Target : "+floorNum(arr, target));

    }
    //return the smallest element that is greater or equal to the target
    static int CeilNum(int [] arr, int target){
        if(target > arr[arr.length-1])
            return -1;
        int start=0;
         int end= arr.length-1;
         while(start <= end){
             int mid= start + (end - start) / 2;
             if(target > arr[mid]){
                 start = mid + 1 ;
             }
             else if(target < arr[mid])
                 end =  mid - 1 ;
             else
                 return mid;
         }
         return start;
    }
    // return the greatest element that is smallest or equal to the target number
    static int floorNum(int [] arr , int target){
        if(target < arr[0])
            return -1;
        int start=0;
        int end= arr.length-1;
        while(start <= end){
            int mid= start + (end - start) / 2;
            if(target > arr[mid]){
                start = mid + 1 ;
            }
            else if(target < arr[mid])
                end =  mid - 1 ;
            else
                return mid;
        }
        return end;
    }

}
