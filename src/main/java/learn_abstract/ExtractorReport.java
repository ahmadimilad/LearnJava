package main.java.learn_abstract;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

abstract public class ExtractorReport {

    abstract public Pattern getPattern();
    abstract public String getReportName();
    abstract public String cleanResult(String report);


    public String parse(String filePath) throws FileNotFoundException {
        String out = "";
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);
        if (scanner.hasNext())
            scanner.nextLine();
        else
            return "file is empty";

        while (scanner.hasNext()) {
            String nextLine = scanner.nextLine();
            Matcher matcher = getPattern().matcher(nextLine);

            if (matcher.matches())
                out += cleanResult(nextLine) + "\n";
        }
        return out.isEmpty() ? "out is empty" : out;
    }

    public void prepareAndSendReport(String path) throws FileNotFoundException {
        System.out.println("\nStart report " + getReportName() + "...");
        String report = parse(path);
        System.out.println(report);
        System.out.println("Send report");
    }
}
