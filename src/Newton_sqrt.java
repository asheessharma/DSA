public class Newton_sqrt {
    public static void main(String[] args) {
        System.out.println((int)mySqrt(8));
    }
    public static double mySqrt(double num) {
        double guess=num;
        double root;
        while(true){
            root=(0.5* (guess+(num/guess)));
            if(Math.abs(root-guess)<1){
                break;
            }
            guess=root;
        }
        return root;
    }

}
