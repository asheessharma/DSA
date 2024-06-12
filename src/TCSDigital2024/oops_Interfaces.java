package TCSDigital2024;

interface Shyamo{
   abstract void display();
   public void display1();

}
interface I2{
    void test();
}
public class oops_Interfaces implements Shyamo,I2 {
   public void display(){
        System.out.println("overriding abstract method displayed in interface");
    }
    public void display1(){
        System.out.println("public method inside interface");
    }
    public void test(){
        System.out.println("Multiple inheritance");
    }
    public static void main(String[] args) {
        oops_Interfaces obj1  =   new oops_Interfaces();
        obj1.display();
        obj1.display1();
        obj1.test();

    }
}
