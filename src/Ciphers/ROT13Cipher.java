package Ciphers;

import java.util.Scanner;

public class ROT13Cipher extends Cipher{

    public static final String REPLACEMENT_ALPHABET = "nopqrstuvwxyzabcdefghijklm";

    public static String encode(String payload) {
        System.out.print("Enter the text you would like to encode: ");
        Scanner input = new Scanner(System.in);
        return payload = input.nextLine();


    }


    public ROT13Cipher() {
//        public String input;
//        public String response;

    }

}
