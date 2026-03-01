import java.util.function.BiPredicate;

public class BiPredicateImpl {
    public static void main(String[] args) {

        BiPredicate <Integer,String> biPredicate = (Integer i, String s) -> {
            System.out.println( "hello");
            return true;

        };
        System.out.println(biPredicate.test(1,"hello"));

    }
}
