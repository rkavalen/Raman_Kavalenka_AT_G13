package homework.day10;

import java.util.ArrayList;

public class ButterfliesRunner {
    public static void main(String[] args) {
        ArrayList<String> butterflies = new ArrayList<>();
        butterflies.add("Common blue");
        butterflies.add("Swallowtail");
        butterflies.add("Aglais io");
        butterflies.add("Common blue");

        butterflies.stream()
                .map(string -> "\"" + string + "\"")
                .filter(string -> (string.contains("a") || string.contains("o")))
                .forEach(System.out::println);
    }
}
