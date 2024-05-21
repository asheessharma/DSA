package Recursion_Rough;

public class RemoveDupli {
    public static void main(String[] args) {
        System.out.println(RemoveConsecutive("aaassshhhiissssh"));;
    }
    private static String filtered(String temp,String up){
        if(temp.equals("")){
            return up;
        }
        String ch=temp.charAt(0)+"";
        if(!up.contains(ch)){
            return filtered(temp.substring(1),up+ch);
        }
        else{
            return filtered(temp.substring(1),up);
        }
    }
    private static String RemoveConsecutive(String input){
        if(input.length()<=1){
            return input;
        }
        if(input.charAt(0)==input.charAt(1)){
            return RemoveConsecutive(input.substring(1));
        }
        else{
            return input.charAt(0)+RemoveConsecutive(input.substring(1));
        }
    }

}
