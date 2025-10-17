package homework.day10;

import java.util.Arrays;
import java.util.stream.Stream;

public class ElementsRunner {
    public static void main(String[] args) {
        Stream<String> elements = Stream.of("Text field", "Radio", "Check-box", "Drop-down", "Picker", "Breadcrumb");
        elements.flatMap(s -> Arrays.stream(s.split("[ -]")))
                .map(string -> {
                    string = string.length() % 2 == 0 ? string.replaceAll("e", "o") : String.valueOf(string.length());
                    return string;
                })
                .distinct()
                .forEach(System.out::println);
    }
}
