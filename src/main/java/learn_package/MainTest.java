package main.java.learn_package;

import java.util.Scanner;

/**
 * @author Milad Ahmadi on 9/16/2021 and 11:18 PM.
 * @project LearnJava
 */

public class MainTest {
    public static void main(String []argh) {

        Scanner s = new Scanner(System.in);
        int count = 1;

        while(s.hasNext()) {
            String ns = s.nextLine();
            System.out.println(count + " " + ns);
            count++;
        }
    }

}
