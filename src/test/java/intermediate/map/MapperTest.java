package intermediate.map;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MapperTest {

    @Test
    void TestCanMapNumbersToAccount() {
        List<Integer> number = List.of(1,2,3,4,5,6,7,8,9,10);
        List<Account> accounts = Mapper.map(number);
        assertNotNull(accounts);
        assertEquals(number.size(), accounts.size());
        for(int i=0;i<number.size();i++){
            assertEquals(number.get(i),accounts.get(i).getBalance().intValue());
        }

    }

}