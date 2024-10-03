package RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email_validation {
    public static boolean isValid(String email){
        String regExp = "[a-zA-Z 0-9._-]+@[a-zA-Z]+([.][a-zA-Z]{2,6}+)+";
        Pattern p = Pattern.compile(regExp);
        Matcher m = p.matcher(email);
        return m.matches();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Email Address: ");
        String email = sc.next();
        if(isValid(email)){
            System.out.println("Valid Email Address..");
        }else{
            System.out.println("Try again..");
        }
    }
}
