import java.util.ArrayList;
import java.util.Scanner;


public enum Timing {
    MORNING("Morning"), AFTERNOON("Afternoon"), EVENING("Evening"), NIGHT("Night");
    ArrayList<Movie> movies = new ArrayList<>();
    private String tname;
    Scanner scanner = new Scanner(System.in);


    Timing(String tname){
        movies.add(new Movie("Varisu", tname));
        movies.add(new Movie("Thunivu", tname));
    }
    public void listMovies(){
        for (Movie movie: movies)
            movie.makeScreen();
        for(int i = 0; i < movies.size(); i++) {
            System.out.print(i + 1 + " ");
            System.out.println(movies.get(i).getName());
        }
        System.out.println("3. Exit");
        System.out.print("> ");
        int mid = scanner.nextInt();
        if (mid == 1){
            System.out.println(movies.get(mid-1).getName());
//            bookedSeats = movies.get(mid-1).getScreen().showSeats(bookedSeats);
            movies.get(mid-1).selectSeats();
        }else if(mid == 2){
            System.out.println(movies.get(mid-1).getName());
//            bookedSeats = movies.get(mid-1).getScreen().showSeats(bookedSeats);
            movies.get(mid-1).selectSeats();

        }else {
            System.out.println("Invalid Input");
        }
    }
}
