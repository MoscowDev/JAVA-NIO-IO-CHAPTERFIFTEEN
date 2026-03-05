package intermediate.map.flatMap;

import java.util.*;
import java.util.stream.Collectors;

public class Mapper {

    public static Set<Location> map(List<List<Integer>> numbers) {
        Comparator<Location>locationComparator = Comparator.comparing(Location::getLatitude);
        return numbers.stream().flatMap((list) -> list.stream())
                .map((number) ->
                        new Location(number, new Random().nextInt()))
                .collect(Collectors.toCollection(() -> new TreeSet<>(locationComparator)));
    }

}