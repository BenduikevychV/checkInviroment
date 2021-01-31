package streamDemo2;

import java.util.*;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {

        List<Person> people = getPeople();

        // Imperative approach
        List<Person> females = new ArrayList<>();

        for (Person person :people){
            if (person.getGender().equals(Gender.FEMALE)) {
                females.add(person);
            }
        }
        females.forEach(System.out::println);

        System.out.println("===========");

        // Declarative approach
        List<Person> females1 = people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .collect(Collectors.toList());
        females1.forEach(System.out:: println);

        System.out.println("============================");

        // Filter

        // Sort
        List<Person> sorted = people.stream()
                .sorted(Comparator.comparing(Person::getAge)
                        .thenComparing(Person::getGender).reversed())
                .collect(Collectors.toList());
        sorted.forEach(System.out::println);

        System.out.println("===========================");

        // All match
        boolean allMatch = people.stream()
                .allMatch(person -> person.getAge() >= 7);

        System.out.println(allMatch);

        System.out.println("===========================");

        // Any match
        boolean anyMatch = people.stream()
                .anyMatch(person -> person.getAge() > 121);
        System.out.println(anyMatch);

        System.out.println("============================");

        // None match
        boolean noneMatch = people.stream()
                .noneMatch(person -> person.getName().equalsIgnoreCase("james Bond"));
        System.out.println(noneMatch);

        System.out.println("++++++++++++++++++++++++");

        // Max
        people.stream()
                .max(Comparator.comparing(Person::getAge))
                .ifPresent(System.out::println);

        System.out.println("=======================");

        // Min
        people.stream()
                .min(Comparator.comparing(Person::getAge))
                .ifPresent(System.out::println);

        System.out.println("=======================");

        // Group
        Map<Gender, List<Person>> groupByGender = people.stream()
                .collect(Collectors.groupingBy(Person::getGender));

        groupByGender.forEach((gender, people1) -> {
            System.out.println(gender);
            people1.forEach(System.out::println);
        } );

        System.out.println("-------------checking value-----------");
        for (Gender sex : groupByGender.keySet()){
            System.out.println(sex);
            for (Person person99 : groupByGender.get(sex)){
                System.out.println(person99);
//                System.out.println(person99.getName());
            }
        }
        System.out.println("-------------checking value------------");


        System.out.println("====================");

        Optional<String> oldestFemaleAge = people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getName);
//        oldestFemaleAge.ifPresent(name -> System.out.println(name));
        oldestFemaleAge.ifPresent(System.out:: println);
    }

    private static List<Person> getPeople(){
        return List.of(
                new Person("james Bond",20,Gender.FEMALE),
                new Person("Alina Smith",33,Gender.FEMALE),
                new Person("Helen White",57,Gender.FEMALE),
                new Person("Alex Box", 14, Gender.MALE),
                new Person("Jamie Goa",99, Gender.MALE),
                new Person("Anna Cook",7,Gender.FEMALE),
                new Person("Zelda Brown", 120, Gender.FEMALE)
        );
    }
    protected void printName(){
        System.out.println("Hello I am here");
    }
}
