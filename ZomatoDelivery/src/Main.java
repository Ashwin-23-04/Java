import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int userInput;
        int quantity;

        ArrayList<Foods> foods = new ArrayList<>();
        ArrayList<Orders> orders = new ArrayList<>();

        foods.add(new Foods("Biriyani"));
        foods.add(new Foods("Pizza"));
        foods.add(new Foods("Burger"));
        foods.add(new Foods("Sandwich"));
        foods.add(new Foods("Fried Rice"));
        foods.add(new Foods("Noodles"));

        while (run){
            System.out.println("Food list ");
            for(int i = 0; i < foods.size(); i++) {
                System.out.print(i + 1 + " ");
                foods.get(i).displayFood();
            }
            System.out.println("7 Exit");
            System.out.println();
            System.out.print("Enter your choice : ");
            userInput = scanner.nextInt();
            if (userInput == 7){
                System.out.println("visit later");
                run = false;
            }else {
                System.out.print("Quantity : ");
                quantity = scanner.nextInt();
                Orders order = new Orders(userInput, quantity);
                order.cart(orders, foods);
            }
            System.out.println("1. Add Food");
            System.out.println("2. Exit");

            userInput = scanner.nextInt();
            if (userInput == 2){
                run = false;
            } else {
                continue;
            }

        }





    }
}