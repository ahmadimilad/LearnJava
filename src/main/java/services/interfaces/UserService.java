package main.java.services.interfaces;

import main.java.entities.UserEntity;

import java.util.List;

public interface UserService {
    void runSample();

    default <T> void log(List<T> inputList, String source) {
        System.out.println(source + " Size: " + inputList.size());
        inputList.forEach(item -> {
            if (item instanceof UserEntity) {
                UserEntity u = (UserEntity) item;
                System.out.println(
                        u.name + ", age: " + u.age +
                                ", height: " + u.height + ", salary: " + u.salary
                );
            } else if (item instanceof Integer) {
                int rowSum = (Integer) item;
                System.out.println("Sum: " + rowSum);
            }
        });
    }
}
