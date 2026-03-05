import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CustomStreamManager {
    public static void main(String[] args){
        //1. Obtain a stream from a collection
        List<Integer> list =  Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println(list.stream()
                .reduce(Integer::sum));

        //2. Array.stream(T[])
        int [] nums = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.stream(nums).average().orElseThrow());

        //3. stream.of()
        Stream.of(10,20,30,40,50,60,70,80,90).forEach(System.out::println);


        //4. infinite Stream
       // Stream.generate(Math::random).forEach(System.out::println);

    }
}
