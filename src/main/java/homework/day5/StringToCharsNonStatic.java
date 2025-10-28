package homework.day5;

public class StringToCharsNonStatic {
    private String string;

    public void stringToChars(String str){
        for (String s : str.split("")) {
            System.out.println(s);
        }
    }
}
