package Employee_Java;

public class BankAccount {
    private int account_number;
    private int account_balance;

    public int getAccount_number() {
        return account_number;
    }

    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }

    public int getAccount_balance() {
        return account_balance;
    }

    public void setAccount_balance(int account_balance) {
        this.account_balance = account_balance;
    }

    public BankAccount(int acc_numb, int acc_bal){
        this.account_number = acc_numb;
        this.account_balance = acc_bal;
        System.out.println("You created account "+account_number);
    }
    public void deposite(int addMoney){
        if(addMoney<0){
            System.out.println("Invalid Request!! You cannot deposit negative amount..");
        }
        else{
            this.account_balance = this.account_balance + addMoney;
            System.out.println("Amount " + addMoney + " added to account number " + this.account_number + ".");
        }
    }

    public void withdraw(int removeMoney){
        if(removeMoney > this.account_balance){
            System.out.println("Invalid Request!! Not enough balance ...");
        }else{
            this.account_balance = this.account_balance - removeMoney;
            System.out.println("Amount "+ removeMoney + " debited from account number "+this.account_number + ".");
        }
    }
}
class Main2{
    public static void main(String[] args) {
        BankAccount account = new BankAccount(4141,100);
        account.deposite(100);
        account.withdraw(60);
        System.out.println("Balance: "+ account.getAccount_balance());
        account.withdraw(200);
    }
}

