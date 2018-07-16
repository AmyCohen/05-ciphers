package Ciphers;

import java.util.Scanner;

public class ROT13Cipher extends Cipher{

    public static final String REPLACEMENT_ALPHABET = "nopqrstuvwxyzabcdefghijklm";

    public String encode(String payload) {
        return replaceCharacters(payload, ALPHABET, REPLACEMENT_ALPHABET);
    }

    public String decode(String payload) {
        return replaceCharacters(payload,REPLACEMENT_ALPHABET,ALPHABET);
    }
}
