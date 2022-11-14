package main.java.executor_service.io_intensive;

import main.java.executor_service.cpu_intensive.CpuTask;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author MiladAhmadi
 * @since 11/13/2022
 **/
public class ExecutorServiceIoIntensive {


    public static void main(String[] args) {
//        int coreNumber = Runtime.getRuntime().availableProcessors();
//        System.out.println("Number of core ---> " + coreNumber);
        ExecutorService executorService = Executors.newFixedThreadPool(1000);
        for (int i = 0; i < 100; i++) {
            executorService.execute(new CpuTask());
        }
        executorService.shutdown();

    }

}

