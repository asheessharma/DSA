import  java.util.*;

public class Linear_Search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       // int target=sc.nextInt();
        String str= sc.next();
        char target_str= sc.next().trim().charAt(0);
        int [] arr={3,1,2,4,5,9,8};
        int [][] arr1={
                {1,2,3,4},
                {5,6,7},
                {11,12,34,56,90}
        };
        // System.out.println(Arrays.toString(Search_2D(target, arr1)));
        //System.out.println(linear(target, arr));
        System.out.println(search_Char(str,target_str));
    }
    static int linear( int target,int [] arr){
        if(arr.length==0){
            return -1;
        }
        for(int i=0 ;i < arr.length ;i++){
           if(arr[i]== target){
               return  i;
           }
        }
        return -1;
    }
    static int[] Search_2D(int target , int [][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1,-1};
    }

    static boolean search_Char(String str, char target){
        if(str.length()==0){
            return false;
        }
        for(char ch : str.toCharArray()){
            if( ch== target){
                return true;
            }
        }
        return  false;
    }

    


    }
