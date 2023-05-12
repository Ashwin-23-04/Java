public class ManagingService {

    private String movieName;
    private String timing;


    ManagingService(String movieName, String timing){
        this.movieName = movieName;
        this.timing = timing;
    }

    public Screen setScreen(){
        if (movieName == "Varisu"){
            Screen screen1 = new Screen("Varisu", 40);
            return screen1;
        }else {
            Screen screen2 = new Screen("Thunivu", 40);
            return screen2;
        }
    }

    public void addBookings(String movieName, String tname, String screen, String bseats){
        YourBookings bookings = new YourBookings(movieName, tname, screen, bseats );
    }
}
