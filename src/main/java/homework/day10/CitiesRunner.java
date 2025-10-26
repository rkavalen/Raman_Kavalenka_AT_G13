package homework.day10;

import java.util.ArrayList;

public class CitiesRunner {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Минск");
        cities.add("Москва");
        cities.add("Берлин");

        System.out.println(cities
                .stream()
                .mapToInt(String::length)
                .sum());
    }
}
