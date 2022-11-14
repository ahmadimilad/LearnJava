package main.java.learn_interface;

public interface Vehicle {

    String getBrand();

    default String turnAlarmOn() {
        return "Alarm ON";
    }

    static int getCarSize(int x, int y) {
        return x*y;
    }

}
