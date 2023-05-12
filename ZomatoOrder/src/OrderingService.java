import java.util.*;
public class OrderingService {
    public static void main(String[] args) {
        ArrayList<Hotel> hotels = new ArrayList<>();

        hotels.add(new Hotel("Arya Bhavan"," 0987654321", "address 1" , new String[]{"Biriyani", "pizza", "Burger"}));
        hotels.add(new Hotel("Six Senses Zighy Bay"," 1234567890", "address 2" , new String[]{"Biriyani", "pizza"}));
        hotels.add(new Hotel("Royal Malewane"," 0987654321", "address 3" , new String[]{"Biriyani", "pizza","Burger", "Sandwich"}));
        hotels.add(new Hotel("CAG Pride"," 1234567890", "address 3" , new String[]{"Biriyani", "pizza","Burger",}));
        hotels.add(new Hotel("Premalaya"," 0987654321", "address 3" , new String[]{"Biriyani", "pizza","Burger", "Sandwich"}));
        hotels.add(new Hotel("Vivanta"," 1234567890", "address 3" , new String[]{"Biriyani", "pizza",}));
        Scanner scanner = new Scanner(System.in);
        int userInput;
        int fnameid;
        int quantity;
        // costomer details
        String name;
        String phoneNumber;
        String address;
        boolean run= true;

        System.out.print("Enter your name : ");
        name = scanner.nextLine();
        System.out.print("Enter your phone number : ");
        phoneNumber = scanner.nextLine();
        System.out.print("Enter your address : ");
        address = scanner.nextLine();
        Customer customer = new Customer(name,phoneNumber,address);
        System.out.println();
        System.out.println();

        while (true){
            System.out.println("1. List hotels");
            System.out.println("2. Show my cart");
            System.out.println("3. Exit");
            System.out.print("> ");
            userInput = scanner.nextInt();
            if (userInput == 1){
                System.out.println();
                System.out.println("List hotels");
                System.out.println("0 Exit");
                for(int i = 0; i < hotels.size(); i++) {
                    System.out.print(i + 1 + " ");
                    hotels.get(i).showAllHotel();
                }
                System.out.print("> ");
                userInput = scanner.nextInt();
                System.out.println();
                while (true) {
                    if (userInput == 0) {
                        break;
                    } else {
                        try {
//                        System.out.println(hotels.get(userInput-1).getName());
                            System.out.println("0 Go Back");
                            hotels.get(userInput - 1).getFoods();
                            System.out.print("> ");
                            fnameid = scanner.nextInt();
                            if (fnameid == 0){
//                                run=false;
                                break;
                            }
                            System.out.print("Quantity : ");
                            quantity = scanner.nextInt();
//                        hotels.get(userInput-1).getFoods();
                            hotels.get(userInput - 1).addCart(fnameid, quantity);
                            System.out.println("Your order is successfully added");
                            System.out.println();
                            System.out.println();
                        } catch (Exception e) {
                            break;
                        }

                    }
                }
            } else if (userInput == 2) {
//                System.out.println("Show my cart");
                Cart.listCart();
            }else if(userInput == 3){
                break;
            }
            else {
                System.out.println("Enter correctly !! ");
            }
        }
    }
}
