package main.java.services.implementation;

import main.java.entities.UserEntity;
import main.java.services.interfaces.UserService;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestMain {


    public static void main(String [] args)
    {
        UserService userService = new UserServiceImpl();
        userService.runSample();
    }


}
