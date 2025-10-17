package homework.day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class BirdsRunner {
    public static void main(String[] args) {
        ArrayList<String> birds = new ArrayList<>();
        birds.add("Чайка");
        birds.add("Дрозд");
        birds.add("Бусел");
        birds.add("Голубь");
        birds.add("Воробей");
        birds.add("Цапля");

        Arrays.stream(birds.stream()
                        .map(string -> string.replaceAll("о", "а"))
                        .map(String::toLowerCase)
                        .collect(Collectors.joining(""))
                        .replaceAll("ь", "")
                        .split("б"))
                .forEach(x -> System.out.println("--" + x + "--"));
    }
}
