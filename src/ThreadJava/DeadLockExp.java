package ThreadJava;

public class DeadLockExp {

    public static void main(String[] args) {
        final  String resource1 = "String 1";
        final String resource2 = "String 2";

        Thread t1 = new Thread(()->{
            synchronized (resource1){
                System.out.println("Thread 1 locked Resource 1");
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
                synchronized (resource2){
                    System.out.println("Thread1 : Trying to get Resource2");

                }
            }

        });

        Thread t2 = new Thread(()->{
            synchronized (resource2){
                System.out.println("Thread2 locked resource2");
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }synchronized (resource1){
                    System.out.println("Thread2: trying to lock resource1");
                }

            }

        });
        t1.start();
        t2.start();

    }
}
