import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerImpl {
    public static void main(String[] args) {
        BiConsumer <String, String> biConsumer = (String a, String b) -> {
            System.out.println(a + b);
        };
        biConsumer.accept("Hello", "world");

        Map<String, Integer> map = Map.of("ONE",1 ,
        "Two", 2, "Three",3);
                map.forEach((String key, Integer value)-> {
                    System.out.println(key + value);
                });
    }

}
