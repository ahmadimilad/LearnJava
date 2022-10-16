package main.java.learn_abstract;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;


/**
 * Abstract classes
 *  - cannot be instantiated
 *  Abstract methods
 *  - have no method body
 *  - need to be inside abstract classes or interfaces
 *
 * Avoids code duplication and increases reusability.
 * The purpose of an abstract class is to function as a base
 * for sub_classe.
 *
 *  Encapsulate some common functionality in one place
 *  and let sub_classes implement differences.
 */

public class learnAbstract {
    public static void main(String[] args) throws FileNotFoundException {
        try {
//            URL url = learnAbstract.class.getResource("../test.txt");
////            System.out.println(url);
//            assert url != null;
            new PhoneExtractorReport().prepareAndSendReport("src/main/java/learn_abstract/info.txt");
            new EmailExtractorReport().prepareAndSendReport("src/main/java/learn_abstract/info.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
