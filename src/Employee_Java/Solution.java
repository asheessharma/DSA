package Employee_Java;

import java.util.Scanner;

class Account{
    private int id;
    private double balance;
    private double interestRate;

    public Account(int id, double balance, double interestRate) {
        this.id = id;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}

public class Solution {
    private static  double calculateInterest(Account obj , int noOfYears){
        double interestRate = obj.getInterestRate();
        double newInterestRate = (noOfYears * interestRate) / 100;
        double finalInterestRate = interestRate +  newInterestRate ;
        return (obj.getBalance() * finalInterestRate ) / 100;

    }

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int id = sc.nextInt();
     double balance = sc.nextDouble();
     double interestRate = sc.nextDouble();
     Account account = new Account(id,balance,interestRate);
     int noOfYears = sc.nextInt();
     double interestAmount = calculateInterest(account,noOfYears);


    }
}
