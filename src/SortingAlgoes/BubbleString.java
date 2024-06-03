package SortingAlgoes;
// NO of rounds to sort an array using bubble sort is n-1 ;
public class BubbleString {
    public static void main(String[] args) {
        String [] arr= {"ashish","john","arya","ned","mountain"};
        sortStrings(arr);
    }
    private static void sortStrings(String [] arr){
        String temp;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j< arr.length-1-i;j++){
                if(arr[j].compareTo(arr[j+1])>0){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(String i:arr){
            System.out.print(i + " ");
        }
    }
}
