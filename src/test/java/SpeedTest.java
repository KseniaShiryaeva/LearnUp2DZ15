import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SpeedTest {

    @Test
    public void shouldFindMax () {
        int[] speed = {6, 4, 10 };
        int expected = 10;
        int actual = Light.light (speed);
        Assertions.assertEquals(expected, actual);
    }
}
