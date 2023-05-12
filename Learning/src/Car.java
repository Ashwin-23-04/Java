public class Car {
    String make;
    String model;
    int year;
    String color;
    double price;

    Car(String make, String model, int year, String color, double price){
        this.make = make;
        this.model=model;
        this.year = year;
        this.color = color;
        this.price = price;
    }
    void drive(){
        System.out.println("you're driving " + this.model);
    }
    void brake(){
        System.out.println("you step on the brake");
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
