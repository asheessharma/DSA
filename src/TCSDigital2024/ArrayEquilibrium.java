package TCSDigital2024;

//The equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.
public class ArrayEquilibrium {
    public static void main(String[] args) {
        int [] arr = {-7, 1, 5, 2, -4, 3, 0};
        System.out.println(equilibriumIndex(arr));
    }
    private static int equilibriumIndex(int [] arr){
        int sum = 0 ;
        int i = 0;
        while(i < arr.length){
            sum += arr[i];
            if(sum == -1){
                return arr[i+1];
            }
            i++;
        }
        return -1;
    }

}
