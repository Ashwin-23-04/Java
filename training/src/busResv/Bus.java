package busResv;

public class Bus {
    private int busNo;
    private boolean AC;
    private int capacity;

    Bus(int busNo , boolean AC, int capacity){
        this.busNo = busNo;
        this.AC = AC;
        this.capacity = capacity;
    }

    public int getBusNo(){
        return busNo;
    }
    public void setBusNo(int busNo){
        this.busNo = busNo;
    }
    public int getCapacity(){
        return capacity;
    }
    public void setCapacity(int capacity){
        this.capacity = capacity;
    }

    public void displayBusInfo(){
        System.out.println("Bus No : " + busNo + " AC : " + AC + " Capacity : "+ capacity);
    }
}
