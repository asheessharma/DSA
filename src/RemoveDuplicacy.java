import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicacy {
    public static void main(String[] args) {
        int [] arr1 = {1,1,2,3,3,4,5,5};
        int [] arr2 = {2,1,4,1,3,2,3,4};
        removeDuplicate(arr2);
        System.out.println();
        removeDuplicate2(arr1);
    }
    private static void removeDuplicate(int [] arr){
        HashSet<Integer> hs = new HashSet<>();
        for(int i: arr){
            hs.add(i);
        }
        for(int j:hs){
            System.out.print(j +" ");
        }
    }
    private static void removeDuplicate2(int [] arr){
        ArrayList<Integer> list= new ArrayList<>();
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                list.add(arr[i]);
            }
        }
        list.add(arr[arr.length-1]);
        for(int j : list){
            System.out.print(j + " ");
        }
    }
}
