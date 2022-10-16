package main.java.learn_abstract;

import java.util.regex.Pattern;

public class EmailExtractorReport extends ExtractorReport {
    @Override
    public Pattern getPattern() {
        return  Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
    }

    @Override
    public String getReportName() {
        return "Email Report";
    }


    @Override
    public String cleanResult(String report) {
        return report.toLowerCase();
    }
}
