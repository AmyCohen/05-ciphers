package Ciphers;

import java.util.Scanner;

public class KeywordCipher extends Cipher{
    public static String REPLACEMENT_ALPHABET = "";

    public String encode() {
        System.out.println(); //added space for greater readability in the console
        System.out.print("Enter the text you would like to encode: ");
        Scanner encodingInput = new Scanner(System.in);
        String payload = encodingInput.nextLine();
        System.out.println(); //added space for greater readability in the console

        System.out.print("Enter your keyword: ");
        Scanner keywordInput = new Scanner(System.in);
        String keyword = keywordInput.nextLine();
        System.out.println(); //added space for greater readability in the console

        String modifiedKeyword = "";
        for (int i = 0; i < keyword.length(); i++) {
            if(!modifiedKeyword.contains(String.valueOf(keyword.charAt(i)))) {
                modifiedKeyword += String.valueOf(keyword.charAt(i));
            }
        }

        String holdingAlphabet = "";
        for (int i = 0; i < ALPHABET.length(); i++) {
            if(!modifiedKeyword.contains(String.valueOf(ALPHABET.charAt(i)))) {
                holdingAlphabet += String.valueOf(ALPHABET.charAt(i));
            }
        }

        REPLACEMENT_ALPHABET = modifiedKeyword + holdingAlphabet;

        System.out.println(" Standard: " + ALPHABET);
        System.out.println("Encrypted: " + REPLACEMENT_ALPHABET);


        return replaceCharacters(payload, ALPHABET, REPLACEMENT_ALPHABET);
    }

    public String decode() {
        System.out.println(); //added space for greater readability in the console
        System.out.print("Enter the text you would like to decode: ");
        Scanner encodingInput = new Scanner(System.in);
        String payload = encodingInput.nextLine();

        System.out.print("Enter your keyword: ");
        Scanner keywordInput = new Scanner(System.in);
        String keyword = keywordInput.nextLine();


        String modifiedKeyword = "";
        for (int i = 0; i < keyword.length(); i++) {
            if(!modifiedKeyword.contains(String.valueOf(keyword.charAt(i)))) {
                modifiedKeyword += String.valueOf(keyword.charAt(i));
            }
        }

        String holdingAlphabet = "";
        for (int i = 0; i < ALPHABET.length(); i++) {
            if(!modifiedKeyword.contains(String.valueOf(ALPHABET.charAt(i)))) {
                holdingAlphabet += String.valueOf(ALPHABET.charAt(i));
            }
        }

        REPLACEMENT_ALPHABET = modifiedKeyword + holdingAlphabet;

        System.out.println(" Standard: " + ALPHABET);
        System.out.println("Encrypted: " + REPLACEMENT_ALPHABET);

        return replaceCharacters(payload, REPLACEMENT_ALPHABET, ALPHABET);
    }

}
