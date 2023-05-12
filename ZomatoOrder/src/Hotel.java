public class Hotel {
    private String name;
    private String phoneNumber;
    private String address;
    private String[] foods;
    private int fnameid;
    private int quantity;



    Hotel(String name, String phoneNumber, String address, String[] foods){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.foods = foods;
    }

    public void showAllHotel(){
        System.out.println(name);
    }
    public String getName(){
        return name;
    }

    public void getFoods(){
        for(int i = 0; i < foods.length; i++) {
            System.out.print(i + 1 + " ");
            System.out.println(foods[i]);
        }
    }
    public void addCart(int fnameid,int quantity){
//        System.out.println(foods[fnameid-1]);
        Cart cart = new Cart(name,foods[fnameid-1], quantity);
    }
}
