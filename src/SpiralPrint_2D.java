public class SpiralPrint_2D {
    public static void main(String[] args) {
        int [][] arr={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        int top=0;
        int down=arr.length-1;
        int left=0;
        int right=arr[0].length-1;
        int dir=0;
        while(top<=down && left<=right){
            if(dir==0){
                for(int i=left;i<=right;i++){
                    System.out.print(arr[top][i]+" ");
                }
                top++;
            }
            else if(dir==1){
                for(int j=top;j<=down;j++){
                    System.out.print(arr[j][right]+" ");
                }
                right--;
            }
            else if(dir==2){
                for(int k=right;k>=left;k--){
                    System.out.print(arr[down][k]+" ");
                }
                down--;
            }
            else if(dir==3){
                for(int l=down;l>=top;l--){
                    System.out.print(arr[l][left]+" ");
                }
                left++;
            }
            dir++;
            dir=dir%4;
        }
    }
}
