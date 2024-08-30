package ThreadJava;
class BookMovieSeat{
    static int total_seat = 20;
    static synchronized void bookSeat(int seat){  //using synchronised keyword makes it synchronised method.
        // It will create problem in case when different thread try to access multiple objects. It will create data inconsistency.
        //In such cases using static synchronization is very useful as it will create a synchronised class. For this we can use static keyword with synchronised
        if(seat <= total_seat){
            System.out.println(seat + " Seats Booked successfully... ");
            total_seat = total_seat - seat;
            System.out.println(total_seat + "seats remaining..");
        }
        else{
            System.out.println("* * * Regret! Unable to fulfill your request * * *");
            System.out.println(total_seat + " seats remaining...");
        }
    }
}
class MyThread1 extends Thread{
    BookMovieSeat obj;
    int seats;
     MyThread1(BookMovieSeat b , int seats){
        this.obj = b;
        this.seats = seats;
    }
    public void run(){
        BookMovieSeat.bookSeat(seats);
    }

}
class MyThread2 extends Thread{
    BookMovieSeat obj2;
    int seats;
     MyThread2(BookMovieSeat b , int seats){
        this.obj2 = b;
        this.seats = seats;
    }
    public void run(){
        BookMovieSeat.bookSeat(seats);
    }
}

public class StaticSynchronization {
    public static void main(String[] args) {
        BookMovieSeat obj = new BookMovieSeat();
        MyThread1 t1 = new MyThread1(obj,7);
        t1.start();
        MyThread2 t2 = new MyThread2(obj,8);
        t2.start();

        BookMovieSeat obj2 = new BookMovieSeat();
        MyThread1 t3 = new MyThread1(obj2 , 4);
        t3.start();
        MyThread1 t4 = new MyThread1(obj2 , 3);
        t4.start();
    }


}
