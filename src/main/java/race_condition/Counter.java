package main.java.race_condition;

/**
 * @author MiladAhmadi
 * @since 10/19/2022
 **/
public class Counter implements Runnable {
    private int c = 0;

    public void increment() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
//Auto-generated catch block
            e.printStackTrace();
        }
        c++;
    }

    public void decrement() {
        c--;
    }

    public int getValue() {
        return c;
    }

    @Override
    public void run() {
        //  by synchronized we implement mutex to solve race condition problem
        synchronized (this) {
//incrementing
            this.increment();
            System.out.println("Value for Thread After increment " + Thread.currentThread().getName() + " " + this.getValue());
//decrementing
            this.decrement();
            System.out.println("Value for Thread at last " + Thread.currentThread().getName() + " " + this.getValue());

        }
    }
}
