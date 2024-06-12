package TCSDigital2024;

 abstract class Demo{
    abstract void display();

    public void non_Abstract(){
        System.out.println("Non abstract method inside abstract class");
    }

}
public class OOPtraction extends Demo {
   public void display(){
       System.out.println("Abstract Method overriding ");
    }
    public void non_Abstract(){
        super.non_Abstract(); // To call non_abstract method of super class
//        System.out.println(" Overridden abstract Method ");
    }

    public static void main(String[] args) {
        OOPtraction obj = new OOPtraction();
        obj.display();
        obj.non_Abstract();
//        obj.non_Abstract();
    }
}
