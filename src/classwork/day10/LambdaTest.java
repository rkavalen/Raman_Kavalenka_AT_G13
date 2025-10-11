package classwork.day10;

import classwork.day9.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaTest {
    public static void main(String[] args) {
        List<String> l = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");
        ArrayList<Person> p = new ArrayList<>(Arrays.asList(
                new Person("Вася", 13, Person.Sex.MAN),
                new Person("Катя", 28, Person.Sex.WOMEN),
                new Person("Вова", 24, Person.Sex.MAN),
                new Person("Маша", 38, Person.Sex.WOMEN),
                new Person("Роман Петрович", 72, Person.Sex.MAN)));

        System.out.println(l.stream().anyMatch("мама"::equals));
        System.out.println(l.stream().allMatch(s -> s.contains("м")));
        System.out.println(l.stream().map(string -> string + 'м').toList());
        System.out.println(l.stream()
                .flatMap(string -> Arrays.stream(string.split("а")))
                .filter(s -> !s.isEmpty()).toList());
        System.out.println(l.stream().sorted().toList());
        System.out.println(l.stream().sorted((x, y) -> -x.compareTo(y)).distinct().toList());
        System.out.println(p.stream().sorted((x, y) -> {
            if (x.sex != y.sex) {
                return x.sex.compareTo(y.sex);
            } else {
                return x.age - y.age;
            }
        }).toList());
        System.out.println(
                l.stream().flatMap((s) -> Arrays.stream(s.split("")))
                        .peek(System.out::println)
                        .max(String::compareTo)
                        .get());
        System.out.println(p.stream().min(Comparator.comparingInt((p1) -> p1.age)).get());
        System.out.println(l.stream().flatMap(s -> Arrays.stream(s.split(""))).count());
        System.out.println(l.stream().map(String::length).reduce(Integer::sum).get());
        System.out.println(l.stream().mapToInt(String::length).sum());
        System.out.println(l.stream().mapToInt(String::length).filter(i -> i % 2 == 1).sum());
        System.out.println(l.stream().map(String::length).mapToInt(i -> i % 2 == 1 ? i : 0).sum());
    }
}
