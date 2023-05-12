import java.util.ArrayList;

public class Movie {
    private String name, timing;
    Screen screen;
    ArrayList<Integer> bookedSeats = new ArrayList<>();


    public Screen getScreen() {
        return screen;
    }

    Movie(String name, String timing){
        this.name = name;
        this.timing = timing;
    }

    public String getName(){
        return name;
    }
    public void makeScreen(){
        this.screen = new Screen(this.name, this.timing);
    }
    public void selectSeats(){
        bookedSeats = screen.showSeats(bookedSeats);
        String bS = "";
        if (!bookedSeats.isEmpty()){
            for (Integer x: bookedSeats){
                bS+=x + " ";
            }

        }
        Cart mycart = new Cart(name,timing,bS);
    }
}
