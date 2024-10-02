package RegularExpressions;
import java.util.regex.*;
public class PatternClass {
    public static void main(String[] args) {
        int count = 0;
        Pattern p = Pattern.compile("[^ac]");
        Matcher  m = p.matcher("ababbababb");
        while(m.find()){
            count++;
            System.out.println(m.start() +"...." + m.group());
        }
        System.out.println("No of occurrences: "+count);
    }
}
