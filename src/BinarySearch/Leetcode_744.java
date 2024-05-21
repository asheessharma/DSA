package BinarySearch;

public class Leetcode_744 {
    public static void main(String[] args) {
        char [] letters = {'x','x','y','y'};
        char target= 'z';
        System.out.println(BS(letters, target));
    }
    static char BS(char [] letters , char target){
        int start = 0;
        int end =  letters.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < letters[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}
