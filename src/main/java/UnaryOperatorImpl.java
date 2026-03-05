import java.util.function.UnaryOperator;

public class UnaryOperatorImpl {
    public static void main(String[] args) {

        UnaryOperator<String> unaryOperator = String::toUpperCase;
        System.out.println(unaryOperator.apply("hello"));

        UnaryOperator <Integer> unaryOperator1 = i -> i*i;
       System.out.println(unaryOperator1.apply(2));


        UnaryOperator<Integer> unaryOperator2 = (i) -> i*i;
        Integer a = unaryOperator2.apply(2);
        System.out.println(a);
    }
}
