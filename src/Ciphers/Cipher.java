package Ciphers;

import java.util.Scanner;

public class Cipher {
    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    public static String REPLACEMENT_ALPHABET = "";

    public String encode(String payload) {
        System.out.print("Enter the text you would like to encode: ");
        Scanner input = new Scanner(System.in);
        // I DON'T KNOW IF THIS LINE IS CORRECT. payload = input.nextLine();

        //take text and change it to the encoded version
        //plain text = "customer's input"
        //encoded version = println of gobbledy-gook

        //This method need to invoke the replaceCharacters method
        replaceCharacters(payload, ALPHABET, REPLACEMENT_ALPHABET);

        return "This should be the encoded version of what the user inputted.";
    }

    public String decode(String payload) {
        System.out.print("Enter the text you would like decoded: ");
        Scanner input = new Scanner(System.in);
        // I DON'T KNOW IF THIS LINE IS CORRECT. payload = input.nextLine();

        //take text and change it to the decoded version
        //cipher text = "customer's gobbledy-gook"
        //decoded version = println of pretty print

        //This method need to invoke the replaceCharacters method

        return "This should be the decoded version of what the user inputted.";
    }

    protected String replaceCharacters(String payload, String source, String target) {
        //Payload: *possible answer* what the customer is inputting
        //Source: *possible answer* this should be the ALPHABET
        //Target: *possible answer* this should be the REPLACEMENT_ALPHABET

        int indexOfletterInAlphabet;
        int indexOfLetterInReplaceAlphabet;

        for (int i = 0; i < payload.length(); i++) {

            indexOfletterInAlphabet = payload.indexOf(payload.charAt(i));

        }

        return "i am the replaceCharaters method";
    }

    public Cipher () {

    }
}
