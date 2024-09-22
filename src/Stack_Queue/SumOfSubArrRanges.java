package Stack_Queue;

import java.util.Stack;
// Need to return sum of difference of max and smallest element in each sub Array. => sum += subArr[max] - subArr[min]

public class SumOfSubArrRanges {
    private static int[] nextGreater(int [] arr){
        int n = arr.length;
        int [] nge = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i = n-1 ; i >= 0 ;i--){
            while(!stack.empty() && arr[stack.peek()] <= arr[i] ){
                stack.pop();
            }
            nge[i] = stack.empty() ? n : stack.peek();
            stack.push(i);
        }
        return nge;
    }
    private static int[] previousGreater(int [] arr){
        int n = arr.length;
        int [] pge = new int[n];
        Stack<Integer> s = new Stack<>();
        for(int i = 0; i < n ; i++){
            while(!s.empty() && arr[s.peek()] < arr[i]){
                s.pop();
            }
            pge[i] = s.empty() ? -1 : s.peek();
            s.push(i);
        }
        return pge;

    }
    public static int solution(int [] arr){
        SumOfSubArrMin obj = new SumOfSubArrMin();
        int sum1 = obj.sumSubarrayMins(arr);
        int sum = 0;
        int [] nextGreaterArr = nextGreater(arr);
        int [] previousGreaterArr = previousGreater(arr);
        for(int i = 0; i < arr.length ; i++){
            sum += nextGreaterArr[i];
        }
        for(int i = 0; i < arr.length ; i++){
            sum1 +=  previousGreaterArr[i];
        }
        return sum > sum1 ? (sum - sum1) : (sum1 - sum);
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3};
        System.out.println(solution(arr));
    }

}
