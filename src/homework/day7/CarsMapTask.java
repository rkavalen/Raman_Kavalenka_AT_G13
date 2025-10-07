package homework.day7;

import homework.day7.prep.Cars;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CarsMapTask {
    public static void main(String[] args) {
        ArrayList<Cars> carsArrayList = new ArrayList<>();
        carsArrayList.add(new Cars("Toyota", "Corolla"));
        carsArrayList.add(new Cars("Ford", "Mustang"));
        carsArrayList.add(new Cars("BMW", "X5"));

        for (Cars c : carsArrayList) {
            System.out.printf("%s:%s\n", c.getBrand(), c.getModel());
        }

        HashMap<String, Cars> carsMap = new HashMap<>();
        for (Cars c : carsArrayList) {
            carsMap.put(c.getBrand(), c);
        }

        for (String k : carsMap.keySet()) {
            System.out.print(k + " ");
        }
        System.out.println();

        for (Cars c : carsMap.values()) {
            System.out.print(c + " ");
        }
        System.out.println();

        for (Map.Entry<String, Cars> carsEntry : carsMap.entrySet()) {
            System.out.printf("%s-%s\n", carsEntry.getKey(), carsEntry.getValue());
        }
    }
}
