package homework.day5;

import java.time.LocalDateTime;

public class PrintDataAndTime {
    public static void printDataAndTime() {
        LocalDateTime now = LocalDateTime.now();
        int day = now.getDayOfMonth();
        int monthNumber = now.getMonthValue();
        int year = now.getYear();
        int hours = now.getHour();
        int minutes = now.getMinute();

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

        System.out.printf("Сейчас на дворе: %d %s, %d, %d часа %d минут", day, month, year, hours, minutes);
        System.out.println();
    }
}
