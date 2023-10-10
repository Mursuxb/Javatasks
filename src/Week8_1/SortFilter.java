package Week8_1;

import java.util.Arrays;
import java.util.List;

public class SortFilter {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("John", 20, "New York"),
                new Person("James,", 25, "New York"),
                new Person("Jill", 40, "New York"),
                new Person("Jane", 45, "Madrid"),
                new Person("Jack", 30, "London"),
                new Person("Julia", 35, "London"));

        people.sort((Person a, Person b) ->
                a.age - b.age);
        people.forEach((person) -> System.out.println(person.name + " " + person.age + " " + person.city));
        System.out.println("\n");
        people.forEach((person -> {
            if (person.city.equals("New York")) {
                System.out.println(person.name + " " + person.age + " " + person.city);
            }
        }));
    }


}

