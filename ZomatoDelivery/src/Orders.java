import java.util.ArrayList;

public class Orders {
    private String  foodName;
    private int quantity;
    private int userInput;

    Orders(int userInput, int quantity){
        this.userInput = userInput;
        this.quantity = quantity;
    }

    public void cart(ArrayList<Orders> orders, ArrayList<Foods> foods){
        foodName = foods.get(userInput-1).getName();
        System.out.println("Order confirmed");
    }


}
