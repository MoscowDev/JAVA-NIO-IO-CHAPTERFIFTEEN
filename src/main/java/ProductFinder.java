import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ProductFinder {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5,6,7,8,9,10);

            Integer result = list.stream().reduce(1, (x, y) -> x*y);
        System.out.println(result);
    }
}
