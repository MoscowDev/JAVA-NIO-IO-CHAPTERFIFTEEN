import org.junit.jupiter.api.Test;

public class ConsumerImplTest {

    @Test
    public void testDisplayData() {
        String text = """
                Go placidly amidst the noise and haste...............
                """;
        ConsumerImpl.displayData(text);
    }
}
