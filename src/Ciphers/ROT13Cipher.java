package Ciphers;

import java.util.Scanner;

public class ROT13Cipher extends Cipher{

    public static final String REPLACEMENT_ALPHABET = "nopqrstuvwxyzabcdefghijklm";

    public String encode() {
        System.out.println(); //added space for greater readability in the console
        System.out.print("Enter the text you would like to encode: ");
        Scanner input = new Scanner(System.in);
        String payload = input.nextLine();

        return replaceCharacters(payload, ALPHABET, REPLACEMENT_ALPHABET);
    }

    public String decode() {
        System.out.println(); //added space for greater readability in the console
        System.out.print("Enter the text you would like decoded: ");
        Scanner input = new Scanner(System.in);
        String payload = input.nextLine();

        return replaceCharacters(payload,REPLACEMENT_ALPHABET,ALPHABET);
    }
}
