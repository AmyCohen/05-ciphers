package Ciphers;

import java.util.Scanner;

public class ROT13Cipher extends Cipher{

    public static final String REPLACEMENT_ALPHABET = "nopqrstuvwxyzabcdefghijklm";

    public String encode(String payload) {
        System.out.print("Enter the text you would like to encode: ");
        Scanner input = new Scanner(System.in);

        //take text and change it to the encoded version
        //plain text = "customer's input"
        //encoded version = println of gobbledy-gook

        return "This is not the payload variable. It should be the encoded version of what the user inputted.";
    }

    public String decode(String payload) {
        System.out.print("Enter the text you would like decoded: ");
        Scanner input = new Scanner(System.in);
        payload = input.nextLine();

        //take text and change it to the decoded version
        //cipher text = "customer's gobbledy-gook"
        //decoded version = println of pretty print

        return "This is not the payload variable. It should be the decoded version of what the user inputted.";
    }


    public ROT13Cipher() {
//        public String input;
//        public String response;

    }

}
