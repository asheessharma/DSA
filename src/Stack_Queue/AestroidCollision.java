package Stack_Queue;
import java.util.Arrays;
import java.util.Stack;

public class AestroidCollision {
    public static int[]  collision(int[] arr){
        Stack<Integer> stack = new Stack<>();
        for (int j : arr) {
            if (j > 0) {
                stack.push(j);
            } else {
                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(j)) {
                    stack.pop();
                }
                if (!stack.isEmpty() && stack.peek() == Math.abs(j)) {
                    stack.pop();
                } else if (stack.isEmpty() || stack.peek() < 0) {
                    stack.push(j);
                }
            }

        }
        int [] result = new int[stack.size()];
        int n = result.length - 1 ;

        while(!stack.isEmpty()){

            result[n--]=stack.pop();
        }

        return result ;
    }
    public static void main(String[] args) {
        int [] arr = {4,7,1,1,2,-3,-7,17,15,-16};
        System.out.println(Arrays.toString(collision(arr)));

    }
}
