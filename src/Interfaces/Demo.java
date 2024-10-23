package Interfaces;

import  java.lang.FunctionalInterface;
interface i1{

    public abstract void method1();
    public default void method2(){
        System.out.println("default method");
    }

}
interface i2 extends i1{


    @Override
    public default void method2(){
        System.out.println("overridden method2");
    }
    public default void method3(){
        System.out.println("Child interface");
    }

    @Override
    void method1();
}


public class Demo implements i1,i2 {






    public static void main(String[] args) {
        i1 obj = ()->System.out.println("this is lambda expression");
        obj.method1();
        obj.method2();
        i2 obj2 = ()-> System.out.println("func");
        obj2.method3();


    }


    @Override
    public void method2() {
        i2.super.method2();
    }

    @Override
    public void method3() {
        i2.super.method3();
    }

    @Override
    public void method1() {

    }
}
