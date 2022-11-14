package main.java.ds.queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author MiladAhmadi
 * @since 11/8/2022
 **/
public class InJavaQueue {

    Queue<String> simpleQueue;
    Queue<String> cQueue;
    InJavaQueue() {
        simpleQueue = new LinkedList<>();
    }


    public static void main(String[] args) {
        InJavaQueue inJavaQueue = new InJavaQueue();
        inJavaQueue.simpleQueue.add("milad");
        inJavaQueue.simpleQueue.add("navid");
        inJavaQueue.simpleQueue.add("ali");


        System.out.println(inJavaQueue.simpleQueue);

        System.out.println(inJavaQueue.simpleQueue.poll());

        System.out.println(inJavaQueue.simpleQueue.isEmpty());
    }
}
