package main.java.ds.stack;

import java.util.Stack;

/**
 * @author MiladAhmadi
 * @since 11/8/2022
 **/
public class InJavaStack {

    Stack<Integer> stack;
    public InJavaStack() {
        stack = new Stack<>();
    }


    public static void main(String[] args) {
        InJavaStack inJavaStack = new InJavaStack();

        inJavaStack.stack.push(1);
        inJavaStack.stack.push(2);
        inJavaStack.stack.push(3);
        inJavaStack.stack.push(4);

        inJavaStack.stack.pop();
        System.out.println("\nAfter popping out");

        System.out.println(inJavaStack.stack);
    }
}
