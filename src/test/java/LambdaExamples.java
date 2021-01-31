import java.util.Comparator;

public class LambdaExamples {

    public static void main(String[] args) {

        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };



//        int comparison = stringComparator.compare("hello","world");
        int comparison = stringComparator.compare("world","hello");
        System.out.println(comparison);

        Comparator<String> stringComparatorLambda=
                (String o1, String o2)  -> {return o1.compareTo(o2); };

        int lambdaCompariseon = stringComparatorLambda.compare("hello","world");

        System.out.println(lambdaCompariseon);
    }
}
