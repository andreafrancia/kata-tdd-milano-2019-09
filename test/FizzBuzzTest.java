import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void shouldReturnFizzWhenInputIsEqual3() {
        Assert.assertEquals("fizz", say(3));
    }

    @Test
    public void shouldReturnBuzzWhenInputIsEqualTo5() {
        Assert.assertEquals("buzz", say(5));
    }

    @Test
    public void shouldReturn1WhenInputIsEqualTo1() {
        Assert.assertEquals("1", say(1));
    }

    @Test
    public void shouldReturn1WhenInputIsEqualTo4() {
        Assert.assertEquals("4", say(4));
    }

    private String say(int i) {
        if (i == 3) {
            return "fizz";
        }
        if (i == 5) {
            return "buzz";
        }
        return Integer.toString(i);
    }
}
