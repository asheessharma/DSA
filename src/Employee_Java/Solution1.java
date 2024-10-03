package Employee_Java;
import java.util.*;
public class Solution1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String value = sc.nextLine();
        int lower = 0;
        for(int i=0; i < value.length();i++){
            if(value.charAt(i) >= 'a' && value.charAt(i)<='z'){
                lower++;
            }
        }
        if(lower>0){
            System.out.println(lower);
        }
        else{
            System.out.println("No lower case characters present");
        }
    }

}
