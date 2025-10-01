package homework.day5;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class EvenDate {
    public static void printDate(String str) {
        String[] text = str.toLowerCase().split("");
        int counter = 0;
        for (String i : text) {
            if (i.matches("[aoeiuyаоуыэяёюие]")) ;
            counter++;
        }

        LocalDateTime date = LocalDateTime.now().plusDays(counter);

        int day = date.getDayOfMonth();
        int monthNumber = date.getMonthValue();

        String month = "";
        switch (monthNumber) {
            case 1:
                month = "января";
                break;
            case 2:
                month = "февраля";
                break;
            case 3:
                month = "марта";
                break;
            case 4:
                month = "апреля";
                break;
            case 5:
                month = "мая";
                break;
            case 6:
                month = "июня";
                break;
            case 7:
                month = "июля";
                break;
            case 8:
                month = "августа";
                break;
            case 9:
                month = "сентября";
                break;
            case 10:
                month = "октября";
                break;
            case 11:
                month = "ноября";
                break;
            case 12:
                month = "декабря";
                break;
        }

        System.out.printf("Сгенерированная гласная дата: %d %s", day, month);
        System.out.println();
    }
}
