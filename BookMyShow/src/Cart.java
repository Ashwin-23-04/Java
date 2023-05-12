import java.util.ArrayList;

public class Cart {
    private String mname;
    private String tname;
    private String bseats;

    static ArrayList<String> bookings =new ArrayList<>();

    Cart(String mname, String tname, String bseats){
        this.mname = mname;
        this.tname= tname;
        this.bseats = bseats;
        bookings.add("\n"+"Movie : " + mname + "\n" + "Timings : " + tname + "\n" + "Booked Seats : "+ bseats+"\n");
    }

    public static void listBookings(){
        for (String x : bookings){
            System.out.println(x);
        }
    }


}
