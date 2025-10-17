package homework.day10;

import java.util.Arrays;
import java.util.stream.Stream;

public class NumbersModRunner {
    public static void main(String[] args) {
        Stream<Integer> numbersMod = Stream.of(626, 435, 9, 1463268, 24, 2237, 33, 9090);
        numbersMod.map(String::valueOf)
                .filter(s -> s.contains("3"))
                .flatMap(s -> Arrays.stream(s.split("")))
                .map(string -> {
                    switch (string) {
                        case "1":
                            string = "один";
                            break;
                        case "2":
                            string = "два";
                            break;
                        case "3":
                            string = "три";
                            break;
                        case "4":
                            string = "четыре";
                            break;
                        case "5":
                            string = "пять";
                            break;
                        case "6":
                            string = "шесть";
                            break;
                        case "7":
                            string = "семь";
                            break;
                        case "8":
                            string = "восемь";
                            break;
                        case "9":
                            string = "девять";
                            break;
                        case "0":
                            string = "ноль";
                            break;
                    }
                    return string;
                })
                .distinct()
                .sorted((s1, s2) -> s2.compareTo(s1))
                .forEach(System.out::println);
    }
}
