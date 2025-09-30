package homework.day5;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ParseData {
    public static void parseDate(String date) {
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("HH.mm d.MM.yyyy");
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("MMMM, dd, yyyy HH:mm");

        LocalDateTime dateTime = LocalDateTime.parse(date, inputFormatter);
        String outputString = dateTime.format(outputFormatter);

        System.out.println(outputString);
    }
}
