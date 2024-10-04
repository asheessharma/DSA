package RegularExpressions;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordChecker {
    public static boolean isStrongPassword(String pass){
        String regEx= "(?=.*[a-z])(?=.*[A-z])(?=.*[0-9])(?=.*[!@#$%&])?.{8,}";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(pass);
        return m.matches();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the password: ");
        String pass = sc.nextLine();
        if(isStrongPassword(pass)){
            System.out.println("Password is Valid");
        }else{
            System.out.println("Choose Another Password");
        }
    }

}
