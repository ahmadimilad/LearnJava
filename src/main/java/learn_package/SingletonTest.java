package main.java.learn_package;

/**
 * @author Milad Ahmadi on 9/16/2021 and 11:24 PM.
 * @project LearnJava
 */
public class SingletonTest {

    static volatile SingletonTest INSTANCE;

    private int countOfGetInstance = 0;
    public SingletonTest() {
        System.out.println("init");
        countOfGetInstance++;
    }

    public static SingletonTest getInstance() {
        synchronized (SingletonTest.class) {
            if (INSTANCE == null){
                INSTANCE = new SingletonTest();
            }
        }
        return INSTANCE;
    }

    private void classInfo() {
        countOfGetInstance++;
        System.out.print("Hi from singleton class!!!    ");
        System.out.printf("Count Of Get Instance: %d \n",countOfGetInstance);
    }

    public static void main(String[] args) {
        SingletonTest.getInstance().classInfo();
        SingletonTest.getInstance().classInfo();
        SingletonTest.getInstance().classInfo();
        SingletonTest.getInstance().classInfo();
    }
}



