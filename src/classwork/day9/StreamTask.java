package classwork.day9;

import java.util.Arrays;
import java.util.List;

public class StreamTask {
    public static void main(String[] args) {
        List<String> l = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");

        int counter = 0;
        for (String s : l) {
            if (s.equals("мама")) {
                counter++;
            }
        }
        System.out.println(counter);

        System.out.println(l.stream().filter(s -> s.equals("мама")).count());
        System.out.println(l.stream().filter("мама"::equals).count());

        System.out.println(l.stream().findFirst().orElse("мама"));
        System.out.println(l.stream().filter("мама"::equals).findFirst().get());
        System.out.println(l.stream().skip(4).findFirst().get());
        System.out.println(l.stream().skip(2).limit(2).toList());
        System.out.println(l.stream().filter(s -> s.contains("м")).distinct().toList());
    }
}
