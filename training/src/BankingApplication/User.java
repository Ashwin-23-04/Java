package BankingApplication;

import java.util.Random;
import java.util.Scanner;

public class User {
    Random rand = new Random();
    private String name;
    private int id = rand.nextInt(10)+1;
    private String phoneNumber;
    private String address;
    private String password;
    BankAccount bankAccount ;
    Scanner scanner = new Scanner(System.in);

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public User(String name, String phoneNumber, String address, String password) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.password = password;
    }


    public void createBankAccount(){
        this.bankAccount = new BankAccount(this.name, this.id);
    }
}
