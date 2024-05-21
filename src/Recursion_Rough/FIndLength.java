package Recursion_Rough;

public class FIndLength {
    public static void main(String[] args) {
        System.out.println(length("",0));
    }
    private static int length(String str,int length){
        if(str.length()==0 ){
            return length;
        }
        return length(str.substring(1),length+1);
    }

}
