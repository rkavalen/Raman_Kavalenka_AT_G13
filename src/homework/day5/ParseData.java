package homework.day5;

import java.text.DateFormat;
import java.time.Instant;
import java.time.format.DateTimeFormatter;

public class ParseData {
    public static void parseDate(String date) {
//        String[] arr = date.split(" |.");
//        String hour = arr[0];
//        String minute = arr[1];
//        String day = arr[2];
//        String monthNumber = arr[3];
//        String year = arr[4];
//
//        DateFormat.get
//        String month = "";
//        switch (monthNumber) {
//            case 1: month="January";break;
//            case 1: month="February";break;
//            case 1: month="March";break;
//            case 1: month="January";break;
//            case 1: month="January";break;
//            case 1: month="January";break;
//            case 1: month="January";break;
//            case 1: month="January";break;
//            case 1: month="January";break;
//            case 1: month="January";break;
//            case 1: month="January";break;
//            case 1: month="January";break;
//        }
//
//        "22.00 07.09.2020"

        DateTimeFormatter df = DateTimeFormatter.ofPattern("HH.mm d.M.yyyy");

        Instant dateTime = Instant.parse(date);
        DateTimeFormatter df2 = DateTimeFormatter.ofPattern("MMMM, dd, yyyy HH:mm");
        String dateTime2= df2.format(dateTime);
        System.out.println(dateTime2);
    }
}
