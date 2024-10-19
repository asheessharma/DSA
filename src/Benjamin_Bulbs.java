import java.util.Arrays;
import java.util.Scanner;

public class Benjamin_Bulbs {
    private static int[] solution_benjamin(int [] arr1, int n){
        for(int i=2; i <= n ; i++){
            for(int j = i; j <= n ; j++){
                if(j % i == 0){
                    if(arr1[j-1]==0){
                        arr1[j-1]=1;
                    }else{
                        arr1[j-1] = 0;
                    }
                }
            }//Running this would tell that only perfect square till that number be on reset will be off.
        }
        return arr1;
    }
    private static void optimised(int n){
        for(int i = 1 ; i*i <= n ;i++){
            System.out.println(i*i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int [] bulbs = new int[n];
//        Arrays.fill(bulbs,1);
//        System.out.println(Arrays.toString(solution_benjamin(bulbs,n)) );
        optimised(n);
    }
}
