import java.util.Objects;
import java.util.function.BinaryOperator;

public class BinaryOperatorImpl {
    public static void main(String[] args) {

        BinaryOperator <Integer> binaryOperator = (i,j) -> i*j;
        binaryOperator.apply(1,2);
       System.out.println(binaryOperator.apply(5,2));



    }
}
