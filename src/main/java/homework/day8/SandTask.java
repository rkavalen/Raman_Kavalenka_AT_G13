package homework.day8;

import homework.day8.prep.Sand;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SandTask {
    public static void main(String[] args) {
        ArrayList<Sand> sands = new ArrayList<>();
        sands.add(new Sand(2, "Речной"));
        sands.add(new Sand(4, "Речной"));
        sands.add(new Sand(2, "Карьерный"));
        sands.add(new Sand(7, "Речной"));

        for (Sand sand : sands) {
            System.out.print(sand.getWeight() + " ");
        }
        System.out.println();

        for (Sand sand : sands) {
            System.out.print(sand.getName() + " ");
        }
        System.out.println();

        HashMap<Integer, Sand> sandsMap = new HashMap<>();
        for (int i = 0; i < sands.size(); i++) {
            sandsMap.put(i, sands.get(i));
        }

        for (int k : sandsMap.keySet()) {
            System.out.println(k);
        }

        for (Sand s : sandsMap.values()) {
            System.out.println(s);
        }

        for (Map.Entry<Integer, Sand> sandMap : sandsMap.entrySet()) {
            System.out.println(sandMap.getKey() + "-" + sandMap.getValue());
        }
    }
}

