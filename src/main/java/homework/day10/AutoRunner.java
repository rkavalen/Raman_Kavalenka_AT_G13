package homework.day10;

import java.util.stream.Stream;

public class AutoRunner {
    public static void main(String[] args) {
        Stream<String> auto = Stream.of("Мерс", "Ауди", "Жигуль", "Рено", "Жигуль", "Жигуль", "Ауди");

        auto
//                .peek(System.out::println)
                .distinct()
//                .peek(System.out::println)
                .filter(string -> string.contains("и"))
//                .peek(System.out::println)
                .skip(1)
//                .peek(System.out::println)
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
