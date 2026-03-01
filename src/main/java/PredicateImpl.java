import java.util.function.Predicate;

public class PredicateImpl {
    public static void main(String[] args) {

        Predicate<String>predicate = (String s) -> {
            System.out.println("hello");
            return true;
        };
        System.out.println(predicate.test("hello"));
    }
}
