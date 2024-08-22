public class Runnable_Test implements Runnable{
    public void run(){
        System.out.println("This method needs to be override");
    }

    public static void main(String[] args) {
        Runnable_Test t2 = new Runnable_Test();
        Thread th = new Thread(t2); // object reference should be passed inside constructor, otherwise thread will not start.
        th.start();
    }

}
