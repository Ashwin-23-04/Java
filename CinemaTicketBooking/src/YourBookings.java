import java.util.ArrayList;

public class YourBookings {
    private String mname;
    private String tname;
    private String screen;
    private String bseats;

    static ArrayList<String> bookings =new ArrayList<>();

    YourBookings(String mname, String tname, String screen, String bseats){
        this.mname = mname;
        this.tname= tname;
        this.screen = screen;
        this.bseats = bseats;
        bookings.add("Movie : " + mname + "\n" + "Timings : " + tname + "\n" + "Screen : " + screen +"\n"+ "Booked Seats : "+ bseats);
    }

    public static void listBookings(){
        for (String x : bookings){
            System.out.println(x);
        }
    }


}
