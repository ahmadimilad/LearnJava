package main.java.learn_package;

/**
 * @author Milad Ahmadi on 9/17/2021 and 6:49 PM.
 * @project LearnJava
 */
public class StringTest {

    public StringTest() {
        testStringBuilder();
    }


    private void testStringBuilder() {
        StringBuilder builder = new StringBuilder();
        builder.append(1);
        builder.append("milad");
        builder.append(1.00);
        builder.append(true);
        System.out.println(builder);
    }


    private void testStringBuffer() {
        StringBuffer stringBuffer = new StringBuffer();

    }

    public static void main(String[] args) {
        StringTest stringTest = new StringTest();
    }
}
