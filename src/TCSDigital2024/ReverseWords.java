package TCSDigital2024;


import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        reverse(str);
    }
    private static void reverse(String str){
        String [] arr = str.split(" ");
        String [] result = new String[arr.length];
        int k = 0 ;
        for(String i : arr){
            int j = i.length()-1;
            StringBuilder temp = new StringBuilder();

            while(j>=0){
                temp.append(i.charAt(j));
                j--;
            }

            result[k++] = temp.toString();
        }
        for( String l : result){
            System.out.print( l + " ");
        }

    }

}
