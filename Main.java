package Bank;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static double price;
    static void main(String[] args) {
        boolean stop = true;
        double deposit= 0.0;
        char choice;
        double amountWithdraw;
        double amount= 0.0;
        System.out.println("****************************");
        System.out.println("Welcome to Joint Bank Limited");
        System.out.println("****************************");


        BankAccount bankAccount = new BankAccount(deposit);
        BankAccount bankAccount1 = new BankAccount(5000);
        BankAccount bankAccount2 = new BankAccount(2000);

        bankAccount.created();

        do {
            System.out.print("Pick a choice between A & B: ");
            choice = scanner.next().charAt(0);
            switch(choice){
                case 'a' ->{
                    bankAccount.deposit(deposited());
                }
                case 'b'->{
                    bankAccount.withdaraw(Withdraw());
                }
                default -> {
                    stop = false;
                }
            }

        }while(stop == true);
        System.out.println("thanks for banking with us");
    }

    public static double deposited(){

        System.out.print("how much do you want to deposit: ");
        price = scanner.nextDouble();
        return price;
    }
    public  static double Withdraw(){
        System.out.print("How much do you wish to Withdraw: ");
        price = scanner.nextDouble();
        return price;
    }

}
