package homework.day8;

import homework.day8.prep.Fruits;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FruitsTask {
    public static void main(String[] args) {
        ArrayList<Fruits> fruits = new ArrayList<>();
        fruits.add(new Fruits("Яблоко", 120));
        fruits.add(new Fruits("Банан", 80));
        fruits.add(new Fruits("Груша", 150));
        fruits.add(new Fruits("Апельсин", 200));

        for (Fruits f : fruits) {
            System.out.print(f.getName() + " ");
        }
        System.out.println();

        for (Fruits f : fruits) {
            System.out.print(f.getWeight() + " ");
        }
        System.out.println();

        HashMap<Integer, Fruits> fruitsHashMap = new HashMap<>();
        for (int i = 0; i < fruits.size(); i++) {
            fruitsHashMap.put(i, fruits.get(i));
        }

        for (int k : fruitsHashMap.keySet()) {
            System.out.print(k + " ");
        }
        System.out.println();

        for (Fruits f : fruitsHashMap.values()) {
            System.out.print(f + " ");
        }
        System.out.println();

        for (Map.Entry<Integer, Fruits> fruitsEntry : fruitsHashMap.entrySet()) {
            System.out.printf("%d-%s", fruitsEntry.getKey(), fruitsEntry.getValue()+"\n");
        }
    }
}
