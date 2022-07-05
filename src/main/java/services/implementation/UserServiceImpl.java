package main.java.services.implementation;

import main.java.configurations.Config;
import main.java.entities.UserEntity;
import main.java.services.interfaces.UserService;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class UserServiceImpl implements UserService {

    public void runSample() {
        List<UserEntity> users = UserEntity.sampleUsers(Config.NUMBER_OF_SAMPLES);

        List<UserEntity> filteredUsers = users.stream()
                .filter(user -> user.age > 10)
                .collect(Collectors.toList());

        List<UserEntity> sortedUsers = filteredUsers.stream()
                .sorted(Comparator.comparing((UserEntity user) -> user.age, Comparator.reverseOrder())
                        .thenComparing(user -> user.salary)
                        .thenComparing(user -> user.height))
                .collect(Collectors.toList());

        List<Integer> integerList = sortedUsers.stream().map(user -> user.age + user.salary + user.height)
                .collect(Collectors.toList());

        log(users, "Original");
        log(filteredUsers, "Filtered");
        log(sortedUsers, "Sorted");
        log(integerList, "RowSum");
    }
}