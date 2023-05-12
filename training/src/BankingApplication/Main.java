package BankingApplication;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static String  rname, rpn, rads, rpass;

    static void showMenu(){
        System.out.println("A. Login");
        System.out.println("B. Create User");
        System.out.println("C. Exit");
    }
    static void addUser(){
        System.out.print("Enter your name : ");
        rname = scanner.next();
        System.out.print("Enter your phoneNumber : ");
        rpn = scanner.next();
        System.out.print("Enter your Address : ");
        rads = scanner.next();
        System.out.print("Enter your Password : ");
        rpass = scanner.next();
    }
    public static void main(String[] args) throws LoginSuccessException {
        ArrayList<User> users = new ArrayList<>();
        boolean run= true;
        String loginName;
        String loginPassword;
        String userOption;

        users.add(new User("Ashwin", "9063940378","xyz", "1234"));
        users.add(new User("Max", "8907564312","xyz","567"));
        users.add(new User("Varun", "9143074567","xyz","890"));

        do {
            showMenu();
            System.out.print("> ");
            userOption = scanner.next();
            switch (userOption) {
                case "A":
                    System.out.println("Login");
                    for (User user:users)
                        user.createBankAccount();
                    System.out.print("Enter your name : ");
                    loginName = scanner.next();
                    System.out.println();
                    System.out.print("Enter your pass : ");
                    loginPassword = scanner.next();

                    try{
                        for (User user : users) {
                            if ((Objects.equals(user.getName(), loginName) && Objects.equals(user.getPassword(), loginPassword))) {
                                user.bankAccount.showMenu();
                                throw new LoginSuccessException("Login Success");
                            }
                        }
                        System.out.println("Invalid User name or password");
                        break;
                    }catch (LoginSuccessException e){
                        break;
                    }
                case "B":
                    System.out.println("Creating");
                    addUser();
                    users.add(new User(rname,rpn,rads,rpass));
                    break;
                case "C":
                    System.out.println();
                    run =false;
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }

        }while (run);
        System.out.println("Visit Again!!");
    }
}
