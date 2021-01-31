package practiceListStreamtoMap;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class LamdaFromSomeMan {

    public static void main(String[] args) {

        List<Student> students = findSudentList();

//        Map<String, Student> studentMap = students.stream()
//                .collect(Collectors.toMap(Student::getName, Function.identity()));
//        System.out.println(studentMap);
//        System.out.println(studentMap.getClass());

        System.out.println("====================");
        Map<String, Student> studentMap1 = students.stream()
                .collect(Collectors
                .toMap(Student::getName,
                        Function.identity(),
                        (a,b)-> b
                ));
        System.out.println(studentMap1);
        System.out.println(studentMap1.getClass());

        System.out.println("====================");

        Map<String, Student> studentMap3 = students.stream()
                .collect(Collectors
                .toMap(Student::getName, Function.identity(),
                        (a,b) -> b,
                        LinkedHashMap::new
                ));

        System.out.println(studentMap3);
        System.out.println(studentMap3.getClass());
    }

    private static List<Student> findSudentList() {
        List<Student> studends = new ArrayList<>();
        studends.add(new Student("Shane", 35, "123-333-4344"));
        studends.add(new Student("Nick", 12, "123-333-4849"));
        studends.add(new Student("Chiayi", 12, "123-333-4045"));
        studends.add(new Student("Nick", 13, "100-333-4849"));
        studends.add(new Student("ting-hui", 35, "123-333-4242"));

        return studends;
    }
}
