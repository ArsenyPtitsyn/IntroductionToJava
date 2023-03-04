package homework1;

public class RevertWords {

    public static void main(String[] args) {
        String s1 = "Let it be! Let it be! Let it be! Let it be! whisper words of wisdom let it be";
        System.out.println(reverseString(s1));
    }

    private static String reverseString(String s) {
        String[] wordsFromExampleString = s.split(" ");
        reversArray(wordsFromExampleString);
        return String.join(" ", wordsFromExampleString);
    }

    private static void reversArray(String[] s) {
        String temp;
        for (int i = 0; i < s.length / 2; i++) {
            temp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = temp;
        }
    }
}