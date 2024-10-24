import org.w3c.dom.ls.LSOutput;
// Throw keyword is used to throw custom exception.It's a good practice to throw only unchecked exception.
// It creates an object[exception,description,stack trace] and manually passes it to JVM. JVM handles it like any other predefined function.
// It will abnormally terminate the program, if you don't handle the exception using try catch block.
import java.util.Scanner;

class NotEligible extends RuntimeException{
   public NotEligible(String msg){
        super(msg);
    }
}
public class ExceptionBrushUp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age= sc.nextInt();
        try{
            if(age<18){
                throw new NotEligible("You are not eligible to vote! ");
            }
            else{
                System.out.println("You can vote ....");
            }
        }
        catch (NotEligible e){
            System.out.println("Wait till you turn 18 :)");
        }
        finally {
            System.out.println("****** Now Fuck off *******");
        }

    }

}
