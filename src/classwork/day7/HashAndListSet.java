package classwork.day7;

import java.util.*;

public class HashAndListSet {
    public static void main(String[] args) {
        Set<String> mylist1 = new HashSet<>();
        Set<String> mylist2 = new TreeSet<>();

        for (int i = 0; i < 1_000_000; i++) {
            mylist1.add(String.valueOf(i));
            mylist2.add(String.valueOf(i));
        }

        long t0 = System.currentTimeMillis();

        Iterator<String> iterator1 = mylist1.iterator();
        while (iterator1.hasNext()) {
            iterator1.next();
        }
        System.out.println(System.currentTimeMillis() - t0);

        t0 = System.currentTimeMillis();
        Iterator<String> iterator2 = mylist2.iterator();
        while (iterator2.hasNext()) {
            iterator2.next();
        }
        System.out.println(System.currentTimeMillis() - t0);
    }
}
