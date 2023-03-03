package homework1;

public class RevertWords {
    private static final String exampleString = "Let it be! Let it be! Let it be! Let it be! whisper words of wisdom let it be";

    public static void main(String[] args) {
        String[] wordsFromExampleString = exampleString.split(" ");

        StringBuilder resultString = new StringBuilder();
        int numberOfWords = wordsFromExampleString.length;
        for (int i = 0; i < numberOfWords; i++) {
            resultString.append(wordsFromExampleString[numberOfWords - 1 - i]).append(" ");
        }
        System.out.println(resultString);
    }
}
