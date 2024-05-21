import java.util.Arrays;

public class Sort012 {
    //bubble sort just takes too much time O(n^2)

    public static int[] sort(int [] arr,int m){
        for(int i=0;i<m;i++){
            for(int j=1;j<m-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        return arr;
    }
    //we'll use Dutch national flag algorithm, it takes three pointer low,mid,high and sort the array in a single pass
    //But this algo is specifically designed for these types of questions.
    //if mid ele is 0 it is swaped with low and both are incremented. iF mid is 1 then mid is incremented, if mid is 2 then it is swaped with high
    //and high is decremented.
    public static int[] dutchFlag(int [] arr,int n){
        int low=0;
        int mid=0;
        int high=n-1;
        while(mid<=high){
            switch (arr[mid]){
                case 0:
                    swap(arr,mid,low);
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(arr,mid,high);
                    high--;
                    break;
            }
        }
        return arr;
    }
    public static void swap(int [] arr, int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void main(String[] args) {
        int [] arr={1,1,1,0,2,0,2,0,2};
        int [] arr1={3,2,1,5,6,7,8};
        System.out.println(Arrays.toString(dutchFlag(arr,arr.length)));
    }
}
