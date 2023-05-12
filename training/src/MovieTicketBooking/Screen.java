package MovieTicketBooking;

import java.util.ArrayList;
import java.util.Scanner;

public class Screen {
    private String movieName, timing;
    private int capacity=40;
    private int booked = 0;
    private int row = 4;
    private int column = 10;
    private int[][] seats = {{1,2,3,4,5,6,7,8,9,10},
            {11,12,13,14,15,16,17,18,19,20},
            {21,22,23,24,25,26,27,28,29,30},
            {31,32,33,34,35,36,37,38,39,40}};
    private ArrayList<Integer> bookedSeats = new ArrayList<>();
    private int  userInput;
    Scanner scanner =new Scanner(System.in);


    Screen(String movieName, String timing){
        this.movieName = movieName;
        this.timing = timing;

    }


    public ArrayList showSeats(ArrayList bookedSeats){
//        int seatNumber = 1;
        for (int i = 0; i < seats.length; i++) {
            System.out.println();
            for (int j = 0; j < seats[i].length; j++) {
//                System.out.print((seatNumber++) + "\t");
                if (bookedSeats.contains(seats[i][j])) {
                    seats[i][j] = 0;
                    capacity--;
                    booked++;
                }
                System.out.print(seats[i][j] + "\t");

            }
        }
        while (true) {

            System.out.println();
            System.out.println("Select your seat and 0 to Exit");
            System.out.println("Capacity : "+ capacity + "\tBooked : " + booked);
            System.out.print("> ");
            userInput = scanner.nextInt();

            if (userInput != 0){
                if(!bookedSeats.contains(userInput)){
                    for (int i = 0; i < seats.length; i++) {
                        for (int j = 0; j < seats[i].length; j++) {
                            if (seats[i][j] == userInput) {
                                seats[i][j] = 0;
                                capacity--;
                                booked++;
                            }
                        }
                    }
                    bookedSeats.add(userInput);
                    for (Object b : bookedSeats) {
                        System.out.println();
                        System.out.println(b);
                    }
                }else {
                    System.out.println("Already booked");
                }
            }else {
                break;
            }
            for (int i = 0; i < seats.length; i++) {
                System.out.println();
                for (int j = 0; j < seats[i].length; j++) {
                    System.out.print(seats[i][j] + "\t");
                }
            }

        }
        return bookedSeats;
    }

}
