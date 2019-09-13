import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    private final FizzBuzzer fizzBuzzer = new FizzBuzzer();

    @Test
    public void shouldReturnFizzWhenInputIsEqual3() {
        Assert.assertEquals("fizz", fizzBuzzer.say(3));
    }

    @Test
    public void shouldReturnBuzzWhenInputIsEqualTo5() {
        Assert.assertEquals("buzz", fizzBuzzer.say(5));
    }

    @Test
    public void shouldReturn1WhenInputIsEqualTo1() {
        Assert.assertEquals("1", fizzBuzzer.say(1));
    }

    @Test
    public void shouldReturn1WhenInputIsEqualTo4() {
        Assert.assertEquals("4", fizzBuzzer.say(4));
    }

    @Test
    public void shoudReturnFizzBuzzWhenInputIsEqualTo15() {
        Assert.assertEquals("fizzbuzz", fizzBuzzer.say(15));
    }

    @Test
    public void shouldReturnFizzWhenInputIsEqualTo6() {
        Assert.assertEquals("fizz", fizzBuzzer.say(6));
    }

    @Test
    public void shouldReturnBuzzWhenInputIsEqualTo10() {
        Assert.assertEquals("buzz", fizzBuzzer.say(10));
    }

    @Test
    public void shouldReturnBuzzWhenInputIsEqualTo7() {
        Assert.assertEquals("bang", fizzBuzzer.say(7));
    }

    private String say(int i) {

        return fizzBuzzer.say(i);
    }
}
