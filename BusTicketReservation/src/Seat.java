import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Seat {
    private Date date;
    static Scanner scanner= new Scanner(System.in);
    static Integer userInput;
    static ArrayList<Integer> bsn = new ArrayList<>();
    static Integer bookedSeatNumber[] ;
    Seat(Date date){
        this.date = date;
    }
    public static void showSeats(){
        int seatNumber = 1;
        for (int i=0; i <4; i++){
            System.out.println();
            for (int j=0; j <10; j++){
                System.out.print(seatNumber++ + "\t");
            }
        }
        System.out.print("Enter seat number to book : ");
        userInput = scanner.nextInt();
        bsn.add(userInput);
        if(Arrays.stream(bookedSeatNumber).anyMatch(userInput)){

        }
        bookedSeatNumber = bsn.toArray(bookedSeatNumber);
    }
}
