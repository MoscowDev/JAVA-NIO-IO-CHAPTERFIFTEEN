package intermediate.map;

import java.math.BigDecimal;
import java.util.List;

public class Mapper {

    public static List<Account> map(List<Integer> number) {

      return   number.stream().map(numbers -> new Account(null, new BigDecimal(numbers)))
                .toList();

    }

}
