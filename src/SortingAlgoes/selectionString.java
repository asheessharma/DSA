package SortingAlgoes;
//best = average = worst = O(n^2);
//find the minimum and swap it with ith index;
public class selectionString {
    public static void main(String[] args) {
        String [] arr= {"robb","john","arya","ned","mountain"};
        stringSort(arr);
    }
    private static void stringSort(String[] arr){
        int min;
        String temp;
        for(int i=0;i< arr.length;i++){
            min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j].compareToIgnoreCase(arr[min])<0){
                    min=j;
                }
            }
            temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        for(String i : arr){
            System.out.print(i + " < ");
        }
    }
}
