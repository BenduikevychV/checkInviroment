package streamsDemo1;

import streamDemo2.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo2 extends Test {

    public static void main(String[] args) {

        List<Person> peop = getPerson();

//        List<Person> hundredClub = new ArrayList<>();
//        for (Person p : peop){
//            if (p.getBillions()>= 100){
//                hundredClub.add(p);
//            }
//        }

        List<Person> hundredClub = peop.stream()
                .filter(person -> person.getBillions() >= 100)
                .collect(Collectors.toList());

       hundredClub.forEach(person -> System.out.println(person.getName()));

        System.out.println("-----------------------------");

       List<Person> sortedList = peop.stream()
               .sorted(Comparator.comparing(person -> person.getName()))
               .collect(Collectors.toList());

       sortedList.forEach(person -> System.out.println(person.getName()));

        System.out.println("=========================");

        List<Person> hundredSortedClub = peop.stream()
                .sorted(Comparator.comparing(person -> person.getName()))
                .filter(person -> person.getBillions() >= 100)
                .collect(Collectors.toList());

        hundredSortedClub.forEach( person -> System.out.println(person.getName()));

        StreamsDemo2 streamsDemo2 = new StreamsDemo2();
        streamsDemo2.goPrint();

    }


//    public static List<Person> getPerson(){
//        List<Person> people = new ArrayList<>();
//
//        people.add(new Person("Warren Bufett",190));
//        people.add(new Person("Jeff Betios",170));
//        people.add(new Person("Bill Gates", 100));
//        people.add(new Person("Mark Zuckerberg", 50));
//
//        return people;
//    }

    public static  List<Person> getPerson(){
        return List.of(
            new Person("Warren Bufett", 190),
            new Person("Jeff Bezos",170),
            new Person("Bill Gates",100),
            new Person("Mark Zucherberg",50)
        );
    }
     void goPrint(){
//         Test t = new Test();
//         t.printName();

         printName();
    }
}
