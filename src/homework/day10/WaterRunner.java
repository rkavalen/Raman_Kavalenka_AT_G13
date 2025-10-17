package homework.day10;

import homework.day8.prep.Water;

import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WaterRunner {
    public static void main(String[] args) {
        Stream<Water> waterStream = Stream.of(
                new Water("Прозрачная", "Нет"),
                new Water("Прозрачная", "Нет"),
                new Water("Мутная", "Аммиачный"),
                new Water("Синяя", "Мятный")
        );

        System.out.println(waterStream.filter(water -> !"Прозрачная".matches(water.getColor()))
                .sorted(Comparator.comparing(Water::getSmell).reversed())
                .map(s -> new Water(s.getColor(), s.getSmell().replaceAll("ы", "ыы")))
                .map(Water::getSmell)
                .collect(Collectors.joining(""))
                .length());
    }
}
