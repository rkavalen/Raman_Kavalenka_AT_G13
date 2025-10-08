package classwork.day9;

import java.util.ArrayList;
import java.util.Arrays;

public class PersonRunner {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>(Arrays.asList(
                new Person("Вася", 13, Person.Sex.MAN),
                new Person("Катя", 28, Person.Sex.WOMEN),
                new Person("Вова", 24, Person.Sex.MAN),
                new Person("Маша", 38, Person.Sex.WOMEN),
                new Person("Роман Петрович", 72, Person.Sex.MAN)));

        int counter = 0;
        for (Person p : people) {
            if (p.age < 18) continue;
            if (p.sex.equals(Person.Sex.MAN)) {
                if (p.age <= 60) {
                    counter++;
                }
            } else {
                if (p.age <= 55) {
                    counter++;
                }
            }
        }
        System.out.println(counter);

        System.out.println(people.stream().filter(Person -> (Person.age >= 18 && Person.age < 60 && Person.sex.equals(classwork.day9.Person.Sex.MAN))||(Person.age >= 18 && Person.age < 55 && Person.sex.equals(classwork.day9.Person.Sex.WOMEN))).count());
    }
}
