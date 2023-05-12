package PizzaBillGenerator;

public class Pizza {
    private int price ;
    private int basePizza ;
    private boolean veg;
    private int extraCheese= 100;
    private int extraToppings = 150;
    private int backpack = 20;
    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isOptedForTakeAway = false;



    Pizza(boolean veg){
        this.veg = veg;
        if (this.veg){
            this.price = 300;
        }
        else {
            this.price = 400;
        }
        basePizza = this.price;
    }

    public void addExtraCheese(){
        this.price += extraCheese;
        isExtraCheeseAdded = true;
    }
    public void addExtraToppings(){
        this.price += extraToppings;
        isExtraToppingsAdded = true;
    }
    public void takeAway(){
        this.price += backpack;
        isOptedForTakeAway = true;
    }

    public void getBill(){
        String bill = "";
        if (isExtraCheeseAdded){
            bill += "Extra Cheese Added : " + extraCheese + "\n";
        }
        if (isExtraToppingsAdded){
            bill += "Extra Toppings Added : " + extraToppings + "\n";
        }
        if (isOptedForTakeAway){
            bill += "Opted back pack : " + backpack + "\n";
        }
        bill += "Total Price : " + this.price;
        System.out.println(bill);
    }

}
