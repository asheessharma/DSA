package SortingAlgoes;

// NO of iterations to sort an array using bubble sort is n-1 ;
//Best case O(n) when array is already sorted
//Average = worst = O(n^2);
/*compareTo [return < 0 , First is smaller ]
            [return > 0 , First is greater]
            [ return ==0 , Both are equal ]
 */
//*********************************************************************************************************************************
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
