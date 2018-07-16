package Ciphers;

import java.util.Scanner;

public class Cipher {

    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    public static String REPLACEMENT_ALPHABET = "";
//    public String REPLACEMENT_ALPHABET;

    private String consoleInput = "";
    private Scanner input = new Scanner(System.in);
    private String plainText= input.nextLine();


    public Cipher () {
        System.out.println(); //added space for greater readability in the console

        this.consoleInput = "Enter the text you would like to encode: ";
        this.input = input;
        this.plainText = "";
        this.REPLACEMENT_ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    }

    public String encode(String payload) {
//    public String encode() {
//        System.out.println(); //added space for greater readability in the console
//        System.out.print("Enter the text you would like to encode: ");
//        Scanner input = new Scanner(System.in);
//        String payload = input.nextLine();
        String console =
        payload = this.plainText;

        replaceCharacters(payload, ALPHABET, this.REPLACEMENT_ALPHABET);

        return replaceCharacters(payload, ALPHABET, this.REPLACEMENT_ALPHABET);
    }

    public String decode(String payload) {
        System.out.println(); //added space for greater readability in the console
        System.out.print("Enter the text you would like decoded: ");
        Scanner input = new Scanner(System.in);
        payload = input.nextLine();

        replaceCharacters(payload, this.REPLACEMENT_ALPHABET, ALPHABET);

        return replaceCharacters(payload, this.REPLACEMENT_ALPHABET, ALPHABET);
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
        System.out.println("   Answer: " + replacePayload);
        return replacePayload;
    }

}
