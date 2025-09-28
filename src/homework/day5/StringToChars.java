package homework.day5;

public class StringToChars {
    private String string;

    public static void stringToChars(String str){
        for (String s : str.split("")) {
            System.out.println(s);
        }
    }
}
