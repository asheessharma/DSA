import java.util.Scanner;
public class KthLargestSmallest {
    private static void KthLargest(int [] arr, int k){
        if(k>arr.length){
            System.out.println("Bhen Ke Lund Otat mai");
            return;
        }
        for(int i=0;i<arr.length-1;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            if(i==k-1){
                System.out.println(arr[i]);
                break;
            }
        }
    }
    private static void KthSmallest(int [] arr, int k){
        if(k>arr.length){
            System.out.println("Bhen Ke Lund Otat mai");
            return;
        }
        for(int i=0;i<arr.length-1;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            if(i==k-1){
                System.out.println(arr[i]);
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {1,9,2,8,3,7,4};
        System.out.print("Enter the value of K: ");
        int n = sc.nextInt();
        System.out.print("Largest: ");
        KthLargest(arr,n);

        System.out.print("Smallest: ");
        KthSmallest(arr,n);
    }

}
