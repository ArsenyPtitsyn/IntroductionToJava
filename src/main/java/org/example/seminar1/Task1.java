package org.example.seminar1;

public class Task1 {

    public static void main(String[] args) {
        String s = "Hello   world. This is  my  first program";
        System.out.println(reverseString(s));
    }

    private static String reverseString(String s) {
        String[] wordsOfString = s.split("\\s+");
        reverseWords(wordsOfString);
        return String.join(" ", wordsOfString);
    }

    private static void reverseWords(String[] words) {
        for (int i = 0; i < words.length / 2; i++) {
            String temp = words[i];
            words[i] = words[words.length - 1 - i];
            words[words.length - 1 - i] = temp;
        }
    }
}
