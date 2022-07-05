package main.java.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UserEntity {


    public String name;
    public int age;
    public int salary;
    public int height;

    public static List<UserEntity> sampleUsers(int numberOfSamples) {
        final List<UserEntity> users = new ArrayList<>();

        for (int index = 1; index <= numberOfSamples; index++) {
            UserEntity user = new UserEntity();
            Random random = new Random();
            int seed = 1 + random.nextInt(20);
            user.name = "user-" + index;
            user.age = 1 + random.nextInt(seed * 2);
            user.salary = 1 + random.nextInt(seed * 10);
            user.height = 1 + random.nextInt(seed * 5);
            users.add(user);
        }

        return users;
    }


}
