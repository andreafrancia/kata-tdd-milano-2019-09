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

    @Test
    public void shoudReturnFizzBuzzWhenInputIsEqualTo15() {
        Assert.assertEquals("fizzbuzz",say(15));
    }

    private String say(int i) {
        String result = "";

        if ((i % 3)==0) {
            result += "fizz";
        }

        if ((i % 5) == 0) {
            result += "buzz";
        }

        if (result.equals("")) {
            return Integer.toString(i);
        }

        return result;
    }
}
