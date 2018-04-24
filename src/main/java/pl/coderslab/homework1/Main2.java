package pl.coderslab.homework1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();

        Person person1 = new Person("z", "z");
        Person person2 = new Person("b", "b");
        Person person3 = new Person("f", "f");

        people.add(person1);
        people.add(person2);
        people.add(person3);

     //   List<Person> sorPeople = Collections.sort(people);

        for (Person person: people) {

            System.out.println(person);

        }


    }
}
