package Ciphers;

import java.util.Scanner;

public class Cipher {
//    public static void main(String[] args) {
//
//    }
    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    private static String REPLACEMENT_ALPHABET = "";

    public String encode(String payload) {
        System.out.print("Enter the text you would like to encode: ");
        Scanner input = new Scanner(System.in);
        payload = input.nextLine();

        replaceCharacters(payload, ALPHABET, REPLACEMENT_ALPHABET);

        return replaceCharacters(payload, ALPHABET, REPLACEMENT_ALPHABET);
    }

    public String decode(String payload) {
        System.out.print("Enter the text you would like decoded: ");
        Scanner input = new Scanner(System.in);
        payload = input.nextLine();

        replaceCharacters(payload, REPLACEMENT_ALPHABET, ALPHABET);

        return replaceCharacters(payload, ALPHABET, REPLACEMENT_ALPHABET);
    }

    protected String replaceCharacters(String payload, String source, String target) {
        int indexOfLetterSource = 0;
        String replacePayload = "";
        String replaceLetters = "";
        String currentLetter = "";
        String holdingLetter = "";

        for (int i = 0; i < payload.length(); i++) {
            if (!Character.isLetter(payload.charAt(i))) {
                replaceLetters = replacePayload + String.valueOf(payload.charAt(i));
                replacePayload = replaceLetters;
                continue;

            } else
                indexOfLetterSource = source.indexOf(payload.charAt(i));
                currentLetter = String.valueOf(target.charAt(indexOfLetterSource));
                holdingLetter = currentLetter;
                replacePayload = replaceLetters += holdingLetter;
        }
        System.out.println(replacePayload);
        return replacePayload;
    }


//    public Cipher () {
//
//    }
}
