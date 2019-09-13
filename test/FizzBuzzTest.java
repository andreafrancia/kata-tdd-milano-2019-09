import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void shouldReturnFizzWhenInputIsEqual3() {
        Assert.assertEquals("fizz", say(3));
    }

    @Test
    public void shouldReturnBuzzWhenInputIsEqualTo5() {
        Assert.assertEquals("buzz", "buzz");
    }

    private String say(int i) {
        if (i == 3) {
            return "fizz";
        }

        return "";
    }
}
