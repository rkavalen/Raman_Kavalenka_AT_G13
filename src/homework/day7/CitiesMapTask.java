package homework.day7;

import homework.day7.prep.Cities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class CitiesMapTask {
    public static void main(String[] args) {
        ArrayList<Cities> citiesArrayList = new ArrayList<>();
        citiesArrayList.add(new Cities("Москва", 12000000));
        citiesArrayList.add(new Cities("Нью-Йорк", 8400000));
        citiesArrayList.add(new Cities("Париж", 2200000));

        for (Cities c : citiesArrayList) {
            System.out.print(c.getName() + " ");
        }
        System.out.println();

        for (Cities c : citiesArrayList) {
            System.out.print(c.getPopulation() + " ");
        }
        System.out.println();

        HashMap<String, Cities> citiesHashMap = new HashMap<>();
        for (Cities c : citiesArrayList) {
            citiesHashMap.put(c.getName(), c);
        }

        int population = 0;
        for (Cities c : citiesHashMap.values()) {
            population += c.getPopulation();
        }
        System.out.println(population);
    }
}
