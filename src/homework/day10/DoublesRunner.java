package homework.day10;

import homework.day8.prep.Bubble;

import java.util.Random;
import java.util.stream.Stream;

public class DoublesRunner {
    public static void main(String[] args) {
        Random random = new Random();
        Stream<Double> doubles = Stream.of(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9);

        int summed = doubles.map(Math::round)
                .map(i -> random.nextInt(i.intValue()))
                .distinct()
                .map(s -> new Bubble(s, "Bubble vol-" + s))
                .peek(System.out::println)
                .mapToInt(Bubble::getVolume)
                .sum();

        System.out.println(summed);
    }
}
