import java.util.*;
//import  java.util.Collection;
public class Accenture {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        String str="ashishsharma";
//        String str=sc.nextLine();
//        int n=str.length();
//        System.out.println(frequentVowel(str,n));
        int [] arr={1,2,3,4,5,6,6,7,8,9};
        System.out.println(findSum(arr,arr.length));
    }
    private  static char frequentVowel(String str,int n){
        char [] arr=str.toCharArray();
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        for(char ch: arr){
            if(ch=='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                if(!map.containsKey(ch)){
                    map.put(ch,1);
                }
                else{
                    int count = map.get(ch);
                    map.put(ch,count+1);
                }
            }
        }
        char c = 0;
        int max = Collections.max(map.values());
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue() == max){
                c= entry.getKey();
            }
        }
        return c;
    }
    private static int findSum(int [] arr,int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(isPrime(i)){
                sum+=arr[i];
            }
        }
        return sum;
    }
    private static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c=2;
        while(c*c<=n){
            if(n%c==0) return false;
            c++;
        }
        return true;
    }
}
