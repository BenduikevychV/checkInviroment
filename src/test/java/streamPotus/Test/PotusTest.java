package streamPotus.Test;


import org.junit.Test;
import streamPotus.comMarcobehler.Child;
import streamPotus.comMarcobehler.Potus;
import streamPotus.comMarcobehler.Wife;


import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PotusTest {

    private List<Wife> wifeOfDonaldTrump = List.of(
            new Wife("Melania", Arrays.asList(new Child("Barron", 12))),
            new Wife("Marla", Arrays.asList(new Child("Tiffany", 24))),
            new Wife("Ivana", Arrays.asList(
                    new Child("Donald Trump Jr", 40),
                    new Child("Ivanka",36),
                    new Child("Eric",34)))

    );

    private List<Potus> potuses = Arrays.asList(
            new Potus("Donald", "Trump",
                    2016, "Republican",wifeOfDonaldTrump),
            new Potus("Barack", "Obama", 2012, "Democratic"),
            new Potus("Barack", "Obama", 2008, "Democratic"),
            new Potus("George W.", "Bush", 2004, "Republican"),
            new Potus("George W.", "Bush", 2000, "Republican"),
            new Potus("Bill", "Clinton", 1996, "Democratic"),
            new Potus("Bill", "Clinton", 1992, "Democratic"),
            new Potus("George H.W.", "Bush", 1988, "Republican"),
            new Potus("Ronald", "Reagan", 1984, "Republican"),
            new Potus("Ronald", "Reagan", 1980, "Republican"),
            new Potus("Jimmy", "Carter", 1980, "Republican")
    );

    @Test
    public void filter_map_limit_distinct_collect() {
        potuses.stream()
                .filter(potus -> potus.getElectionYear() < 2000)
                .map(Potus::getLastName)
                .forEach(System.out::println);

        System.out.println("-----------------------------");
        potuses.stream()
                .filter(potus -> potus.getElectionYear() < 2000)
                .map(Potus::getLastName)
                .distinct()
                .forEach(System.out::println);

        System.out.println("------------------------------");

        Set<String> lastName = potuses.stream()
                .filter(potus -> potus.getElectionYear() < 2000)
                .map(Potus::getLastName)
                .collect(Collectors.toSet());

        lastName.forEach(System.out::println);


        System.out.println("-------------------------------");

        potuses.stream()
                .filter(potus -> potus.getElectionYear() < 2000)
                .map(Potus::getLastName)
                .distinct()
                .limit(3)
                .forEach(System.out::println);

        System.out.println("--------------------------------");

        List<String> lastName2 = potuses.stream()
                .filter(potus -> potus.getElectionYear() < 2000)
                .map(Potus::getLastName)
                .distinct()
                .limit(3)
                .collect(Collectors.toList());

        lastName2.forEach(System.out::println);

    }
    @Test
    public void testList(){
        for (int i=0; i<potuses.size();i++){
            System.out.println(potuses.get(i).getLastName());
        }
    }

    @Test
    public void flatmap_sort_collect(){
        Potus trump = potuses.get(0);

        List<List<Child>> kids = trump.getWife()
                .stream()
                .map(wife -> wife.getChild())
                .collect(Collectors.toList());

        List<Child> kids2 = trump.getWife()
                .stream()
                .flatMap(wife -> wife.getChild().stream())
                .collect(Collectors.toList());

        kids.forEach(System.out::println);
        System.out.println("---------------------------");
        kids2.forEach(System.out::println);

        System.out.println("----------------------");


        List<Child> kids3 = trump.getWife()
                .stream()
                .flatMap(wife -> wife.getChild().stream())
                .sorted(Comparator.comparing(Child::getAge).reversed())
                .collect(Collectors.toList());

        kids3.forEach(System.out::println);

        System.out.println("----------------------------");

        Map<Integer,Child> child4 = trump.getWife()
                .stream()
                .flatMap(wife -> wife.getChild().stream())
                .collect(Collectors.toMap(Child::getAge, Function.identity()));

        System.out.println(child4);

        System.out.println("---------------------------");
        for(Integer age: child4.keySet()){
            System.out.println(age);
            System.out.println(child4.get(age));
        }

    }

    @Test
    public void find_and_match(){
        Potus trump = potuses.get(0);

        Optional<Wife> firstWife = trump.getWife()
                .stream()
                .findFirst();

        System.out.println(firstWife);

        System.out.println("--------------------------------");

        Optional<Wife> firstWife2 = trump.getWife()
                .stream()
                .filter(wife -> wife.getChild().size() >=2)
                .findFirst();
        System.out.println(firstWife2);

        System.out.println("------------------------------");

        boolean doesEveeryWifeHaveMoreThan2Kids = trump.getWife()
                .stream()
                .allMatch(wife -> wife.getChild().size() > 2);

        System.out.println(doesEveeryWifeHaveMoreThan2Kids);

        System.out.println("--------------------------------");


        Predicate<Wife> hasMorethan2Children = wife -> wife.getChild().size() > 2;

        boolean doesEveryWifeHaveMoreThan2Kids2 = wifeOfDonaldTrump.stream()
                .allMatch(hasMorethan2Children);
        System.out.println("all wife have more than two kids: "+doesEveryWifeHaveMoreThan2Kids2);

        System.out.println("-----------------------------------");

        boolean doesAnyWifeHaveMoreThan2Kids = wifeOfDonaldTrump.stream()
                .anyMatch(hasMorethan2Children);
        System.out.println("any wife have more than 2 kids: "+ doesAnyWifeHaveMoreThan2Kids);

        System.out.println("====================================");

        boolean notASingleWifeHasMoreThan2Kids = trump.getWife().stream()
                .noneMatch(hasMorethan2Children);

        System.out.println("none one: "+ notASingleWifeHasMoreThan2Kids);






    }
}
