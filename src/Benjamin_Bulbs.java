
import java.util.Scanner;

public class Benjamin_Bulbs {
    private static void solution_benjamin( int n){

        for(int i=1 ;i*i <= n ; i++){
            System.out.println( i*i );
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solution_benjamin(n);
    }
}
