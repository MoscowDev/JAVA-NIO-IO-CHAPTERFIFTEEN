import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Example {
    public static void main(String[] args)

    {
        Comparator<Integer> DescendingOrder =(Integer x , Integer y)->{
            if (x>y) return -1;
            else if(x<y) return 1;
            else return 0;
        };
        System.out.println(DescendingOrder);
     Set<Integer> numbers = new TreeSet<>( DescendingOrder );
     numbers.add(1);
     numbers.add(40);
     numbers.add(350);
     numbers.add(2);
     numbers.add(3);

        System.out.println(numbers);
    }

}
