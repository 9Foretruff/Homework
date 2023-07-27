package Zoom;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.chrono.JapaneseChronology;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Datess {
    public static void main(String[] args) {
        Date date = new Date(123,5,9);
        System.out.println(date);

        Calendar calendar = Calendar.getInstance();
        JapaneseChronology japaneseChronology = JapaneseChronology.INSTANCE;
        System.out.println(japaneseChronology.dateNow());

        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
//        DateFormat dateFormat = new SimpleDateFormat("dd");
//        dateFormat.format(date);

//
//        LocalDate localDate = LocalDate.of(2023, 6 , 9);
//        System.out.println(localDate.format(DateTimeFormatter.ofPattern("yyyy")));
//
//        ZonedDateTime  zonedDateTime = ZonedDateTime.now();
//        System.out.println(zonedDateTime);


        LocalDate parse = LocalDate.parse("2006", DateTimeFormatter.ofPattern("yyyy"));
        System.out.println(parse);

//        try {
//            // создаем формат, в котором будем парсить дату
//            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
//            Date date1 = dateFormat.parse("9.3.1814");
//            Date date2 = dateFormat.parse("10.03.1961");
//
//            System.out.println("Перша дата: " + date1);
//            System.out.println("Друга дата: " + date2);
//
//            long milliseconds = date2.getTime() - date1.getTime();
//            System.out.println("\nРізниця в міллесекундах: " + milliseconds);
//
//            // 1000 миллисекунд = 1 секунда
//            int seconds = (int) (milliseconds / (1000));
//            System.out.println("Різниця в секундах: " + seconds);
//
//            // 60 000 миллисекунд = 60 секунд = 1 минута
//            int minutes = (int) (milliseconds / (60 * 1000));
//            System.out.println("Різниця в мінутах: " + minutes);
//
//            // 3 600 секунд = 60 минут = 1 час
//            int hours = (int) (milliseconds / (60 * 60 * 1000));
//            System.out.println("Різниця в часах: " + hours);
//
//            // 24 часа = 1 440 минут = 1 день
//            int days = (int) (milliseconds / (24 * 60 * 60 * 1000));
//            System.out.println("Різниця в днях: " + days);
//
//        } catch (Exception e) {

//            e.printStackTrace();
//        }



    }
}
