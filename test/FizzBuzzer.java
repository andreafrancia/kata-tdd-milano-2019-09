public class FizzBuzzer {

    private String parola;

    private int num;

    public FizzBuzzer() {
    }

    public FizzBuzzer(int i, String parola) {
        this.num=i;
        this.parola=parola;
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

        if (this.parola != null) {

        }

        if (result.equals("")) {
            return Integer.toString(i);
        }

        return result;
    }
}