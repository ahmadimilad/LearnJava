package main.java.learn_package;

import main.java.entities.UserEntity;

/**
 * @author Milad Ahmadi on 9/19/2021 and 12:41 AM.
 * @project LearnJava
 */

enum DataState {
    SUCCESS,
    ERROR
}

public class GenericsTest<T> {

    T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T printSomething() {
        return value;
    }

    public static void main(String[] args) {
        GenericsTest<Integer> genericsTest = new GenericsTest<>();

        genericsTest.setValue(12);

        System.out.printf("Call return: %d",genericsTest.printSomething());



    }


}
