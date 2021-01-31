package com.marco;

import com.marcobehler.Child;
import com.marcobehler.Potus;
import com.marcobehler.Wife;
import org.junit.Test;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PotusTest {

    private List<Wife> wifeOfDonaldTrump = Arrays.asList(
            new Wife("Melania", Arrays.asList(new Child("Barron", 12))),
            new Wife("Marla", Arrays.asList(new Child("Teffany", 24))),
            new Wife("Ivana", Arrays.asList(
                    new Child("Donald Trump Jr.", 40),
                    new Child("Ivanka", 36),
                    new Child("Eric", 34)))
    );
    private List<Potus> potuses = Arrays.asList(
            new Potus("Donald", "Trump", 2016, "Republican",
                    wifeOfDonaldTrump),
            new Potus("Barack", "Obama", 2012, "Democratic"),
            new Potus("Barack", "Obama", 2008, "Democratic"),
            new Potus("George", "Bush", 2004, "Republican"),
            new Potus("George", "Bush", 2000, "Republican"),
            new Potus("Bill", "Clinton", 1996, "Democratic"),
            new Potus("Bill", "Clinton", 1992, "Democratic"),
            new Potus("George H.W.", "Bush", 1988, "Republican"),
            new Potus("Ronald", "Reagan", 1984, "Republican"),
            new Potus("Ronald", "Reagan", 1980, "Republican"),
            new Potus("Jimmy", "Carter", 1976, "Democratican")
    );

    @Test
    public void filter_map_limit_distinct_collect() {
//        potuses.stream()
//                .filter(potus -> potus.getElectionYear() < 2000)
//                .map(potus -> potus.getLastName());


        potuses.stream()
                .filter(potus -> potus.getElectionYear() < 2000)
                .map(Potus::getLastName)
                .forEach(System.out::println);

        System.out.println("=================");

        potuses.stream()
                .filter(potus -> potus.getElectionYear() < 2000)
                .map(Potus::getLastName)
                .distinct()
                .forEach(System.out::println);

        System.out.println("=================");

        potuses.stream()
                .filter(potus -> potus.getElectionYear() < 2000)
                .map(Potus::getLastName)
                .distinct()
                .limit(3)
                .forEach(System.out::println);

        System.out.println("-----------------------");

        Set<String> names = potuses.stream()
                .filter(potus -> potus.getElectionYear() < 2000)
                .map(Potus::getLastName)
                .collect(Collectors.toSet());

        names.forEach(System.out::println);
    }

    @Test
    public void flatmap_sort_collect() {
        Potus trump = potuses.get(0);

        List<List<Child>> kids8 = trump.getWife()
                .stream()
                .map(wife -> wife.getChildren())
                .collect(Collectors.toList());


        List<Child> kids = trump.getWife()
                .stream()
                .flatMap(wife -> wife.getChildren().stream())
                .sorted(Comparator.comparing(Child::getAge).reversed())
                .collect(Collectors.toList());

        kids.forEach(System.out::println);

        System.out.println("---------------");
        List<List<Child>> kids2 = trump.getWife()
                .stream()
                .map(wife -> wife.getChildren())
                .collect(Collectors.toList());

        kids2.forEach(System.out::println);

        System.out.println("3333333333333333");

        Map<Integer, Child> kids4 = trump.getWife()
                .stream()
                .flatMap(wife -> wife.getChildren().stream())
                .sorted(Comparator.comparing(Child::getAge).reversed())
                .collect(Collectors.toMap(Child::getAge, Function.identity()));

        System.out.println(kids4);


    }

    @Test
    public void find_and_mattch() {
        Potus trump = potuses.get(0);
        Optional<Wife> firstWife = trump
                .getWife()
                .stream()
                .findFirst();

        System.out.println("first wife is " + firstWife.get().getChildren().get(0).getName());
        System.out.println("------------");
        System.out.println("first wife is " + firstWife);
        System.out.println("--------");
        System.out.println("first wife is " + firstWife.get().getName());

        Optional<Wife> firstWife2 = trump
                .getWife()
                .stream()
                .filter(wife -> wife.getChildren().size() > 2)
                .findFirst();
        System.out.println("firstWife2 = " + firstWife2);

        Predicate<Wife> hasMoreThanOneChildren = wife -> wife.getChildren().size() > 2;
        System.out.println("9999999999ggtttt");

        boolean doesE1 = trump.getWife().stream().allMatch(hasMoreThanOneChildren);
        System.out.println(doesE1);

        boolean doesE2 = trump.getWife().stream().anyMatch(hasMoreThanOneChildren);
        System.out.println(doesE2);

        boolean doesE3 = trump.getWife().stream().noneMatch(hasMoreThanOneChildren);
        System.out.println(doesE3);

        boolean doesEveryWifeHavenMoreThan2Kids = trump
                .getWife()
                .stream()
                .allMatch(wife -> wife.getChildren().size() > 2);
        System.out.println(doesEveryWifeHavenMoreThan2Kids);

        boolean doesEveryWifeHavenMoreThan1Kids = wifeOfDonaldTrump.stream()
                .allMatch(wife -> wife.getChildren().size() > 0);

        System.out.println("========");
        System.out.println(doesEveryWifeHavenMoreThan1Kids);


    }

    @Test
    public void reduce(){
        Potus trump = potuses.get(0);

        int countOfChildren = trump
                .getWife()
                .stream()
                .mapToInt(wife -> wife.getChildren().size())
                .reduce(0,(sum,count) -> sum + count);

        System.out.println(countOfChildren);

    }

    @Test
    public void parallel_streams(){
        Potus trump = potuses.get(0);

        trump
                .getWife()
                .stream()
                .filter(wife -> wife.getName().startsWith("M"))
                .findAny()
                .ifPresent(wife -> System.out.println(wife.getName()));


        trump
                .getWife()
                .parallelStream()
                .filter(wife -> wife.getName().startsWith("M"))
                .findAny()
                .ifPresent(wife -> System.out.println(wife.getName()));


    }


}
