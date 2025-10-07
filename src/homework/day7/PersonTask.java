package homework.day7;

import homework.day7.prep.Person;

import java.util.ArrayList;

public class PersonTask {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person(32, "Коля"));
        people.add(new Person(24, "Оля"));
        people.add(new Person(55, "Вася"));
        people.add(new Person(63, "Маша"));

        for (Person p : people) {
            System.out.print(p.getAge() + " ");
        }
        System.out.println();

        for (Person p : people) {
            System.out.print(p.getName() + " ");
        }
        System.out.println();

        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i).toString());
        }
    }
}
