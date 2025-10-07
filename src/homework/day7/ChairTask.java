package homework.day7;

import homework.day7.prep.Chair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ChairTask {
    public static void main(String[] args) {
        Chair[] chairs = {new Chair(1, 2),
                new Chair(4, 2),
                new Chair(2, 4)};

        ArrayList<Chair> chairArrayList = new ArrayList<>(Arrays.asList(chairs));
        for (Chair c : chairArrayList) {
            System.out.print(c.getHeight() * c.getWidth() + " ");
        }
        System.out.println();

        HashMap<Integer, Chair> chairMap = new HashMap<>();
        for (int i = 0; i < chairArrayList.size(); i++) {
            chairMap.put(i, chairArrayList.get(i));
        }

        for (int i : chairMap.keySet()) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (Chair c : chairMap.values()) {
            System.out.print(c + " ");
        }
        System.out.println();

        for (Map.Entry<Integer, Chair> mapEntry : chairMap.entrySet()){
            System.out.println(mapEntry.getKey() + "-" + mapEntry.getValue());
        }
    }
}
