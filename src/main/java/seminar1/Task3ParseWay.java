package seminar1;

public class Task3ParseWay {
    public static void main(String[] args) {
        String a =   "11000111010101110";
        String b = "1000001111100111011";
        System.out.println(binarySum(a, b));
    }

    private static String binarySum(String a, String b) {
        int firstNumber = Integer.parseInt(a, 2);
        int secondNumber = Integer.parseInt(b, 2);
        return Integer.toBinaryString(firstNumber + secondNumber);
    }
}
