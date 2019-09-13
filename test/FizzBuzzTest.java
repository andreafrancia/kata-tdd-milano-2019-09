import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void something() {
        Assert.assertEquals("fizz", say(3));
    }

    private String say(int i) {
        return "fizz";
    }
}
