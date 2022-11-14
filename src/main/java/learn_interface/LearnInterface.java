package main.java.learn_interface;

public class LearnInterface implements Vehicle {
    @Override
    public String getBrand() {
        return "Benz";
    }

    public static void main(String[] args) {
        System.out.println(new LearnInterface().getBrand());
        System.out.println(new LearnInterface().turnAlarmOn());
        System.out.println(Vehicle.getCarSize(5,3));

    }
}
