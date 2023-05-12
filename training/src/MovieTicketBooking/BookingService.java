package MovieTicketBooking;


import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class BookingService {
    static Scanner scanner = new Scanner(System.in);
    static String  rname, rpn, rads, rpass;
    static int toption;
    static void showMenu(){
        System.out.println("1. Login");
        System.out.println("2. Create User");
        System.out.println("3. Exit");
    }
    static void showTimings(){
        while (true) {
            int a = 1;
            for (Timing t : Timing.values()) {
                System.out.println(a + ". " + t);
                a++;
            }
            System.out.println("5. Your Bookings");
            System.out.println("6. Logout");
            System.out.print("> ");
            toption = scanner.nextInt();
            switch (toption) {
                case 1:
                    Timing morning = Timing.MORNING;
                    System.out.println(morning.name());
                    morning.listMovies();
                    break;
                case 2:
                    Timing afternoon = Timing.AFTERNOON;
                    System.out.println(afternoon.name());
                    afternoon.listMovies();
                    break;
                case 3:
                    Timing evening = Timing.EVENING;
                    System.out.println(evening.name());
                    evening.listMovies();
                    break;
                case 4:
                    Timing night = Timing.NIGHT;
                    System.out.println(night.name());
                    night.listMovies();
                    break;
                case 5:
                    System.out.println("Listing your bookings");
                    Cart.listBookings();
                    break;
                case 6:
                    System.out.println("Logging out");
                    break;
                default:
                    System.out.println("Invalid output");
            }
            if (toption == 6){
                break;
            }
        }
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
        Timing timing ;
        boolean run= true;
        String loginName, loginPassword;
        int userOption;

        users.add(new User("Ashwin", "9063940378","xyz", "1234"));
        users.add(new User("Max", "8907564312","xyz","567"));
        users.add(new User("Varun", "9143074567","xyz","890"));

        do {
            showMenu();
            System.out.print("> ");
            userOption = scanner.nextInt();
            switch (userOption) {
                case 1:
                    System.out.println("Login");
                    System.out.print("Enter your name : ");
                    loginName = scanner.next();
                    System.out.println();
                    System.out.print("Enter your pass : ");
                    loginPassword = scanner.next();

                    try{
                        for (User user : users) {
                            if ((Objects.equals(user.getName(), loginName) && Objects.equals(user.getPassword(), loginPassword))) {
                                showTimings();


                                throw new LoginSuccessException("Login Success");
                            }
                        }
                        System.out.println("Invalid User name or password");
                        break;
                    }catch (LoginSuccessException e){
                        break;
                    }
                case 2:
                    System.out.println("Registering new user");
                    addUser();
                    users.add(new User(rname,rpn,rads,rpass));
                    break;
                case 3:
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

