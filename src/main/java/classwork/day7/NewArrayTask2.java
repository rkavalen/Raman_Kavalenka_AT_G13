package classwork.day7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class NewArrayTask2 {
    public static void main(String[] args) {
        List<String> mylist1 = new ArrayList<>();
        List<String> mylist2 = new LinkedList<>();

        for (int i = 0; i < 100_000; i++) {
            mylist1.add("мама" + i);
            mylist2.add("мама" + i);
        }

        long t0 = System.currentTimeMillis();
        for (int i = 0; i < mylist1.size(); i++) {
            mylist1.get(i);
        }
        System.out.println(System.currentTimeMillis() - t0);

        t0 = System.currentTimeMillis();
        for (int i = 0; i < mylist2.size(); i++) {
            mylist2.get(i);
        }
        System.out.println(System.currentTimeMillis() - t0);
    }
}
