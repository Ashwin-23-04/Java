import java.util.*;
public class Screen {
    private String  timings;
    private String movieName;
    private int capacity;
    private int booked = 0;
    private int row = 4;
    private int column = 10;
    private int[][] m = {{1,2,3,4,5,6,7,8,9,10},
                        {11,12,13,14,15,16,17,18,19,20},
                        {21,22,23,24,25,26,27,28,29,30},
                        {31,32,33,34,35,36,37,38,39,40}};
    private ArrayList<Integer> bM = new ArrayList<>();

    int a= 1;
    private static String seatNumbers = " ";
    int  userInput;
    Scanner scanner =new Scanner(System.in);


    Screen(String movieName, int capacity){
        this.movieName = movieName;
        this.capacity = capacity;
    }

    public void showSeats(String seatNumbers){
        int seatNumber = 1;
        for (int i = 0; i < m.length; i++) {
            System.out.println();
            for (int j = 0; j < m[i].length; j++) {
                System.out.print((seatNumber++) + "\t");
            }
        }
        while (true) {

            System.out.println();
            System.out.println("Select your seat and 0 to Exit");
            System.out.println("Capacity : "+ capacity + "\tBooked : " + booked);
            System.out.print("> ");
            userInput = scanner.nextInt();

            if (userInput != 0){
                if(!bM.contains(userInput)){
                    for (int i = 0; i < m.length; i++) {
                        for (int j = 0; j < m[i].length; j++) {
                            if (m[i][j] == userInput) {
                                m[i][j] = 0;
                                capacity--;
                                booked++;
                            }
                        }
                    }
                    bM.add(userInput);
                    for (Integer b : bM) {
                        System.out.println();
                        System.out.println(b);
                    }
                    seatNumbers += userInput + " ";
                }else {
                    System.out.println("Already booked");
                }
            }else {
                break;
            }
            for (int i = 0; i < m.length; i++) {
                System.out.println();
                for (int j = 0; j < m[i].length; j++) {
                    System.out.print(m[i][j] + " ");
                }
            }

        }
    }

    public static String getSeatNumbers(){
        return seatNumbers;
    }

}
