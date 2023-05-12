import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class OnlineBookingService {

    public static void main(String[] args) throws ParseException {
        ArrayList<Bus> buses = new ArrayList<Bus>();
        ArrayList<Booking> bookings = new ArrayList<Booking>();

        buses.add(new Bus(1,true,2));
        buses.add(new Bus(2,false,50));
        buses.add(new Bus(3,true,45));

        int userOption = 1;
        Scanner scanner = new Scanner(System.in);

        Seat.showSeats();

        while (userOption == 1){
            System.out.print("Enter 1 to book and 2 to exit : ");
            userOption = scanner.nextInt();
            if (userOption == 1){
                System.out.println("Booking on process...");
                for (Bus b : buses){
                    b.displayBusInfo();
                }
                Booking booking = new Booking();
                if(booking.isAvailable(bookings,buses)){
                    bookings.add(booking);
                    System.out.println("Your booking is confirmed");
                }
                else {
                    System.out.println("Sorry ! Booking is full..");
                }
            }
        }
        System.out.println("Thanks for visiting !!");
    }
}
