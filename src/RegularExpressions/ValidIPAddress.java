package RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidIPAddress {
    public static void isValidIPAddress(String ip){
        String regEx = "^((25[0-5]|2[0-4][0-9]|[0-1]?[0-9]?[0-9])\\.){3}(25[0-5]|2[0-4][0-9]|[0-1]?[0-9]?[0-9])$";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(ip);
        if(m.matches()){
            System.out.println("Valid IP");
        }else{
            System.out.println("Invalid IP");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the IP address: ");
        String ip = sc.nextLine();
        isValidIPAddress(ip);
    }

}
