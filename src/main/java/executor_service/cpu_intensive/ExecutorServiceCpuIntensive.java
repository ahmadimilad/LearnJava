package main.java.executor_service.cpu_intensive;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author MiladAhmadi
 * @since 11/13/2022
 **/
public class ExecutorServiceCpuIntensive {


    public static void main(String[] args) {
        int coreNumber = Runtime.getRuntime().availableProcessors();
        System.out.println("Number of core ---> " + coreNumber);
        ExecutorService executorService = Executors.newFixedThreadPool(coreNumber);
        for (int i = 0; i < 100; i++) {
            executorService.execute(new CpuTask());
        }
        executorService.shutdown();

    }

}

