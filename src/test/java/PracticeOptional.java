import java.util.Optional;

public class PracticeOptional {

    public static void main(String[] args) {

        Optional<Object> empty = Optional.empty();

        System.out.println(empty);
        System.out.println(empty.isPresent());
        System.out.println(empty.isEmpty());

        System.out.println("============");

        Optional<String> stringValue = Optional.ofNullable(null);

        Optional<String> stringValue1 = Optional.of("hello");

        System.out.println(stringValue);
        System.out.println(stringValue.isPresent());
        System.out.println(stringValue.isEmpty());

        System.out.println("...............");

        String orElse = stringValue
                .map(String::toUpperCase)
                .orElse("world");

        System.out.println(orElse);

        String orElse1 = stringValue1
                .map(String::toUpperCase)
                .orElse("good luck");
        System.out.println(orElse1);

        System.out.println("============}}}}}");

        String orElse2 = stringValue
                .map(String::toUpperCase)
                .orElseThrow(IllegalStateException::new);

        System.out.println(orElse2);
    }
}
