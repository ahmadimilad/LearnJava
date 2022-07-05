package main.java.services.implementation;

import main.java.entities.UserEntity;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestMain {


    public static void main(String [] args)
    {
        List<UserEntity> userEntities = UserEntity.sampleUsers(5);


        userEntities.forEach(userEntity -> print(userEntity.name));

        List<UserEntity> sortedDec = userEntities.stream()
                                                .sorted(Comparator.comparing(userEntity -> userEntity.name , Comparator.reverseOrder()))
                .collect(Collectors.toList());

        sortedDec.forEach(userEntity -> print(userEntity.name));

        print("salam");

        int index =45;

        for (int localIndex = 0; localIndex < index ; localIndex++) {
            print("user" + localIndex);
        }


    }

    private static void print(String salam) {
        System.out.println(salam);
    }
}
