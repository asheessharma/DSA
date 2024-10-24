package Interfaces;

import  java.lang.FunctionalInterface;
@FunctionalInterface
interface i1{

    void method1(int a,int b);
    default void method2(){
        System.out.println("default method");
    }

}
@FunctionalInterface
interface i2 extends i1{
    default void method3(){
        System.out.println("Interface i2 default method");
    }

}


public class Demo {

    public static void main(String[] args) {

        i1 obj = (a,b) -> {System.out.println("this is lambda expression " + (a+b));};
        obj.method1(2,3);
        obj.method2();
        i2 obj1 = (c,d) ->{
            System.out.println("sum-thing" + c+d);
        };
        obj1.method1(6,5);
        obj1.method3();
    }
}
