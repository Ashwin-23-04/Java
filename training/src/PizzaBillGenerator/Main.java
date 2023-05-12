package PizzaBillGenerator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int userInput = 1;
        int tpizza ; // pizza type normal or delux
        int npizza; // for any addons
        int x ;
        int y;
        Scanner scanner = new Scanner(System.in);
        int a;
        boolean veg;

        while (userInput == 1) {
            System.out.print("Enter 1 to order pizza and 2 to exit : ");
            userInput = scanner.nextInt();
            if (userInput != 1){
                break;
            }
            System.out.println("Select the following option");
            System.out.println("1. Normal Pizza");
            System.out.println("2. Delux Pizza");
            System.out.println("3. Exit");
            System.out.print("Enter your choice : ");
            tpizza = scanner.nextInt();
            if (tpizza == 1) {
                System.out.println("Select the following: ");
                System.out.println("1. veg");
                System.out.println("2. non-veg");
                a = scanner.nextInt();
                if (a == 1){
                    veg = true;
                }
                else {
                    veg = false;
                }
                Pizza basePizza = new Pizza(veg);

                System.out.println("Select the following :");
                System.out.println("1. get bill");
                System.out.println("2. Add Extra Cheese");
                System.out.println("3. Add Extra Toppings");
                System.out.println("4. Back pack ");
                npizza = scanner.nextInt();
                if(npizza == 1){
                    basePizza.getBill();
                } else if (npizza ==2){
                    basePizza.addExtraCheese();
                    System.out.println("Select the following : ");
                    System.out.println("1. Add Extra Toppings");
                    System.out.println("2. Back pack ");
                    System.out.println("3. get bill");
                    x = scanner.nextInt();
                    if (x == 1){
                        basePizza.addExtraToppings();
                        System.out.println("Select the following");
                        System.out.println("1. Back pack ");
                        System.out.println("2. get bill");
                        y = scanner.nextInt();
                        if(y == 1){
                            basePizza.takeAway();
                            basePizza.getBill();
                        }else {
                            basePizza.getBill();
                        }
                    }
                    else if(x == 2) {
                        basePizza.takeAway();
                    }else if (x == 3 ){
                        basePizza.getBill();
                    }
                } else if (npizza == 3){
                    basePizza.addExtraToppings();
                    System.out.println("Select the following : ");
                    System.out.println("1. Add Extra Cheese");
                    System.out.println("2. Back pack ");
                    System.out.println("3. get bill");
                    x = scanner.nextInt();
                    if (x == 1){
                        basePizza.addExtraCheese();
                        System.out.println("Select the following");
                        System.out.println("1. Back pack ");
                        System.out.println("2. get bill");
                        y = scanner.nextInt();
                        if(y == 1){
                            basePizza.takeAway();
                            basePizza.getBill();
                        }else {
                            basePizza.getBill();
                        }
                    }
                    else if(x == 2) {
                        basePizza.takeAway();
                        basePizza.getBill();
                    }else if (x == 3 ){
                        basePizza.getBill();
                    }
                }
            } else if (tpizza == 2) {
                System.out.println("Select the following: ");
                System.out.println("1. veg");
                System.out.println("2. non-veg");
                a = scanner.nextInt();
                if (a == 1){
                    veg = true;
                }
                else {
                    veg = false;
                }
                DeluxPizza deluxPizza = new DeluxPizza(veg);

                System.out.println("Select the following :");
                System.out.println("1. get bill");
                System.out.println("2. Back pack ");
                npizza = scanner.nextInt();
                if (npizza == 1){
                    deluxPizza.getBill();
                }
                else{
                    deluxPizza.takeAway();
                    deluxPizza.getBill();
                }
            } else {
                System.out.println("Thanks visit Again !!");
            }

        }
    }
}
