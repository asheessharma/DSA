package Recursion_Rough;

public class StringSubSets {
    public static void main(String[] args) {
        PrintKaro("ashi","");
    }
    private static void PrintKaro(String str,String p){
        if(str.isEmpty()){
            System.out.println(p);
            return;

        }
        char ch = str.charAt(0);

        PrintKaro(str.substring(1),p);
        PrintKaro(str.substring(1),p+ch);
    }
}
