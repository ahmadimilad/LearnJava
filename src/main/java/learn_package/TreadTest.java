package main.java.learn_package;

/**
 * @author Milad Ahmadi on 9/16/2021 and 11:20 PM.
 * @project LearnJava
 */
class ThreadTestWithExtend extends Thread {
    public void run() {
        try {
            Thread.sleep(5000);
            System.out.println("ThreadTest");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class ThreadTestWithRunnable implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("ThreadTestWithRunnable");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}



class ThreadTest {


    public static void main(String[] args) {
        ThreadTestWithExtend threadTestWithExtend = new ThreadTestWithExtend();
        Thread threadTestWithRunnable = new Thread(new ThreadTestWithRunnable());

        threadTestWithExtend.start();
        threadTestWithRunnable.start();

        threadTestWithRunnable.setPriority(1);
        threadTestWithExtend.setPriority(2);

        try {
            // Wait to complete threadTestWithRunnable task and then go next execution
            threadTestWithRunnable.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
