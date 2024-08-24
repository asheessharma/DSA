package ThreadJava;

class MyThread extends Thread{
    public void run(){
        for(int i=-10;i<200;i++){
            System.out.println("created extending Thread class");
        }
    }
}
class AnotherThread implements Runnable{
    public void run(){
        for(int i=-10;i<200;i++){
            System.out.println("I was created using Runnable interface");
        }

    }

}

public class TreadsJava {
    public static void main(String[] args) {
        MyThread obj = new MyThread();
        AnotherThread t2 = new AnotherThread();
        Thread obj2 = new Thread(t2);
        obj.start();
        obj2.start();

    }

}
