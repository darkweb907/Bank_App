package Bank;

public class BankAccount {
    double amount;
    static int accountCreated = 0;
    BankAccount(double amount){
        accountCreated++;
        this.amount = amount;
    }

    public void deposit(double balance) {
        amount += balance;
        System.out.println("you Deposited an amount of: " + amount);
    }

    public void withdaraw(double initial){
        if(amount < initial){
            System.out.println("Insufficient Funds!!!!!");
            return;
        }
        amount -= initial;
        System.out.println("your remaining balance is " + amount);
    }
    void created(){
        System.out.println("you created " + accountCreated);
    }
}
