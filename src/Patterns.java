import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StringBuilder str= new StringBuilder();
        String sample = scanner.next();
        str.append(sample);

      //  System.out.println(str.append(sample,0,sample.length()));
       // System.out.println(str.compareTo(new StringBuilder(sample)));
      //  System.out.println(str.replace(5,9,"donot"));
        StringBuilder str1=new StringBuilder(str);
      //  System.out.println(str.isEmpty());
        System.out.println(str1);
        System.out.println(str);
        System.out.println(str.lastIndexOf("a"));
        System.out.println(str==str1.reverse());
       // System.out.println(str);

    }
}
