package homework.day10;

import homework.day8.prep.Sand;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class SandRunner {
    public static void main(String[] args) throws IOException {
        ArrayList<Sand> sandbox = new ArrayList<>(Arrays.asList(
                new Sand(12, "Речной"),
                new Sand(8, "Речной"),
                new Sand(15, "Карьерный"),
                new Sand(7, "Карьерный"),
                new Sand(11, "Речной")
        ));

        HashMap<Integer, String> hashMap = (HashMap<Integer, String>) sandbox.stream()
                .filter(s -> s.getWeight() > 9 && s.getName().contains("ч"))
                .sorted(Comparator.comparingInt(Sand::getWeight))
                .map(s -> new Sand(s.getWeight() * 2, s.getName().toUpperCase()))
                .collect(Collectors.toMap(Sand::getWeight, Sand::getName));

        for (Map.Entry<Integer, String> sandEntry : hashMap.entrySet()) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("SandsTask.txt", true))) {
                bw.write(sandEntry.getKey() + ":" + sandEntry.getValue() + "\n");
            }
        }
    }
}
