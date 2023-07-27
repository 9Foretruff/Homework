package Zoom;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class Test888 {
    public static void main(String[] args) {
        Month month = Month.AUGUST;
        String monthName = month.getDisplayName(TextStyle.FULL, Locale.getDefault());
        String dateString = "2006" + monthName + "06";

        LocalDate parse = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("yyyyMMMMdd"));
        System.out.println(parse);
    }
}
