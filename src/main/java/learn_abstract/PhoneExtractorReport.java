package main.java.learn_abstract;

import java.util.regex.Pattern;

public class PhoneExtractorReport extends ExtractorReport{
    @Override
    public Pattern getPattern() {
        return Pattern.compile("^[0-9]*$");
    }

    @Override
    public String getReportName() {
        return "Phone Number";
    }

    @Override
    public String cleanResult(String report) {
        return report;
    }
}
