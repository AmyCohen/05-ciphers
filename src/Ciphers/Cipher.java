package Ciphers;

import java.util.Scanner;

public class Cipher {
    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    public static String encode(String payload) {
        System.out.print("Enter the text you would like to encode: ");
        Scanner input = new Scanner(System.in);
        return payload = input.nextLine();


    }
    public static String decode(String payload) {
        return "i am the decode method.";
    }

    protected String replaceCharacters(String payload, String source, String target) {
        return "i am the replaceCharaters method";
    }

    public Cipher () {

    }
}
