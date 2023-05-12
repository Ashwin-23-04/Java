import java.util.*;
public class TicketBooking {
    public static void main(String[] args) {
        ArrayList<Movie> movies = new ArrayList<>();


        movies.add(new Movie("Varisu"));
        movies.add(new Movie("Thunivu"));
        Scanner scanner = new Scanner(System.in);

        int userInput;
        int mid;
        int tid;
        String movieName;
        String tname = "";
        String bseats;
        String screen;


        System.out.println("===Welcome===");

        while (true){
            System.out.println("1. List Movies");
            System.out.println("2. My Bookings");
            System.out.println("3. Exit");
            System.out.print("> ");
            userInput = scanner.nextInt();
                if (userInput == 1){
                    for(int i = 0; i < movies.size(); i++) {
                        System.out.print(i + 1 + " ");
                        System.out.println(movies.get(i).getName());
//                        movies.get(i).printName();
                    }
                    System.out.println("3. Exit");
                    System.out.print("> ");
                    mid = scanner.nextInt();
                if (mid == 3 || mid == 0) {
                    System.out.println("Come Again !!");
                    break;
                } else if (mid <= movies.size()) {
                    movies.get(mid - 1).showTimings();
                    System.out.print("> ");
                    tid = scanner.nextInt();

                    System.out.println("Working");
                    movieName = movies.get(mid-1).getName();
                    for (Timings timings: Timings.values()){
                        if (timings.id == tid){
                            tname = String.valueOf(timings);
                        }
                    }
                    ManagingService ms = new ManagingService(movieName, tname);
                    Screen s = ms.setScreen();
                    String seatNumbers = Screen.getSeatNumbers();
                    s.showSeats(seatNumbers);
                    bseats = s.getSeatNumbers();
                    if (movieName.equals("Varisu")){
                        screen = "screen 1";
                    }else {
                        screen = "screen 2";
                    }
                    ms.addBookings(movieName, tname, screen, bseats );

                } else {
                    System.out.println("Invalid Input");
                    break;
                }

            } else if (userInput == 2) {
                    YourBookings.listBookings();
            } else if (userInput == 3) {
                System.out.println("Come Again !!");
                break;
            }else {
                System.out.println("Invalid Input");
            }
        }
    }
}
