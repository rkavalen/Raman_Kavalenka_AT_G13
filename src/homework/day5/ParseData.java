package homework.day5;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ParseData {
    public static void parseDate(String date) {
        LocalDateTime dateTime = LocalDateTime.parse(date);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM, dd, yyyy, HH:mm");

    }
}
