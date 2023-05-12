package BankingApplication;

import java.util.Scanner;

public class BankAccount {
    private int balance;
    private int previousTransaction;
    private String customerName;
    private int customerID;
    String userOption;
    Scanner scanner = new Scanner(System.in);
    int amount;
    private String previousTransactions = "";
    private boolean run =true;

    public void deposit(int amount){
        if (amount != 0 ){
            balance += amount;
            previousTransaction = amount;
        }
    }

    public BankAccount(String customerName, int customerID) {
        this.customerName = customerName;
        this.customerID = customerID;
    }

    public void withdraw(int amount){
        if (amount != 0){
            balance -= amount;
            previousTransaction = -amount;
        }
    }

    public void Transaction(){
        if (previousTransaction > 0){
            previousTransactions += "Amount is deposited " + previousTransaction + "\n";
        }else if (previousTransaction < 0 ){
            previousTransactions += "Amount is withdrawed " + Math.abs(previousTransaction) + "\n";

        }else {
            System.out.println("No transaction occured");
        }
    }

    public void showMenu(){
        System.out.println("Welcome " + customerName);
        System.out.println("Your ID is " + customerID);
        System.out.println();


        do {
            System.out.println("A. check Balance ");
            System.out.println("B. Deposit ");
            System.out.println("C. WithDraw ");
            System.out.println("D. Previous Transaction ");
            System.out.println("E. Log Out ");
            System.out.print("> ");
            userOption = scanner.next();
            switch (userOption){

                case "A":
                    System.out.println();
                    System.out.println(balance + " Balance");
                    System.out.println();
                    break;
                case "B":
                    System.out.println();
                    System.out.print("Enter amount to deposit : ");
                    amount = scanner.nextInt();
                    deposit(amount);
                    Transaction();
                    System.out.println();
                    break;
                case "C":
                    System.out.println();
                    System.out.print("Enter amount to withdraw : ");
                    amount = scanner.nextInt();
                    withdraw(amount);
                    Transaction();
                    System.out.println();
                    break;
                case "D":
                    System.out.println();
                    System.out.println(previousTransactions);
                    System.out.println();
                    break;
                case "E":
                    System.out.println();
                    run = false;
                    break;
                default:
                    System.out.println("Invalid Option");

            }
        }while (run);
        System.out.println("Loging Out of " + customerName + " Account");
    }
}
