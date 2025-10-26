package classwork.day7;

import java.util.ArrayList;
import java.util.List;

public class NewArrayTask {
    public static void main(String[] args) {
        List<String> mylist = new ArrayList<>();

        String[] arr = "мама мыла раму мыла".split(" ");
        for (String i : arr) {
            mylist.add(i);
        }

        for (int i = 0; i < mylist.size(); i++) {
            System.out.println(mylist.get(i));
        }

        System.out.println();

        for (String i : mylist) {
            System.out.println(i);
        }
    }
}