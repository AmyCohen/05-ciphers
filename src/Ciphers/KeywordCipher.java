package Ciphers;

import java.util.Scanner;

public class KeywordCipher extends Cipher{

    public static String REPLACEMENT_ALPHABET = "";
    private String keyword;

    public KeywordCipher(String keyword) {
        this.keyword = keyword;
        }

    public String encode(String payload) {

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

    public String decode(String payload) {

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
