package main.java;

import main.java.entities.UserEntity;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Milad Ahmadi on 9/16/2021 and 4:44 PM.
 * @project LearnJava
 */

class Utils {
    public static void printMyName(String username) {
        System.out.printf("Your Name is: %s", username);
    }
}





public class TestClass {

    private List<String> strings = new ArrayList<>();
    private int[] myNumber = {1,3,5,5,8,4};

    public List<UserEntity> getSortedUsers(List<UserEntity> users) {
//        Collections.sort(users<UserEntity>);

        return users.stream().sorted(Comparator.comparing(it -> it.age)).collect(Collectors.toList());
    }

    public TestClass() {

    }

    public void testList() {
        strings.add("B");
        strings.add("G");
        strings.add("c");
        strings.add("A");
        strings.forEach(item ->
                System.out.println(item.toLowerCase(Locale.ROOT))
        );
        System.out.println(strings);
        Collections.sort(strings);
        Collections.reverse(strings);
        System.out.println(strings);
    }

    public void testArray() {
        myNumber[1] = 5;
        System.out.println(myNumber[1]);
    }

    public static void main(String[] args) {

        Utils.printMyName("ss");

        TestClass testClass = new TestClass();
        testClass.testList();
//        List<UserEntity> users = new ArrayList<>(UserEntity.sampleUsers(10));
//        Collections.reverse(users);
//        users = testClass.getSortedUsers(users);
//        for (int i=0; i<users.size(); i++) {
//            System.out.println(users.get(i).name);
//        }
//
//
//        testClass.testArray();



    }
}