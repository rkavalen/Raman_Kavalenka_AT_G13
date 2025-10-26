package classwork.day7;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTask {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        String[] str = "мама мыла раму мыла".split(" ");

        Collections.addAll(set, str);

        for (String string : set) {
            System.out.println(string);
        }
        System.out.println();

        Iterator<String> iterator= set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
