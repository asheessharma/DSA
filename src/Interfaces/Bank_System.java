package Interfaces;

import org.w3c.dom.ls.LSOutput;

interface Account{
    void deposit(double amount);
    void withdraw(double amount);
}
interface InterestBearing{
    double calculateInterest();
    void addInterest(double amount);
}

interface OverdraftProtection{
    void applyOverdraft(double amount);
}


class SavingAccount implements Account,InterestBearing{
    private double balance;
    private double interest;
    public SavingAccount(double balance, double interest){
        this.balance=balance;
        this.interest = interest;
        System.out.println("*** Saving Account Created Successfully ***");
    }

    @Override
    public void deposit(double amount){
        balance += amount;
    }
    @Override
    public void withdraw(double amount){
        if(amount <= balance){
            balance -= amount;
            System.out.println("Remaining amount is : "+ balance);
        }else{
            System.out.println("*** Not Enough Balance ***");
        }
    }
    @Override
    public double calculateInterest(){
        return balance * interest / 100;
    }
    @Override
    public void addInterest(double amount){
        balance+=amount;
    }
    public void displayBalance(){
        System.out.println("Saving Account Balance: "+balance);
    }

}
class checkingAccount implements Account, OverdraftProtection{
    private double Balance;
    private double overDraft;
    public checkingAccount(double Balance,double overDraft){
        this.Balance = Balance;
        this.overDraft = overDraft;
        System.out.println("*** Checking Account created successfully ***");
    }
    @Override
    public void deposit(double amount){
        Balance+=amount;
    }
    @Override
    public void withdraw(double amount){
        if((Balance) >= amount){
            Balance-=amount;
            System.out.println("Remaining amount: "+ Balance);
        }else if(amount + overDraft >= amount){
            overDraft -= (amount - Balance);
            Balance = 0;
            System.out.println("Withdrawal successful using overdraft. Remaining overdraft limit: " + overDraft);
        }else{
            System.out.println("*** Even overDraft Limit Exceeded ***");
        }
    }
    public void applyOverdraft(double amount){
        overDraft += amount;
        System.out.println("New Overdraft Limit: " + overDraft);
    }
    public void displayBalance(){
        System.out.println("checking Account Balance: " + Balance + ", Overdraft Limit: " + overDraft);
    }
}
public class Bank_System {
    public static void main(String[] args) {
        SavingAccount savings = new SavingAccount(1000,5);
        savings.deposit(500);
        savings.displayBalance();
        double interest = savings.calculateInterest();
        savings.addInterest(interest);
        System.out.println("After adding interest : ");
        savings.displayBalance();
        savings.withdraw(300);
        savings.displayBalance();

        checkingAccount checking = new checkingAccount(500,200);
        checking.deposit(300);
        checking.displayBalance();
        checking.withdraw(700);
        checking.displayBalance();
        checking.withdraw(200);
        checking.displayBalance();
        checking.applyOverdraft(100);
        checking.displayBalance();

    }


}
