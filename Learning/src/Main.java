import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();
        Car car1 = new Car("Ford", "Mustang", 2020, "blue", 50000.00);
        System.out.println(car1.model);
        car1.drive();

        System.out.println(car1.toString());
        System.out.println(car1);

        garage.park(car1); // object parsing
    }
}