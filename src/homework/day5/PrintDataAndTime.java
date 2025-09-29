package homework.day5;

import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class PrintDataAndTime {
    public static void printDataAndTime() {
        Instant now = Instant.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM, yyyy, H часа M минут", Locale.of("ru"));
        System.out.println("Сейчас на дворе: " + formatter.format(now));
    }

    public static void main(String[] args) {
        PrintDataAndTime.printDataAndTime();  // Unsupported field: DayOfMonth
    }
}
