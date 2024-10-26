package Interfaces;
interface Animal{
    void sound();
    void eat();
}
class cat implements Animal{
    public void sound(){
        System.out.println("Meow");
    }
    public void eat(){
        System.out.println("Eating cat food");
    }

}
public class Dog implements Animal{
    public void sound(){
        System.out.println("Bark");
    }
    public void eat(){
        System.out.println("Eating dog food");
    }

    public static void main(String[] args) {
        Animal obj = new cat();
        obj.eat();
        obj.sound();
        Dog obj1 = new Dog();
        obj1.sound();
        obj1.eat();
    }
}
