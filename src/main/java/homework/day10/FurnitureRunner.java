package homework.day10;

import homework.day8.prep.Bubble;
import homework.day8.prep.Chair;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FurnitureRunner {
    public static void main(String[] args) throws IOException {
        Stream<Chair> furniture = Stream.of(
                new Chair(120, 40),
                new Chair(90, 30),
                new Chair(100, 50),
                new Chair(110, 45)
        );

        furniture.filter(s -> s.getHeight() >= 100 && s.getWidth() <= 50)
                .sorted((x, y) -> x.getHeight() != y.getHeight() ? x.getHeight() - y.getHeight() : y.getWidth() - x.getWidth())
                .map(s -> new Chair(s.getHeight() / 2, s.getWidth() * (new Random().nextInt(6) + 3)))
                .mapToInt(s -> s.getWidth() * s.getHeight())
                .distinct()
                .max()
                .ifPresent(maxV -> {
                    Bubble b1 = new Bubble(maxV, Arrays.stream(String.valueOf(maxV).split(""))
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
                            .collect(Collectors.joining(" ")));

                    try (BufferedWriter bw = new BufferedWriter(new FileWriter("Furniture.txt"))) {
                        bw.write(String.valueOf(b1));
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                });
    }
}