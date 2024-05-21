package Recursion_Rough;

public class IsSorted {
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,15,6};
        System.out.println(function(arr,arr.length));
    }
    private static boolean function(int[] arr,int length){
        if(length==1 || length==0){
            return true;
        }

        return arr[length-1]>=arr[length-2] && function(arr,length-1);
    }

}
