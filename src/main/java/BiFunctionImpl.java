import java.util.function.BiFunction;

public class BiFunctionImpl {
    public static void main(String[] args) {

        BiFunction<String,Integer,String>biFunction =  (key,value)->{
            System.out.println(key + value);

            return key + value;
        };
        System.out.println(biFunction.apply("hello",1));
    }
}
