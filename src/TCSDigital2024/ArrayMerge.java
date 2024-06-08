package TCSDigital2024;


import java.util.ArrayList;

public class ArrayMerge {
    public static void main(String[] args) {
        int [] arr1 = {2,1,4,3,7,4,0};
        int [] arr2 = {9,0,7,8,5,6};
        mergeArray(arr1,arr2);
    }
    private static void mergeArray(int [] arr1, int []arr2){
        ArrayList<Integer> list = new ArrayList<>();
        int i=0;
        int j=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                if(!list.contains(arr1[i])) {
                    list.add(arr1[i]);
                }
                i++;
            }
            else if(arr1[i]>arr2[j]){
                if(!list.contains(arr2[j])){
                    list.add(arr2[j]);
                }
                j++;

            }
            else{
                if(!list.contains(arr1[i])){
                    list.add(arr1[i]);
                }
                i++;
                j++;
            }
        }
        while(i < arr1.length){
            if(!list.contains(arr1[i])){
                list.add(arr1[i]);
            }
            i++;
        }
        while (j < arr2.length){
            if(!list.contains(arr2[j])){
                list.add(arr2[j]);
            }

            j++;
        }
        for(int k : list){
            System.out.print(k + " ");
        }
    }

}
