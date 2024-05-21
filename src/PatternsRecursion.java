public class PatternsRecursion {
    public static void main(String[] args) {
        Triangle(3,0);
    }
    static void inverseTriangle(int r,int c){
        if(r==0)
            return;
        if(c<r){
            System.out.print("* ");
            inverseTriangle(r,c+1);
        }else{
            System.out.println();
            inverseTriangle(r-1,0);
        }
    }
    static void Triangle(int r,int c){
        if(r==0)
            return;
        if(c<r){
            Triangle(r,c+1);
            System.out.print("*");
        }else{
            Triangle(r-1,0);
            System.out.println();
        }
    }

}
