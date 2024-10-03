package RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidMobileNumber {
    public static void isValidMobileNumber(String number){
        String regEx = "(\\+91)?[7-9]+[0-9]{9}";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(number);
        if(m.matches()){
            System.out.println("Valid number");
        }else{
            System.out.println("Number is InValid...");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your mobile number: ");
        String number = scanner.next();
        isValidMobileNumber(number);
    }

}
