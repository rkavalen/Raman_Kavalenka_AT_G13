package homework.day10;

import homework.day8.prep.Person;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class PersonRunner {
    public static void main(String[] args) throws IOException {
        Stream<Person> people = Stream.of(
                new Person(32, "Коля"),
                new Person(24, "Оля"),
                new Person(55, "Вася"),
                new Person(63, "Маша")
        );

        OptionalDouble avg = people.filter(s -> s.getAge() < 60)
                .sorted(Comparator.comparing(Person::getName))
                .map(s -> new Person(s.getAge() + 4, s.getName()))
                .mapToInt(Person::getAge)
                .average();

        System.out.println(avg.getAsDouble());
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("NewTextFile.txt"))) {
            bw.write(String.valueOf(avg.getAsDouble()));
        }
    }
}
