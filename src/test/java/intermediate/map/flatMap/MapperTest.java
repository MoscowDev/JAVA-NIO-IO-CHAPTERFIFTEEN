package intermediate.map.flatMap;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class MapperTest {

    @Test
    void testCanMapNumbersToLoation() {
        List<List<Integer>> numbers = List.of(List.of(1, 2, 3),
                List.of(4, 5, 6),
                List.of(7, 8, 9),
                List.of(7, 8, 9));
        Set<Location> locations = Mapper.map(numbers);
        assertEquals(numbers.size(), locations.size());
        numbers.stream().flatMap( x->x.stream())
                .forEach((x)->assertEquals(Double.valueOf(x), locations.iterator()
                        .next().getLatitude()));


}

}