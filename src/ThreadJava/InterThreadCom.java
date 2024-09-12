package ThreadJava;
//wait method waits and give chance to another thread, until another thread notify it.

public class InterThreadCom {
    int amount = 10000;
    synchronized void withdraw(int amount2){
        if(amount < amount2){
            System.out.println("Low amount... Waiting to deposit...");
        }
        try{
            wait();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        this.amount-=amount2;
        System.out.println("Withdraw completed...");
        System.out.println("Remaining amount is : "+ amount);
    }

    synchronized void deposit(int amount1){
        System.out.println("Depositing amount...");
        amount+=amount1;
        System.out.println("New Amount is..." + amount);
        notify();
    }

    public static void main(String[] args) {
        InterThreadCom t = new InterThreadCom();
        new Thread(){
            public void run(){
                t.withdraw(15000);
            }

        }.start();
        new Thread(){
            public void run(){
                t.deposit(7000);
            }
        }.start();

    }

}
