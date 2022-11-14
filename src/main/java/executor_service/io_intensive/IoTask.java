package main.java.executor_service.io_intensive;

public class IoTask implements Runnable {
    @Override
    public void run() {
        System.out.println("IO task thread --> " + Thread.currentThread().getName());
    }
}
