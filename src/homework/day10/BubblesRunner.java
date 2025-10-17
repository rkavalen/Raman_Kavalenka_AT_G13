package homework.day10;

import homework.day8.prep.Bubble;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class BubblesRunner {
    public static void main(String[] args) {
        ArrayList<Bubble> bubbles = new ArrayList<>(Arrays.asList(
                new Bubble(2, "CO2"),
                new Bubble(4, "O2"),
                new Bubble(5, "CO"))
        );

        int volumeSum= bubbles.stream()
                .filter(v -> v.getVolume() > 3)
                .sorted(Comparator.comparing(Bubble::getName))
                .map(s -> new Bubble(s.getVolume() * 3, s.getName()))
                .mapToInt(Bubble::getVolume)
                .sum();

        System.out.println(volumeSum);
    }
}
