package classwork.day7;

import java.util.HashMap;
import java.util.Map;

public class HashMapTask {
    public static void main(String[] args) {
        String[] arr = "мама мыла раму мыла".split(" ");
        Map<Integer, String> myMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            myMap.put(i, arr[i]);
        }

        for (int key : myMap.keySet()) {
            System.out.println(key);
        }

        for (String value : myMap.values()) {
            System.out.println(value);
        }

        for (Map.Entry<Integer, String> integerStringEntry : myMap.entrySet()) {
            System.out.printf("%d: %s", integerStringEntry.getKey(), integerStringEntry.getValue());
            System.out.println();
        }
    }
}
