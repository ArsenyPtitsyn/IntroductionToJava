package homework1;

public class RevertWords {
    private static final String EXAMPLE_STRING = "Let it be! Let it be! Let it be! Let it be! whisper words of wisdom let it be";

    public static void main(String[] args) {
        System.out.println(reverseString(EXAMPLE_STRING));
    }

    private static StringBuilder reverseString(String s) {
        String[] wordsFromExampleString = s.split(" ");

        StringBuilder resultString = new StringBuilder();
        int numberOfWords = wordsFromExampleString.length;
        for (int i = 0; i < numberOfWords; i++) {
            resultString.append(wordsFromExampleString[numberOfWords - 1 - i]).append(" ");
        }
        return resultString;
    }
}
