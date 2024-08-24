package ThreadJava;

class Thread1 extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("Thread1");
        System.out.println("New Name: "+ Thread.currentThread().getName());
    }

}

public class Method1 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Thread1 t = new Thread1();
        t.start();
        System.out.println(Thread.currentThread().getName());
        System.out.println("Is "+ Thread.currentThread().getName() + " Alive: " + Thread.currentThread().isAlive() );
        System.out.println(t.isAlive());

    }
}
