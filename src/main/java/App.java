package main.java;

import main.java.services.implementation.UserServiceImpl;

public class App {
    public static void main(String[] args) {
        new UserServiceImpl().runSample();
    }
}