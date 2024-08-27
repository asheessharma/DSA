package ThreadJava;

public class SleepMethod extends Thread{
    public void run(){
        System.out.println("Inside run method: " + Thread.currentThread().getName() );
        for(int i = 0; i < 3 ; i++){
            try{
                System.out.println( "inside run method: "+i);
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                System.out.println("Exception thrown");
            }
        }
    }

    public static void main(String[] args) { // JVM calls main method as thread, Default name is main.
        SleepMethod t1 = new SleepMethod();
        t1.run(); // Thread is not created, it is called as normal method.
        System.out.println(Thread.currentThread().getName());
        t1.start();// Thread is now created, by Default named as Thread-0.
    }

}
