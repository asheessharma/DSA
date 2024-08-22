//Thread class implements Runnable interface, which has only one abstract method run();
public class Test extends Thread{
    public void run(){
        System.out.println("Thread Task");
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.start();  // it will internally call run() method
        // we cannot call start() method multiple times, it will throw exception.

    }

}
