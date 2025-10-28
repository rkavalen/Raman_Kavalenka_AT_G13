package homework.day10;

import java.util.stream.Stream;

public class CountriesRunner {
    public static void main(String[] args) {
        Stream<String> countries = Stream.of("Андора", "Португалия", "Англия", "Замбия");
        countries.filter(s -> s.matches(".*[aoeiuyаоуыэяёюиеAOEIUYАОУЫЭЯЁЮИЕ].*"))
                .filter(s -> s.length() < 7)
                .map(String::toUpperCase)
                .map(string -> "\"" + string + "\"")
                .forEach(System.out::println);
    }
}
