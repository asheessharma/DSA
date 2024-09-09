public class SubStringsRecursion {
    //subsets method works when you need to take one and ignore other
    public static void main(String[] args) {
       // subStrWithoutA("","abcabacb");
       // removeSubStr("","gla","universityglamathura");
//        subsets("","abc");
        permutations("","ash");
    } 
    static void subStrWithoutA(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        if(ch=='a'){
            subStrWithoutA(p,up.substring(1));
        }
        else{
            subStrWithoutA(ch+p,up.substring(1));
        }
    }
    static void removeSubStr(String p,String sub,String str){
        if(str.isEmpty()){
            System.out.println(p);
            return;
        }
        if(str.startsWith(sub)){
            removeSubStr(p,sub,str.substring(sub.length()));
        }
        else{
            removeSubStr(p+str.charAt(0),sub,str.substring(1));
        }
    }
    static void subsets(String curr,String str){
        if(str.isEmpty()){
            System.out.println(curr);
            return;
        }
        subsets(curr,str.substring(1));
        subsets(curr+str.charAt(0),str.substring(1));
    }

    static void permutations(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String first=p.substring(0,i);
            String second=p.substring(i,p.length());
            permutations(first+ch+second,up.substring(1));
        }
    }

}
