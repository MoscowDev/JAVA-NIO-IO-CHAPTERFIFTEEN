import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierImpl {
    public static void main(String[] args) {
        Supplier<Integer> supplier = ()-> new Random().nextInt();
        System.out.println(supplier.get());
        Stream.generate(supplier).limit(6).forEach(System.out::println);
    }
}
