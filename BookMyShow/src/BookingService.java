import java.util.Scanner;
public class BookingService {
    static Scanner scanner = new Scanner(System.in);
    static int toption;
    static void showTimings(){
        do {
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
        } while (toption != 6);
    }
    public static void main(String[] args) {
        while (true){
            System.out.println("1. Login");
            System.out.println("2. Exit");
            System.out.print(">");
            int userInput = scanner.nextInt();
            if (userInput == 1) {
                try{
                    if (Login.checkLogin()) {
                        System.out.println("You logged in ");
                        showTimings();
                    }else {
                        throw new LoginFailedException();
                    }
                }catch (LoginFailedException e){
                    System.out.println("Invalid User name or password");
                }
            } else if (userInput == 2) {
                System.out.println("Come Againg!!");
                break;
            } else {
                System.out.println("Invalid Input");
            }
        }
    }
}
