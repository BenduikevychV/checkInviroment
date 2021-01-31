package MyFirstJavaStreams;


import practiceDefaultAcces.Practice.One;

import java.util.*;
import java.util.stream.Collectors;

public class Test {


    public static void main(String[] args) {

        List<Person> people = getPeople();

        // Imperative approach
        /*List<Person> females = new ArrayList<>();

        for (Person person : people){
            if (person.getGender().equals(Gender.FEMALE)){
               females.add(person);
            }
        }
        females.forEach(System.out::println);

         */

        // Declarative approach


        // Filter
        List<Person> females = people.stream().filter(person -> person.getGender().equals(Gender.FEMALE))
                .collect(Collectors.toList());

        females.forEach(System.out::println);

        System.out.println("+++++++++++++");

        // Sort
        List<Person> sorted = people.stream()
                .sorted(Comparator.comparing(Person::getAge).reversed().thenComparing(Person::getGender))
                .collect(Collectors.toList());

        people.forEach(System.out::println);
        System.out.println("-------------");
        sorted.forEach(System.out::println);


        // All match
        boolean allMatch = people.stream()
                .allMatch(person -> person.getAge() > 8);

        System.out.println(allMatch);

        System.out.println("<--------------->");
        // Any match
        boolean anyMatch = people.stream()
                .anyMatch(person -> person.getAge() > 121);

        System.out.println(anyMatch);

        System.out.println(".--------------.");
        // Nome mattch
        boolean noneMatch = people.stream()
                .noneMatch(person -> person.getName().equals("Antonio"));

        System.out.println(noneMatch);

        System.out.println("//////////////////");

        // Max
        people.stream()
                .max(Comparator.comparing(Person::getAge))
                .ifPresent(person -> {System.out.println(person);});

        System.out.println("================");

        // Min
        people.stream()
                .min(Comparator.comparing(Person::getAge))
                .ifPresent( System.out::println);

        people.stream()
                .min(Comparator.comparing(Person::getAge))
                .ifPresent(person -> System.out.println(person));

        System.out.println("-----------------");


        // Group
        Map<Gender, List<Person>> groupByGender = people.stream()
                .collect(Collectors.groupingBy(Person::getGender));

//        groupByGender.forEach((gender, people1) -> {
//            System.out.println(gender);
//            people1.forEach(System.out::println);
//            System.out.println();
//        });

        Optional<String> oldestFemaleAge = people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getName);

        oldestFemaleAge.ifPresent(System.out::println);
    }

    private static List<Person> getPeople(){
        return List.of(
                new Person("Antonio", 20, Gender.MALE),
                new Person("Alina Smith", 33, Gender.FEMALE),
                new Person("Helen White",57, Gender.FEMALE),
                new Person("Alex Boz", 14, Gender.MALE),
                new Person("Jamie Goa", 99, Gender.MALE),
                new Person("Anna Cook", 7, Gender.FEMALE),
                new Person("Zelda Brown", 120, Gender.FEMALE)
        );
    }

//    private static List<Person> getPeople(){
//        List people = new ArrayList();
//
//                people.add(new Person("James Bond", 20, Gender.MALE));
//                people.add(new Person("Alina Smith", 33, Gender.FEMALE));
//                people.add(new Person("Helen White",57, Gender.FEMALE));
//                people.add(new Person("Alex Boz", 14, Gender.MALE));
//                people.add(new Person("Jamie Goa", 99, Gender.MALE));
//                people.add(new Person("Anna Cook", 7, Gender.FEMALE));
//                people.add(new Person("Zelda Brown", 120, Gender.FEMALE));
//           return people;
//    }



}
