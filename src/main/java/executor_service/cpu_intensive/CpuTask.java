package main.java.executor_service.cpu_intensive;

public class CpuTask implements Runnable {
    @Override
    public void run() {
        System.out.println("CPU task thread --> " + Thread.currentThread().getName());
    }
}
