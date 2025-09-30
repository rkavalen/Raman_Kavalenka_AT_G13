package homework.day5;

public class StringStaticRunner {
    public static void main(String[] args) {
        StringToChars.stringToChars("String to Chars!2 ");
        FindDublicates.findDublicates("This this is my TEXT text22, tExt.teXt; _Text_");
        FindDigits.findDigits("This is 1 my22 text3 3 with digits3 ");
        ParseLog.parseLog("""
                access_log.2020.09.07 212.168.101.5 granted
                access_log.2020.09.07 212.168.101.6 denied
                access_log.2020.09.07 212.168.101.6 denied
                access_log.2020.09.07 212.168.122.6 denied
                access_log.2020.09.07 212.168.101.6 denied
                access_log.2020.09.07 212.168.122.6 granted
                """);
        PrintDataAndTime.printDataAndTime();
        ParseData.parseDate("22.00 07.09.2020");

    }
}
