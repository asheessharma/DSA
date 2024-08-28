package ThreadJava;
//Give chance to other method to run, by stopping execution of current method.
//JAVA 5 internally uses sleep() method. JAVA6 provide hint to thread scheduler. Then it depends on Thread-scheduler to accept or ignore the hint.
//Yield send request to JVM. Its totally depends upon JVM weather it will stop current executing thread or not.
public class YieldMethod extends Thread{
    public void run(){
        for(int i = 0; i< 3 ;){
            System.out.println(Thread.currentThread().getName()+" current " +i);
            i++;
        }
    }
    public static void main(String[] args) {
        YieldMethod t1 = new YieldMethod();
        t1.start();
        for(int j = 1; j < 3;){
            Thread.yield();
            System.out.println(Thread.currentThread().getName() + " -> " +j++);
        }
    }
}
