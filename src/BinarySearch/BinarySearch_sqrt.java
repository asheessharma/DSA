package BinarySearch;

public class BinarySearch_sqrt {
    public static void main(String[] args) {
        System.out.printf("%.3f",sqrt_BS(36,3));
    }
    static double sqrt_BS(int n,int p){
        int start=0;
        int end=n;
        double root=0.0;
        //agar proper root hai to ye kam krega otherwise doosra wala krega
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid*mid==n){
                return mid;
            }
            else if(mid*mid < n){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        double increment=0.1;
        for(int i=0;i<p;i++){
            while (root*root<=n){
                root+=increment;
            }
            root-=increment;
            increment/=10;
        }
        return root;
    }

}
