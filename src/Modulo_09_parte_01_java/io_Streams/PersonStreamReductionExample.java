package Modulo_09_parte_01_java.io_Streams;


import java.util.Arrays;
import java.util.List;

public class PersonStreamReductionExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 22),
                new Person("Charlie", 28),
                new Person("David", 25)
        );

        int sumOfAges = people.stream().mapToInt(Person::getAge).sum();

        System.out.println("Soma das idades: " + sumOfAges);
    }
}