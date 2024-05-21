public class InfiniteArraySearch {
    public static void main(String[] args) {
        int [] arr={3,4,5,9,90,99,123,345,567,789,799,800,899,909};
        int target = 799;
        System.out.println(solution(arr,target));
    }
    static int solution(int [] arr, int target){
        int start=0;
        int end = 1;
        while(target > arr[end]){
            int temp = end+1;
            end =  end + (end - start + 1)*2;
            start = temp;
        }
        return BinarySearch(arr, target, start, end);
    }

    static int BinarySearch(int [] arr,int target, int start , int end){
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid])
                end = mid - 1;
            else if(target > arr[mid])
                start = mid + 1;
            else
                return  mid;
        }
        return -1;
    }

}
