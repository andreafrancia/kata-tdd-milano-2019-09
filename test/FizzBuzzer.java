public class FizzBuzzer {
    public FizzBuzzer() {
    }

    String say(int i) {
        String result = "";

        if ((i % 3) == 0) {
            result += "fizz";
        }

        if ((i % 5) == 0) {
            result += "buzz";
        }

        if ((i % 7) == 0) {
            result += "bang";
        }

        if (result.equals("")) {
            return Integer.toString(i);
        }

        return result;
    }
}