import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

class NotEligible extends RuntimeException{
    NotEligible(String msg){
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

    }

}
