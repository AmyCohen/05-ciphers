package Ciphers;

import java.util.Scanner;

public class KeywordCipher extends Cipher{
    public static String REPLACEMENT_ALPHABET = "";



//    public KeywordCipher(String keyword) {
//
//    }

    public String encode() {

        System.out.print("Enter the text you would like to encode: ");
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
        int keywordLength = modifiedKeyword.length();

        String abcPart1 = ALPHABET.substring(keywordLength);
        System.out.println(abcPart1);
        System.out.println(keywordLength);
        REPLACEMENT_ALPHABET = abcPart1 + modifiedKeyword;

        System.out.println(ALPHABET);
        System.out.println(REPLACEMENT_ALPHABET);

        return replaceCharacters(payload, ALPHABET, REPLACEMENT_ALPHABET);
    }

    public String decode() {

        System.out.print("Enter the text you would like to encode: ");
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
        int keywordLength = modifiedKeyword.length();

        String abcPart1 = ALPHABET.substring(keywordLength);
        REPLACEMENT_ALPHABET = abcPart1 + modifiedKeyword;

        return replaceCharacters(payload, REPLACEMENT_ALPHABET, ALPHABET);
    }

}
