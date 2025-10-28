package homework.day10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class NumbersModRunner {
    public static void main(String[] args) {
        Stream<Integer> numbersMod = Stream.of(626, 435, 9, 1463268, 24, 2237, 33, 9090);
        numbersMod.map(String::valueOf)
                .filter(s -> s.contains("3"))
                .flatMap(s -> Arrays.stream(s.split("")))
                .map(digit -> switch (digit) {
                    case "1" -> "один";
                    case "2" -> "два";
                    case "3" -> "три";
                    case "4" -> "четыре";
                    case "5" -> "пять";
                    case "6" -> "шесть";
                    case "7" -> "семь";
                    case "8" -> "восемь";
                    case "9" -> "девять";
                    case "0" -> "ноль";
                    default -> digit;
                })
                .distinct()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}
