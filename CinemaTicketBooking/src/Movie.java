public class Movie {
    private String name;
    private String bookedSeates = Screen.getSeatNumbers();

    Movie(String name){
        this.name = name;
    }
    public void showTimings(){
        System.out.println("Select Your Show Timings");
        for (Timings timing: Timings.values()){
            System.out.println(timing.id + ". " + timing);
        }
    }
    public String getName(){
        return name;
    }
}
