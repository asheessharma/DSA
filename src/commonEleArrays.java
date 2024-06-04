import java.util.HashSet;

public class commonEleArrays {
    public static void main(String[] args) {
        int [] arr1 = {2,1,6,5,3,9,8,2};
        int [] arr2 = {6,1,2,4,3,0,2,9,7};
        findCommon(arr1,arr2);
    }
    private static void findCommon(int [] a , int [] b){
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        for(int i: a){
            hs1.add(i);
        }
        for(int j: b){
            hs2.add(j);
        }
        for(int k : hs1){
            boolean bool = hs2.add(k);
            if(!bool){
                System.out.print(k +" ");
            }

        }
    }

}
