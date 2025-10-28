package homework.day5;

public class StringObjectRunner {
    public static void main(String[] args) {
        StringToCharsNonStatic stc = new StringToCharsNonStatic();
        stc.stringToChars("String to Chars!2 ");

        FindDublicatesNonStatic find = new FindDublicatesNonStatic();
        find.findDublicates("This this is my TEXT text22, tExt.teXt; _Text_");

        FindDigitsNonStatic fd = new FindDigitsNonStatic();
        fd.findDigits("This is 1 my22 text3 3 with digits3 ");

        ParseLogNonStatic pl = new ParseLogNonStatic();
        pl.parseLog("""
                access_log.2020.09.07 212.168.101.5 granted
                access_log.2020.09.07 212.168.101.6 denied
                access_log.2020.09.07 212.168.101.6 denied
                access_log.2020.09.07 212.168.122.6 denied
                access_log.2020.09.07 212.168.101.6 denied
                access_log.2020.09.07 212.168.122.6 granted
                """);

        PrintDataAndTimeNonStatic pd = new PrintDataAndTimeNonStatic();
        pd.printDataAndTime();

        ParseDataNonStatic parseDataNonStatic = new ParseDataNonStatic();
        parseDataNonStatic.parseDate("22.00 07.09.2020");

        EvenDateNonStatic evenDateNonStatic = new EvenDateNonStatic();
        evenDateNonStatic.printDate("aoe");
    }
}
