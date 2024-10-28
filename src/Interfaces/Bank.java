package Interfaces;

import java.util.List;
import java.util.ArrayList;

interface Accounts{
    void deposit(int amount);
    void withdraw(int amount);
    void getBalance();
}

class SavingsAccount implements Accounts{
    private int Balance;
    private int interest;
    public SavingsAccount(int balance, int interest){
        this.Balance = balance;
        this.interest = interest;
    }

    public void deposit(int amount){
        System.out.println("Deposited "+ amount + " into your account");
        Balance+=amount;
    }

    public void withdraw(int amount){
        if(amount > Balance){
            System.out.println("Invalid request, Not enough balance");
        }
        else{
            Balance-=amount;
            System.out.println("New Balance "+ Balance);
        }
    }
    public void getBalance(){
        System.out.println("Balance is : " + Balance);
    }
    public void applyInterest(){
        Balance += Balance * interest / 100;
    }

}

class CurrentAccount implements Accounts{
    private int balance;
    private int overDraft;

    public CurrentAccount(int balance, int overDraft){
        this.balance = balance;
        this.overDraft = overDraft;
    }

    public void setOverDraft(int amount){
        this.overDraft = amount;
    }
    @Override
    public void deposit(int amount){
        balance += amount;
    }
    @Override
    public void withdraw(int amount){
        if(balance + overDraft >= amount){
            balance -= amount;
            System.out.println("Account Balance : "+ balance);
        }
        else{
            System.out.println("OverDraft limit exceeded");
        }
    }
    public void getBalance(){
        System.out.println("Account balance: "+balance);
    }


}
public class Bank {
    private ArrayList<Accounts>accounts;
    public Bank(){
        accounts = new ArrayList<>();
    }

    public void addAccount(Accounts account){
        accounts.add(account);
    }

    public void removeAccount(Accounts account){
        accounts.remove(account);
    }

    public void deposit(Accounts account , int amount){
        account.deposit(amount);
    }
    public void withdraw(Accounts account, int amount){
        account.withdraw(amount);
    }

    public void printAccountBalance(){
        for(Accounts acc : accounts){
            acc.getBalance();
        }
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        SavingsAccount sa = new SavingsAccount(2000,5);
        CurrentAccount ca = new CurrentAccount(3000,1000);
        bank.addAccount(sa);
        bank.addAccount(ca);

        bank.deposit(sa,100);
        bank.deposit(ca,300);

        bank.withdraw(sa,2000);
        bank.withdraw(ca,2200);
        bank.printAccountBalance();
        sa.applyInterest();
        sa.getBalance();




    }
}
