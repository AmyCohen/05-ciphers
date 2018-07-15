package Ciphers;

import java.util.Scanner;

public class ROT13Cipher extends Cipher{

    public static final String REPLACEMENT_ALPHABET = "nopqrstuvwxyzabcdefghijklm";

    public String encode(String payload) {
        System.out.print("Enter the text you would like to encode: ");
        Scanner input = new Scanner(System.in);
        payload = input.nextLine();

        return replaceCharacters(payload, ALPHABET, REPLACEMENT_ALPHABET);
    }

    public String decode(String payload) {
        System.out.print("Enter the text you would like decoded: ");
        Scanner input = new Scanner(System.in);
        payload = input.nextLine();

        return replaceCharacters(payload,REPLACEMENT_ALPHABET,ALPHABET);
    }


    public ROT13Cipher() {
//        public String input;
//        public String response;

    }

}
