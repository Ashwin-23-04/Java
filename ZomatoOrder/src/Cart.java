import java.util.ArrayList;

public class Cart {
    private String hname;
    private String fname;
    private int quantity;

    static ArrayList<String> cart =new ArrayList<>();

    Cart(String hname, String fname, int quantity){
        this.hname = hname;
        this.fname= fname;
        this.quantity = quantity;
        cart.add("Hotel Name : " + hname + " Food Name : " + fname + " Quantity : " + quantity);
    }

    public static void listCart(){
        for (String x : cart){
            System.out.println(x);
        }
    }
}
